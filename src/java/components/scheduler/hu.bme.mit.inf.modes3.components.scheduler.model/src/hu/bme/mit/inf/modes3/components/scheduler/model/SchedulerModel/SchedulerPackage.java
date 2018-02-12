/**
 */
package hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.SchedulerFactory
 * @model kind="package"
 * @generated
 */
public interface SchedulerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SchedulerModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://hu.bme.mit.inf.schedulermodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SchedulerModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulerPackage eINSTANCE = hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleImpl
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.NamedElementImpl
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleEntryImpl <em>Schedule Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleEntryImpl
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getScheduleEntry()
	 * @generated
	 */
	int SCHEDULE_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__SECTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__FROM = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__TO = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__TRAIN = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__FIRST = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY__LAST = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Schedule Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Schedule Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_ENTRY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleSectionImpl <em>Schedule Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleSectionImpl
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getScheduleSection()
	 * @generated
	 */
	int SCHEDULE_SECTION = 2;

	/**
	 * The feature id for the '<em><b>Supposed Departure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_SECTION__SUPPOSED_DEPARTURE = 0;

	/**
	 * The feature id for the '<em><b>Actual Departure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_SECTION__ACTUAL_DEPARTURE = 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_SECTION__ROUTE = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_SECTION__NEXT = 3;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_SECTION__PREVIOUS = 4;

	/**
	 * The number of structural features of the '<em>Schedule Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_SECTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Schedule Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.RouteImpl
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__PATHS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__FIRST = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__LAST = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.StationImpl
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__PLACE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerImpl <em>Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerImpl
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getScheduler()
	 * @generated
	 */
	int SCHEDULER = 5;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__ROUTES = 0;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__SCHEDULE = 1;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__STATIONS = 2;

	/**
	 * The number of structural features of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.RouteElementImpl <em>Route Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.RouteElementImpl
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getRouteElement()
	 * @generated
	 */
	int ROUTE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT__PATH = 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT__PREVIOUS = 2;

	/**
	 * The number of structural features of the '<em>Route Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Route Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Schedule#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Schedule#getEntries()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_Entries();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleEntry <em>Schedule Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Entry</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleEntry
	 * @generated
	 */
	EClass getScheduleEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleEntry#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleEntry#getSections()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EReference getScheduleEntry_Sections();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleEntry#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleEntry#getFrom()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EReference getScheduleEntry_From();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleEntry#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleEntry#getTo()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EReference getScheduleEntry_To();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleEntry#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Train</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleEntry#getTrain()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EReference getScheduleEntry_Train();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleEntry#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleEntry#getFirst()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EReference getScheduleEntry_First();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleEntry#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleEntry#getLast()
	 * @see #getScheduleEntry()
	 * @generated
	 */
	EReference getScheduleEntry_Last();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection <em>Schedule Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Section</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection
	 * @generated
	 */
	EClass getScheduleSection();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getSupposedDeparture <em>Supposed Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supposed Departure</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getSupposedDeparture()
	 * @see #getScheduleSection()
	 * @generated
	 */
	EAttribute getScheduleSection_SupposedDeparture();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getActualDeparture <em>Actual Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Departure</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getActualDeparture()
	 * @see #getScheduleSection()
	 * @generated
	 */
	EAttribute getScheduleSection_ActualDeparture();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getRoute()
	 * @see #getScheduleSection()
	 * @generated
	 */
	EReference getScheduleSection_Route();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getNext()
	 * @see #getScheduleSection()
	 * @generated
	 */
	EReference getScheduleSection_Next();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.ScheduleSection#getPrevious()
	 * @see #getScheduleSection()
	 * @generated
	 */
	EReference getScheduleSection_Previous();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Route#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Route#getPaths()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Paths();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Route#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Route#getFirst()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_First();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Route#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Route#getLast()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Last();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Station#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Station#getPlace()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_Place();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Scheduler
	 * @generated
	 */
	EClass getScheduler();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Scheduler#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Scheduler#getRoutes()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Routes();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Scheduler#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schedule</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Scheduler#getSchedule()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Schedule();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Scheduler#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.Scheduler#getStations()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Stations();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.RouteElement <em>Route Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Element</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.RouteElement
	 * @generated
	 */
	EClass getRouteElement();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.RouteElement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.RouteElement#getNext()
	 * @see #getRouteElement()
	 * @generated
	 */
	EReference getRouteElement_Next();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.RouteElement#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.RouteElement#getPath()
	 * @see #getRouteElement()
	 * @generated
	 */
	EReference getRouteElement_Path();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.RouteElement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.RouteElement#getPrevious()
	 * @see #getRouteElement()
	 * @generated
	 */
	EReference getRouteElement_Previous();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchedulerFactory getSchedulerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleImpl
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__ENTRIES = eINSTANCE.getSchedule_Entries();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleEntryImpl <em>Schedule Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleEntryImpl
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getScheduleEntry()
		 * @generated
		 */
		EClass SCHEDULE_ENTRY = eINSTANCE.getScheduleEntry();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_ENTRY__SECTIONS = eINSTANCE.getScheduleEntry_Sections();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_ENTRY__FROM = eINSTANCE.getScheduleEntry_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_ENTRY__TO = eINSTANCE.getScheduleEntry_To();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_ENTRY__TRAIN = eINSTANCE.getScheduleEntry_Train();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_ENTRY__FIRST = eINSTANCE.getScheduleEntry_First();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_ENTRY__LAST = eINSTANCE.getScheduleEntry_Last();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleSectionImpl <em>Schedule Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.ScheduleSectionImpl
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getScheduleSection()
		 * @generated
		 */
		EClass SCHEDULE_SECTION = eINSTANCE.getScheduleSection();

		/**
		 * The meta object literal for the '<em><b>Supposed Departure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_SECTION__SUPPOSED_DEPARTURE = eINSTANCE.getScheduleSection_SupposedDeparture();

		/**
		 * The meta object literal for the '<em><b>Actual Departure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_SECTION__ACTUAL_DEPARTURE = eINSTANCE.getScheduleSection_ActualDeparture();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_SECTION__ROUTE = eINSTANCE.getScheduleSection_Route();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_SECTION__NEXT = eINSTANCE.getScheduleSection_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_SECTION__PREVIOUS = eINSTANCE.getScheduleSection_Previous();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.RouteImpl
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__PATHS = eINSTANCE.getRoute_Paths();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__FIRST = eINSTANCE.getRoute_First();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__LAST = eINSTANCE.getRoute_Last();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.StationImpl
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__PLACE = eINSTANCE.getStation_Place();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerImpl <em>Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerImpl
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getScheduler()
		 * @generated
		 */
		EClass SCHEDULER = eINSTANCE.getScheduler();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__ROUTES = eINSTANCE.getScheduler_Routes();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__SCHEDULE = eINSTANCE.getScheduler_Schedule();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__STATIONS = eINSTANCE.getScheduler_Stations();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.NamedElementImpl
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.RouteElementImpl <em>Route Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.RouteElementImpl
		 * @see hu.bme.mit.inf.modes3.components.scheduler.model.SchedulerModel.impl.SchedulerPackageImpl#getRouteElement()
		 * @generated
		 */
		EClass ROUTE_ELEMENT = eINSTANCE.getRouteElement();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_ELEMENT__NEXT = eINSTANCE.getRouteElement_Next();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_ELEMENT__PATH = eINSTANCE.getRouteElement_Path();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_ELEMENT__PREVIOUS = eINSTANCE.getRouteElement_Previous();

	}

} //SchedulerPackage
