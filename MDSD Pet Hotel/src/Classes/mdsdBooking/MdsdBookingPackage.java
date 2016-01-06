/**
 */
package Classes.mdsdBooking;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see Classes.mdsdBooking.MdsdBookingFactory
 * @model kind="package"
 * @generated
 */
public interface MdsdBookingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mdsdBooking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/mdsdBooking.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.mdsdBooking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MdsdBookingPackage eINSTANCE = Classes.mdsdBooking.impl.MdsdBookingPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.mdsdBooking.UserBooking <em>User Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdBooking.UserBooking
	 * @see Classes.mdsdBooking.impl.MdsdBookingPackageImpl#getUserBooking()
	 * @generated
	 */
	int USER_BOOKING = 2;

	/**
	 * The number of structural features of the '<em>User Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BOOKING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Modify Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BOOKING___MODIFY_BOOKING__STRING = 0;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BOOKING___CANCEL_BOOKING__STRING = 1;

	/**
	 * The operation id for the '<em>Enter Customer Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BOOKING___ENTER_CUSTOMER_INFO__STRING_STRING_BOOKING_STRING_ELIST = 2;

	/**
	 * The operation id for the '<em>Enter Dates Of Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BOOKING___ENTER_DATES_OF_STAY__DATE_DATE_ELIST_STRING = 3;

	/**
	 * The operation id for the '<em>Enter Meal Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BOOKING___ENTER_MEAL_INFO__STRING_STRING_FLOAT_FLOAT_STRING = 4;

	/**
	 * The operation id for the '<em>Enter Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BOOKING___ENTER_SERVICE__SERVICE_STRING = 5;

	/**
	 * The number of operations of the '<em>User Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BOOKING_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link Classes.mdsdBooking.impl.BookingControllerImpl <em>Booking Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdBooking.impl.BookingControllerImpl
	 * @see Classes.mdsdBooking.impl.MdsdBookingPackageImpl#getBookingController()
	 * @generated
	 */
	int BOOKING_CONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER__BOOKINGS = USER_BOOKING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER__SERVICES = USER_BOOKING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Booking Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER_FEATURE_COUNT = USER_BOOKING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Modify Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___MODIFY_BOOKING__STRING = USER_BOOKING___MODIFY_BOOKING__STRING;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___CANCEL_BOOKING__STRING = USER_BOOKING___CANCEL_BOOKING__STRING;

	/**
	 * The operation id for the '<em>Enter Customer Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___ENTER_CUSTOMER_INFO__STRING_STRING_BOOKING_STRING_ELIST = USER_BOOKING___ENTER_CUSTOMER_INFO__STRING_STRING_BOOKING_STRING_ELIST;

	/**
	 * The operation id for the '<em>Enter Dates Of Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___ENTER_DATES_OF_STAY__DATE_DATE_ELIST_STRING = USER_BOOKING___ENTER_DATES_OF_STAY__DATE_DATE_ELIST_STRING;

	/**
	 * The operation id for the '<em>Enter Meal Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___ENTER_MEAL_INFO__STRING_STRING_FLOAT_FLOAT_STRING = USER_BOOKING___ENTER_MEAL_INFO__STRING_STRING_FLOAT_FLOAT_STRING;

	/**
	 * The operation id for the '<em>Enter Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___ENTER_SERVICE__SERVICE_STRING = USER_BOOKING___ENTER_SERVICE__SERVICE_STRING;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___CHECK_IN__STRING_ELIST = USER_BOOKING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___CHECK_OUT__STRING_ELIST = USER_BOOKING_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add New Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___ADD_NEW_SERVICE__STRING_FLOAT = USER_BOOKING_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Booking List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___GET_BOOKING_LIST__STRING = USER_BOOKING_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Booking Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER_OPERATION_COUNT = USER_BOOKING_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link Classes.mdsdBooking.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdBooking.impl.ServiceImpl
	 * @see Classes.mdsdBooking.impl.MdsdBookingPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PRICE = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.mdsdBooking.StaffBooking <em>Staff Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdBooking.StaffBooking
	 * @see Classes.mdsdBooking.impl.MdsdBookingPackageImpl#getStaffBooking()
	 * @generated
	 */
	int STAFF_BOOKING = 3;

	/**
	 * The number of structural features of the '<em>Staff Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BOOKING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BOOKING___CHECK_IN__STRING_ELIST = 0;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BOOKING___CHECK_OUT__STRING_ELIST = 1;

	/**
	 * The operation id for the '<em>Add New Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BOOKING___ADD_NEW_SERVICE__STRING_FLOAT = 2;

	/**
	 * The number of operations of the '<em>Staff Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BOOKING_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Classes.mdsdBooking.impl.MealImpl <em>Meal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdBooking.impl.MealImpl
	 * @see Classes.mdsdBooking.impl.MdsdBookingPackageImpl#getMeal()
	 * @generated
	 */
	int MEAL = 4;

	/**
	 * The feature id for the '<em><b>Food Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL__FOOD_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL__SCHEDULE = 1;

	/**
	 * The feature id for the '<em><b>Amount Of Food</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL__AMOUNT_OF_FOOD = 2;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL__PRICE = 3;

	/**
	 * The number of structural features of the '<em>Meal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Meal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.mdsdBooking.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdBooking.impl.BookingImpl
	 * @see Classes.mdsdBooking.impl.MdsdBookingPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 5;

	/**
	 * The feature id for the '<em><b>Customer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CUSTOMER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Customer Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CUSTOMER_EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Booking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_ID = 2;

	/**
	 * The feature id for the '<em><b>Is Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__IS_CHECKED_IN = 3;

	/**
	 * The feature id for the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__IS_CHECKED_OUT = 4;

	/**
	 * The feature id for the '<em><b>Booked Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKED_SERVICES = 5;

	/**
	 * The feature id for the '<em><b>Meal Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__MEAL_INFO = 6;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Date From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__DATE_FROM = 8;

	/**
	 * The feature id for the '<em><b>Date To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__DATE_TO = 9;

	/**
	 * The feature id for the '<em><b>Bill Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BILL_ID = 10;

	/**
	 * The feature id for the '<em><b>Pet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PET_NAME = 11;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Classes.mdsdBooking.BookingController <em>Booking Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Controller</em>'.
	 * @see Classes.mdsdBooking.BookingController
	 * @generated
	 */
	EClass getBookingController();

	/**
	 * Returns the meta object for the containment reference list '{@link Classes.mdsdBooking.BookingController#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bookings</em>'.
	 * @see Classes.mdsdBooking.BookingController#getBookings()
	 * @see #getBookingController()
	 * @generated
	 */
	EReference getBookingController_Bookings();

	/**
	 * Returns the meta object for the containment reference list '{@link Classes.mdsdBooking.BookingController#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see Classes.mdsdBooking.BookingController#getServices()
	 * @see #getBookingController()
	 * @generated
	 */
	EReference getBookingController_Services();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBooking.BookingController#getBookingList(java.lang.String) <em>Get Booking List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking List</em>' operation.
	 * @see Classes.mdsdBooking.BookingController#getBookingList(java.lang.String)
	 * @generated
	 */
	EOperation getBookingController__GetBookingList__String();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdBooking.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see Classes.mdsdBooking.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Service#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Classes.mdsdBooking.Service#getDescription()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Description();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Service#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Classes.mdsdBooking.Service#getPrice()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Price();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdBooking.UserBooking <em>User Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Booking</em>'.
	 * @see Classes.mdsdBooking.UserBooking
	 * @generated
	 */
	EClass getUserBooking();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBooking.UserBooking#modifyBooking(java.lang.String) <em>Modify Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modify Booking</em>' operation.
	 * @see Classes.mdsdBooking.UserBooking#modifyBooking(java.lang.String)
	 * @generated
	 */
	EOperation getUserBooking__ModifyBooking__String();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBooking.UserBooking#cancelBooking(java.lang.String) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see Classes.mdsdBooking.UserBooking#cancelBooking(java.lang.String)
	 * @generated
	 */
	EOperation getUserBooking__CancelBooking__String();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBooking.UserBooking#enterCustomerInfo(java.lang.String, java.lang.String, Classes.mdsdBooking.Booking, java.lang.String, org.eclipse.emf.common.util.EList) <em>Enter Customer Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enter Customer Info</em>' operation.
	 * @see Classes.mdsdBooking.UserBooking#enterCustomerInfo(java.lang.String, java.lang.String, Classes.mdsdBooking.Booking, java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getUserBooking__EnterCustomerInfo__String_String_Booking_String_EList();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBooking.UserBooking#enterDatesOfStay(java.util.Date, java.util.Date, org.eclipse.emf.common.util.EList, java.lang.String) <em>Enter Dates Of Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enter Dates Of Stay</em>' operation.
	 * @see Classes.mdsdBooking.UserBooking#enterDatesOfStay(java.util.Date, java.util.Date, org.eclipse.emf.common.util.EList, java.lang.String)
	 * @generated
	 */
	EOperation getUserBooking__EnterDatesOfStay__Date_Date_EList_String();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBooking.UserBooking#enterMealInfo(java.lang.String, java.lang.String, float, float, java.lang.String) <em>Enter Meal Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enter Meal Info</em>' operation.
	 * @see Classes.mdsdBooking.UserBooking#enterMealInfo(java.lang.String, java.lang.String, float, float, java.lang.String)
	 * @generated
	 */
	EOperation getUserBooking__EnterMealInfo__String_String_float_float_String();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBooking.UserBooking#enterService(Classes.mdsdBooking.Service, java.lang.String) <em>Enter Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enter Service</em>' operation.
	 * @see Classes.mdsdBooking.UserBooking#enterService(Classes.mdsdBooking.Service, java.lang.String)
	 * @generated
	 */
	EOperation getUserBooking__EnterService__Service_String();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdBooking.StaffBooking <em>Staff Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Booking</em>'.
	 * @see Classes.mdsdBooking.StaffBooking
	 * @generated
	 */
	EClass getStaffBooking();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBooking.StaffBooking#checkIn(java.lang.String, org.eclipse.emf.common.util.EList) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see Classes.mdsdBooking.StaffBooking#checkIn(java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getStaffBooking__CheckIn__String_EList();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBooking.StaffBooking#checkOut(java.lang.String, org.eclipse.emf.common.util.EList) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see Classes.mdsdBooking.StaffBooking#checkOut(java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getStaffBooking__CheckOut__String_EList();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBooking.StaffBooking#addNewService(java.lang.String, float) <em>Add New Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add New Service</em>' operation.
	 * @see Classes.mdsdBooking.StaffBooking#addNewService(java.lang.String, float)
	 * @generated
	 */
	EOperation getStaffBooking__AddNewService__String_float();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdBooking.Meal <em>Meal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meal</em>'.
	 * @see Classes.mdsdBooking.Meal
	 * @generated
	 */
	EClass getMeal();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Meal#getFoodType <em>Food Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Food Type</em>'.
	 * @see Classes.mdsdBooking.Meal#getFoodType()
	 * @see #getMeal()
	 * @generated
	 */
	EAttribute getMeal_FoodType();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Meal#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule</em>'.
	 * @see Classes.mdsdBooking.Meal#getSchedule()
	 * @see #getMeal()
	 * @generated
	 */
	EAttribute getMeal_Schedule();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Meal#getAmountOfFood <em>Amount Of Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Of Food</em>'.
	 * @see Classes.mdsdBooking.Meal#getAmountOfFood()
	 * @see #getMeal()
	 * @generated
	 */
	EAttribute getMeal_AmountOfFood();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Meal#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Classes.mdsdBooking.Meal#getPrice()
	 * @see #getMeal()
	 * @generated
	 */
	EAttribute getMeal_Price();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdBooking.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see Classes.mdsdBooking.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Booking#getCustomerName <em>Customer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Name</em>'.
	 * @see Classes.mdsdBooking.Booking#getCustomerName()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CustomerName();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Booking#getCustomerEmail <em>Customer Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Email</em>'.
	 * @see Classes.mdsdBooking.Booking#getCustomerEmail()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CustomerEmail();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Booking#getBookingId <em>Booking Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Id</em>'.
	 * @see Classes.mdsdBooking.Booking#getBookingId()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingId();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Booking#isCheckedIn <em>Is Checked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Checked In</em>'.
	 * @see Classes.mdsdBooking.Booking#isCheckedIn()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_IsCheckedIn();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Booking#isCheckedOut <em>Is Checked Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Checked Out</em>'.
	 * @see Classes.mdsdBooking.Booking#isCheckedOut()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_IsCheckedOut();

	/**
	 * Returns the meta object for the reference list '{@link Classes.mdsdBooking.Booking#getBookedServices <em>Booked Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booked Services</em>'.
	 * @see Classes.mdsdBooking.Booking#getBookedServices()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_BookedServices();

	/**
	 * Returns the meta object for the containment reference '{@link Classes.mdsdBooking.Booking#getMealInfo <em>Meal Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meal Info</em>'.
	 * @see Classes.mdsdBooking.Booking#getMealInfo()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_MealInfo();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Booking#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see Classes.mdsdBooking.Booking#getRoomNumber()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_RoomNumber();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Booking#getDateFrom <em>Date From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date From</em>'.
	 * @see Classes.mdsdBooking.Booking#getDateFrom()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_DateFrom();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Booking#getDateTo <em>Date To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date To</em>'.
	 * @see Classes.mdsdBooking.Booking#getDateTo()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_DateTo();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Booking#getBill_Id <em>Bill Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill Id</em>'.
	 * @see Classes.mdsdBooking.Booking#getBill_Id()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Bill_Id();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBooking.Booking#getPetName <em>Pet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pet Name</em>'.
	 * @see Classes.mdsdBooking.Booking#getPetName()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_PetName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MdsdBookingFactory getMdsdBookingFactory();

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
		 * The meta object literal for the '{@link Classes.mdsdBooking.impl.BookingControllerImpl <em>Booking Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdBooking.impl.BookingControllerImpl
		 * @see Classes.mdsdBooking.impl.MdsdBookingPackageImpl#getBookingController()
		 * @generated
		 */
		EClass BOOKING_CONTROLLER = eINSTANCE.getBookingController();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_CONTROLLER__BOOKINGS = eINSTANCE.getBookingController_Bookings();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_CONTROLLER__SERVICES = eINSTANCE.getBookingController_Services();

		/**
		 * The meta object literal for the '<em><b>Get Booking List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_CONTROLLER___GET_BOOKING_LIST__STRING = eINSTANCE.getBookingController__GetBookingList__String();

		/**
		 * The meta object literal for the '{@link Classes.mdsdBooking.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdBooking.impl.ServiceImpl
		 * @see Classes.mdsdBooking.impl.MdsdBookingPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PRICE = eINSTANCE.getService_Price();

		/**
		 * The meta object literal for the '{@link Classes.mdsdBooking.UserBooking <em>User Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdBooking.UserBooking
		 * @see Classes.mdsdBooking.impl.MdsdBookingPackageImpl#getUserBooking()
		 * @generated
		 */
		EClass USER_BOOKING = eINSTANCE.getUserBooking();

		/**
		 * The meta object literal for the '<em><b>Modify Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_BOOKING___MODIFY_BOOKING__STRING = eINSTANCE.getUserBooking__ModifyBooking__String();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_BOOKING___CANCEL_BOOKING__STRING = eINSTANCE.getUserBooking__CancelBooking__String();

		/**
		 * The meta object literal for the '<em><b>Enter Customer Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_BOOKING___ENTER_CUSTOMER_INFO__STRING_STRING_BOOKING_STRING_ELIST = eINSTANCE.getUserBooking__EnterCustomerInfo__String_String_Booking_String_EList();

		/**
		 * The meta object literal for the '<em><b>Enter Dates Of Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_BOOKING___ENTER_DATES_OF_STAY__DATE_DATE_ELIST_STRING = eINSTANCE.getUserBooking__EnterDatesOfStay__Date_Date_EList_String();

		/**
		 * The meta object literal for the '<em><b>Enter Meal Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_BOOKING___ENTER_MEAL_INFO__STRING_STRING_FLOAT_FLOAT_STRING = eINSTANCE.getUserBooking__EnterMealInfo__String_String_float_float_String();

		/**
		 * The meta object literal for the '<em><b>Enter Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_BOOKING___ENTER_SERVICE__SERVICE_STRING = eINSTANCE.getUserBooking__EnterService__Service_String();

		/**
		 * The meta object literal for the '{@link Classes.mdsdBooking.StaffBooking <em>Staff Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdBooking.StaffBooking
		 * @see Classes.mdsdBooking.impl.MdsdBookingPackageImpl#getStaffBooking()
		 * @generated
		 */
		EClass STAFF_BOOKING = eINSTANCE.getStaffBooking();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_BOOKING___CHECK_IN__STRING_ELIST = eINSTANCE.getStaffBooking__CheckIn__String_EList();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_BOOKING___CHECK_OUT__STRING_ELIST = eINSTANCE.getStaffBooking__CheckOut__String_EList();

		/**
		 * The meta object literal for the '<em><b>Add New Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_BOOKING___ADD_NEW_SERVICE__STRING_FLOAT = eINSTANCE.getStaffBooking__AddNewService__String_float();

		/**
		 * The meta object literal for the '{@link Classes.mdsdBooking.impl.MealImpl <em>Meal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdBooking.impl.MealImpl
		 * @see Classes.mdsdBooking.impl.MdsdBookingPackageImpl#getMeal()
		 * @generated
		 */
		EClass MEAL = eINSTANCE.getMeal();

		/**
		 * The meta object literal for the '<em><b>Food Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEAL__FOOD_TYPE = eINSTANCE.getMeal_FoodType();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEAL__SCHEDULE = eINSTANCE.getMeal_Schedule();

		/**
		 * The meta object literal for the '<em><b>Amount Of Food</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEAL__AMOUNT_OF_FOOD = eINSTANCE.getMeal_AmountOfFood();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEAL__PRICE = eINSTANCE.getMeal_Price();

		/**
		 * The meta object literal for the '{@link Classes.mdsdBooking.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdBooking.impl.BookingImpl
		 * @see Classes.mdsdBooking.impl.MdsdBookingPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Customer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CUSTOMER_NAME = eINSTANCE.getBooking_CustomerName();

		/**
		 * The meta object literal for the '<em><b>Customer Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CUSTOMER_EMAIL = eINSTANCE.getBooking_CustomerEmail();

		/**
		 * The meta object literal for the '<em><b>Booking Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_ID = eINSTANCE.getBooking_BookingId();

		/**
		 * The meta object literal for the '<em><b>Is Checked In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__IS_CHECKED_IN = eINSTANCE.getBooking_IsCheckedIn();

		/**
		 * The meta object literal for the '<em><b>Is Checked Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__IS_CHECKED_OUT = eINSTANCE.getBooking_IsCheckedOut();

		/**
		 * The meta object literal for the '<em><b>Booked Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__BOOKED_SERVICES = eINSTANCE.getBooking_BookedServices();

		/**
		 * The meta object literal for the '<em><b>Meal Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__MEAL_INFO = eINSTANCE.getBooking_MealInfo();

		/**
		 * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__ROOM_NUMBER = eINSTANCE.getBooking_RoomNumber();

		/**
		 * The meta object literal for the '<em><b>Date From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__DATE_FROM = eINSTANCE.getBooking_DateFrom();

		/**
		 * The meta object literal for the '<em><b>Date To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__DATE_TO = eINSTANCE.getBooking_DateTo();

		/**
		 * The meta object literal for the '<em><b>Bill Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BILL_ID = eINSTANCE.getBooking_Bill_Id();

		/**
		 * The meta object literal for the '<em><b>Pet Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__PET_NAME = eINSTANCE.getBooking_PetName();

	}

} //MdsdBookingPackage
