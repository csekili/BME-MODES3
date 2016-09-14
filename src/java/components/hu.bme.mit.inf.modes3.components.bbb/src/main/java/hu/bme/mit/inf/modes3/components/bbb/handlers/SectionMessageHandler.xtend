package hu.bme.mit.inf.modes3.components.bbb.handlers;

import hu.bme.mit.inf.modes3.components.bbb.strategy.ISegmentControllerStrategy
import hu.bme.mit.inf.modes3.messaging.communication.command.interfaces.ISegmentCommandListener
import hu.bme.mit.inf.modes3.messaging.communication.command.interfaces.ITrackElementCommandCallback
import hu.bme.mit.inf.modes3.messaging.communication.enums.SegmentState

/**
 * This class transmits the received section commands to the actual
 * actuators, so the respective sections can be managed (enabled / disabled) or
 * theirs statuses can be queried.
 * 
 * @author benedekh, hegyibalint
 */
package class SectionMessageHandler implements ISegmentCommandListener {

	// the actuator that can access the referred section
	protected val ISegmentControllerStrategy sectionController

	new(ITrackElementCommandCallback commandCallback, ISegmentControllerStrategy _sectionController) {
		sectionController = _sectionController
		commandCallback.segmentCommandListener = this
	}

	/**
	 * If the embedded controller manages the referred section, then this section will be enabled.
	 * 
	 * @param sectionId the section's ID that should be enabled
	 */
	private def handleLineEnable(int sectionId) {
		if (sectionController.controllerManagesSection(sectionId)) {
			sectionController.enableSection(sectionId)
		}
	}

	/**
	 * If the embedded controller manages the referred section, then this section will be disabled.
	 * 
	 * @param sectionId the section's ID that should be disabled
	 */
	private def handleLineDisable(int sectionId) {
		if (sectionController.controllerManagesSection(sectionId)) {
			sectionController.disableSection(sectionId)
		}
	}

	override onSegmentCommand(int id, SegmentState state) {
		switch (state) {
			case SegmentState.ENABLED: handleLineEnable(id)
			case SegmentState.DISABLED: handleLineDisable(id)
			default: return
		}
	}

}
