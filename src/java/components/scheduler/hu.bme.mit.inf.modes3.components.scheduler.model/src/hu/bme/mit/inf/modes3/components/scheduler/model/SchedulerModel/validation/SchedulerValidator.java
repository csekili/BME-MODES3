/**
 *
 * $Id$
 */
package hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.validation;

import hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Route;
import hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Schedule;
import hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Station;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Scheduler}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SchedulerValidator {
	boolean validate();

	boolean validateRoutes(EList<Route> value);
	boolean validateSchedule(Schedule value);
	boolean validateStations(EList<Station> value);
}
