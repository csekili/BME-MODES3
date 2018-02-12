/**
 */
package hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Scheduler#getRoutes <em>Routes</em>}</li>
 *   <li>{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Scheduler#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Scheduler#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerPackage#getScheduler()
 * @model
 * @generated
 */
public interface Scheduler extends EObject {
	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Route}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerPackage#getScheduler_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(Schedule)
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerPackage#getScheduler_Schedule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schedule getSchedule();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Scheduler#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Schedule value);

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Station}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference list.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerPackage#getScheduler_Stations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Station> getStations();

} // Scheduler
