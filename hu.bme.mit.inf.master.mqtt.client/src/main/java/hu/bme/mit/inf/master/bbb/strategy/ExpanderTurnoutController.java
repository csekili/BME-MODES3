package hu.bme.mit.inf.master.bbb.strategy;

import hu.bme.mit.inf.master.bbb.conf.ExpanderControllerConfiguration;
import hu.bme.mit.inf.master.bbb.conf.IControllerConfiguration;
import hu.bme.mit.inf.master.bbb.utils.HexConversionUtil;
import static hu.bme.mit.inf.mqtt.common.data.Command.SEND_TURNOUT_STATUS;
import hu.bme.mit.inf.mqtt.common.data.Section;
import hu.bme.mit.inf.mqtt.common.data.SectionStatus;
import hu.bme.mit.inf.mqtt.common.data.Turnout;
import hu.bme.mit.inf.mqtt.common.data.TurnoutStatus;
import static hu.bme.mit.inf.mqtt.common.data.TurnoutStatus.STRAIGHT;
import hu.bme.mit.inf.mqtt.common.network.MQTTPublisherSubscriber;
import static hu.bme.mit.inf.mqtt.common.network.PayloadHelper.sendCommandWithContent;
import static hu.bme.mit.inf.mqtt.common.util.logging.LogManager.logException;
import io.silverspoon.bulldog.core.Signal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author benedekh
 */
public class ExpanderTurnoutController extends AbstractControllerStrategy implements IControllerConfiguration {

    protected Thread turnoutDirectionUpdater;
    protected ExpanderControllerConfiguration controllerConf;

    protected Map<String, TurnoutStatus> latestTurnoutStatus;
    protected Map<String, TurnoutStatus> formerTurnoutStatus;

    public ExpanderTurnoutController(final MQTTPublisherSubscriber mqttPublisher) {
        try {
            controllerConf = new ExpanderControllerConfiguration();
        } catch (Exception ex) {
            logException(getClass().getName(), ex);
        }

        latestTurnoutStatus = new ConcurrentHashMap<>();
        formerTurnoutStatus = new ConcurrentHashMap<>();

        for (String to : controllerConf.getAllTurnout()) {
            TurnoutStatus defaultDirection = STRAIGHT;
            latestTurnoutStatus.put(to, defaultDirection);
            formerTurnoutStatus.put(to, defaultDirection);
            publishTurnoutStatus(to, defaultDirection, mqttPublisher);
        }

        // turnout direction updater
        turnoutDirectionUpdater = new Thread(new Runnable() {
            @Override
            public void run() {
                updateTurnoutDirection(mqttPublisher);
            }
        });

        turnoutDirectionUpdater.start();
    }

    @Override
    protected TurnoutStatus onGetTurnoutStatus(int turnoutId) {
        return latestTurnoutStatus.get(HexConversionUtil.fromNumber(turnoutId));
    }

    @Override
    public boolean controllerManagesTurnout(Turnout turnout) {
        return controllerConf.controllerManagesTurnout(turnout);
    }

    @Override
    protected SectionStatus onGetSectionStatus(int sectionId) {
        throw new UnsupportedOperationException(
                "ExpanderTurnoutController does not support section operations");
    }

    @Override
    protected void onEnableSection(int sectionId) {
        throw new UnsupportedOperationException(
                "ExpanderTurnoutController does not support section operations");
    }

    @Override
    protected void onDisableSection(int sectionId) {
        throw new UnsupportedOperationException(
                "ExpanderTurnoutController does not support section operations");
    }

    @Override
    public boolean controllerManagesSection(Section section) {
        throw new UnsupportedOperationException(
                "ExpanderTurnoutController does not support section operations");
    }

    private void updateTurnoutDirection(MQTTPublisherSubscriber mqttPublisher) {
        while (!Thread.interrupted()) {
            for (String to : controllerConf.getAllTurnout()) {
                String[] pins = controllerConf.getTurnoutExpander(to);
                if (getPinLevel(pins[0]) == Signal.High) {
                    latestTurnoutStatus.put(to, TurnoutStatus.STRAIGHT);
                }
                if (getPinLevel(pins[1]) == Signal.High) {
                    latestTurnoutStatus.put(to, TurnoutStatus.DIVERGENT);
                }

                TurnoutStatus latest = latestTurnoutStatus.get(to);
                TurnoutStatus former = formerTurnoutStatus.get(to);

                if (latest != former) {
                    formerTurnoutStatus.put(to, latest);
                    publishTurnoutStatus(to, latest, mqttPublisher);
                }
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                logException(getClass().getName(), e);
                Thread.currentThread().interrupt();
            }
        }
    }

    private void publishTurnoutStatus(String id, TurnoutStatus status,
            MQTTPublisherSubscriber mqttPublisher) {
        Turnout turnout = new Turnout(HexConversionUtil.fromString(id));
        turnout.setStatus(status);
        sendCommandWithContent(SEND_TURNOUT_STATUS, turnout, mqttPublisher);
    }

}
