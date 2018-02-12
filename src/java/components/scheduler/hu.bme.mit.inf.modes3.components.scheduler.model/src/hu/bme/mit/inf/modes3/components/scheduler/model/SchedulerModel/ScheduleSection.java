/**
 */
package hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getSupposedDeparture <em>Supposed Departure</em>}</li>
 *   <li>{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getActualDeparture <em>Actual Departure</em>}</li>
 *   <li>{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getRoute <em>Route</em>}</li>
 *   <li>{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getNext <em>Next</em>}</li>
 *   <li>{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerPackage#getScheduleSection()
 * @model
 * @generated
 */
public interface ScheduleSection extends EObject {
	/**
	 * Returns the value of the '<em><b>Supposed Departure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supposed Departure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supposed Departure</em>' attribute.
	 * @see #setSupposedDeparture(Date)
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerPackage#getScheduleSection_SupposedDeparture()
	 * @model required="true"
	 * @generated
	 */
	Date getSupposedDeparture();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getSupposedDeparture <em>Supposed Departure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supposed Departure</em>' attribute.
	 * @see #getSupposedDeparture()
	 * @generated
	 */
	void setSupposedDeparture(Date value);

	/**
	 * Returns the value of the '<em><b>Actual Departure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Departure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Departure</em>' attribute.
	 * @see #setActualDeparture(Date)
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerPackage#getScheduleSection_ActualDeparture()
	 * @model
	 * @generated
	 */
	Date getActualDeparture();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getActualDeparture <em>Actual Departure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Departure</em>' attribute.
	 * @see #getActualDeparture()
	 * @generated
	 */
	void setActualDeparture(Date value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference.
	 * @see #setRoute(Route)
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerPackage#getScheduleSection_Route()
	 * @model required="true"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getRoute <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(ScheduleSection)
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerPackage#getScheduleSection_Next()
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	ScheduleSection getNext();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(ScheduleSection value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(ScheduleSection)
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerPackage#getScheduleSection_Previous()
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getNext
	 * @model opposite="next"
	 * @generated
	 */
	ScheduleSection getPrevious();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(ScheduleSection value);

} // ScheduleSection
