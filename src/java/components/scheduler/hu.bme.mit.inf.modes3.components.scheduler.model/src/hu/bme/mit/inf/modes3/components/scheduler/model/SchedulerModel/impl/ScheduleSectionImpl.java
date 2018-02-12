/**
 */
package hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl;

import hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Route;
import hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection;
import hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleSectionImpl#getSupposedDeparture <em>Supposed Departure</em>}</li>
 *   <li>{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleSectionImpl#getActualDeparture <em>Actual Departure</em>}</li>
 *   <li>{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleSectionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleSectionImpl#getNext <em>Next</em>}</li>
 *   <li>{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleSectionImpl#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleSectionImpl extends MinimalEObjectImpl.Container implements ScheduleSection {
	/**
	 * The default value of the '{@link #getSupposedDeparture() <em>Supposed Departure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupposedDeparture()
	 * @generated
	 * @ordered
	 */
	protected static final Date SUPPOSED_DEPARTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupposedDeparture() <em>Supposed Departure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupposedDeparture()
	 * @generated
	 * @ordered
	 */
	protected Date supposedDeparture = SUPPOSED_DEPARTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualDeparture() <em>Actual Departure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualDeparture()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACTUAL_DEPARTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualDeparture() <em>Actual Departure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualDeparture()
	 * @generated
	 * @ordered
	 */
	protected Date actualDeparture = ACTUAL_DEPARTURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected Route route;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected ScheduleSection next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected ScheduleSection previous;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulerPackage.Literals.SCHEDULE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSupposedDeparture() {
		return supposedDeparture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupposedDeparture(Date newSupposedDeparture) {
		Date oldSupposedDeparture = supposedDeparture;
		supposedDeparture = newSupposedDeparture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SCHEDULE_SECTION__SUPPOSED_DEPARTURE, oldSupposedDeparture, supposedDeparture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getActualDeparture() {
		return actualDeparture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualDeparture(Date newActualDeparture) {
		Date oldActualDeparture = actualDeparture;
		actualDeparture = newActualDeparture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SCHEDULE_SECTION__ACTUAL_DEPARTURE, oldActualDeparture, actualDeparture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getRoute() {
		if (route != null && route.eIsProxy()) {
			InternalEObject oldRoute = (InternalEObject)route;
			route = (Route)eResolveProxy(oldRoute);
			if (route != oldRoute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SCHEDULE_SECTION__ROUTE, oldRoute, route));
			}
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route basicGetRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(Route newRoute) {
		Route oldRoute = route;
		route = newRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SCHEDULE_SECTION__ROUTE, oldRoute, route));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleSection getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (ScheduleSection)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SCHEDULE_SECTION__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleSection basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(ScheduleSection newNext, NotificationChain msgs) {
		ScheduleSection oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.SCHEDULE_SECTION__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(ScheduleSection newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, SchedulerPackage.SCHEDULE_SECTION__PREVIOUS, ScheduleSection.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, SchedulerPackage.SCHEDULE_SECTION__PREVIOUS, ScheduleSection.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SCHEDULE_SECTION__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleSection getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (ScheduleSection)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulerPackage.SCHEDULE_SECTION__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleSection basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(ScheduleSection newPrevious, NotificationChain msgs) {
		ScheduleSection oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchedulerPackage.SCHEDULE_SECTION__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(ScheduleSection newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, SchedulerPackage.SCHEDULE_SECTION__NEXT, ScheduleSection.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, SchedulerPackage.SCHEDULE_SECTION__NEXT, ScheduleSection.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulerPackage.SCHEDULE_SECTION__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULE_SECTION__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, SchedulerPackage.SCHEDULE_SECTION__PREVIOUS, ScheduleSection.class, msgs);
				return basicSetNext((ScheduleSection)otherEnd, msgs);
			case SchedulerPackage.SCHEDULE_SECTION__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, SchedulerPackage.SCHEDULE_SECTION__NEXT, ScheduleSection.class, msgs);
				return basicSetPrevious((ScheduleSection)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULE_SECTION__NEXT:
				return basicSetNext(null, msgs);
			case SchedulerPackage.SCHEDULE_SECTION__PREVIOUS:
				return basicSetPrevious(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULE_SECTION__SUPPOSED_DEPARTURE:
				return getSupposedDeparture();
			case SchedulerPackage.SCHEDULE_SECTION__ACTUAL_DEPARTURE:
				return getActualDeparture();
			case SchedulerPackage.SCHEDULE_SECTION__ROUTE:
				if (resolve) return getRoute();
				return basicGetRoute();
			case SchedulerPackage.SCHEDULE_SECTION__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case SchedulerPackage.SCHEDULE_SECTION__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULE_SECTION__SUPPOSED_DEPARTURE:
				setSupposedDeparture((Date)newValue);
				return;
			case SchedulerPackage.SCHEDULE_SECTION__ACTUAL_DEPARTURE:
				setActualDeparture((Date)newValue);
				return;
			case SchedulerPackage.SCHEDULE_SECTION__ROUTE:
				setRoute((Route)newValue);
				return;
			case SchedulerPackage.SCHEDULE_SECTION__NEXT:
				setNext((ScheduleSection)newValue);
				return;
			case SchedulerPackage.SCHEDULE_SECTION__PREVIOUS:
				setPrevious((ScheduleSection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULE_SECTION__SUPPOSED_DEPARTURE:
				setSupposedDeparture(SUPPOSED_DEPARTURE_EDEFAULT);
				return;
			case SchedulerPackage.SCHEDULE_SECTION__ACTUAL_DEPARTURE:
				setActualDeparture(ACTUAL_DEPARTURE_EDEFAULT);
				return;
			case SchedulerPackage.SCHEDULE_SECTION__ROUTE:
				setRoute((Route)null);
				return;
			case SchedulerPackage.SCHEDULE_SECTION__NEXT:
				setNext((ScheduleSection)null);
				return;
			case SchedulerPackage.SCHEDULE_SECTION__PREVIOUS:
				setPrevious((ScheduleSection)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchedulerPackage.SCHEDULE_SECTION__SUPPOSED_DEPARTURE:
				return SUPPOSED_DEPARTURE_EDEFAULT == null ? supposedDeparture != null : !SUPPOSED_DEPARTURE_EDEFAULT.equals(supposedDeparture);
			case SchedulerPackage.SCHEDULE_SECTION__ACTUAL_DEPARTURE:
				return ACTUAL_DEPARTURE_EDEFAULT == null ? actualDeparture != null : !ACTUAL_DEPARTURE_EDEFAULT.equals(actualDeparture);
			case SchedulerPackage.SCHEDULE_SECTION__ROUTE:
				return route != null;
			case SchedulerPackage.SCHEDULE_SECTION__NEXT:
				return next != null;
			case SchedulerPackage.SCHEDULE_SECTION__PREVIOUS:
				return previous != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (supposedDeparture: ");
		result.append(supposedDeparture);
		result.append(", actualDeparture: ");
		result.append(actualDeparture);
		result.append(')');
		return result.toString();
	}

} //ScheduleSectionImpl
