/**
 */
package hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Schedule#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerPackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerPackage#getSchedule_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScheduleEntry> getEntries();

} // Schedule
