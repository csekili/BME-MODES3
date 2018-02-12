/**
 */
package hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel;

import hu.bme.mit.inf.modes3.components.safetylogic.systemlevel.model.RailRoadModel.Segment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Station#getPlace <em>Place</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerPackage#getStation()
 * @model
 * @generated
 */
public interface Station extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Segment)
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerPackage#getStation_Place()
	 * @model required="true"
	 * @generated
	 */
	Segment getPlace();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Station#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Segment value);
} // Station
