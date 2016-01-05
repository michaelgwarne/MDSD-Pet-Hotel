/**
 */
package Classes.mdsdAdmin;

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
 * @see Classes.mdsdAdmin.MdsdAdminFactory
 * @model kind="package"
 * @generated
 */
public interface MdsdAdminPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mdsdAdmin";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/mdsdAdmin.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.mdsdAdmin";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MdsdAdminPackage eINSTANCE = Classes.mdsdAdmin.impl.MdsdAdminPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.mdsdAdmin.Admin <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdAdmin.Admin
	 * @see Classes.mdsdAdmin.impl.MdsdAdminPackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 2;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___ADD_ROOM__STRING_STRING_INT = 0;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___REMOVE_ROOM__INT = 1;

	/**
	 * The operation id for the '<em>Create Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___CREATE_STAFF__STRING_INT_STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Remove Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___REMOVE_STAFF__STRING = 3;

	/**
	 * The operation id for the '<em>Modify Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___MODIFY_STAFF__STRING = 4;

	/**
	 * The operation id for the '<em>Display Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___DISPLAY_STAFF = 5;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link Classes.mdsdAdmin.impl.AdminControllerImpl <em>Admin Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdAdmin.impl.AdminControllerImpl
	 * @see Classes.mdsdAdmin.impl.MdsdAdminPackageImpl#getAdminController()
	 * @generated
	 */
	int ADMIN_CONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER__ROOMS = ADMIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER__STAFF = ADMIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Admin Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER_FEATURE_COUNT = ADMIN_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER___ADD_ROOM__STRING_STRING_INT = ADMIN___ADD_ROOM__STRING_STRING_INT;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER___REMOVE_ROOM__INT = ADMIN___REMOVE_ROOM__INT;

	/**
	 * The operation id for the '<em>Create Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER___CREATE_STAFF__STRING_INT_STRING_STRING = ADMIN___CREATE_STAFF__STRING_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Remove Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER___REMOVE_STAFF__STRING = ADMIN___REMOVE_STAFF__STRING;

	/**
	 * The operation id for the '<em>Modify Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER___MODIFY_STAFF__STRING = ADMIN___MODIFY_STAFF__STRING;

	/**
	 * The operation id for the '<em>Display Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER___DISPLAY_STAFF = ADMIN___DISPLAY_STAFF;

	/**
	 * The operation id for the '<em>Get Pet Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER___GET_PET_TYPES = ADMIN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Staff Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER___STAFF_LOGIN__STRING_STRING = ADMIN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Staff Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER___STAFF_LOGOUT__STRING = ADMIN_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Display Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER___DISPLAY_ROOMS = ADMIN_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Change Room Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER___CHANGE_ROOM_STATUS__STRING_INT = ADMIN_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Logged In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER___IS_LOGGED_IN__STRING = ADMIN_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Admin Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER_OPERATION_COUNT = ADMIN_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link Classes.mdsdAdmin.impl.HotelStaffImpl <em>Hotel Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdAdmin.impl.HotelStaffImpl
	 * @see Classes.mdsdAdmin.impl.MdsdAdminPackageImpl#getHotelStaff()
	 * @generated
	 */
	int HOTEL_STAFF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF__RANK = 1;

	/**
	 * The feature id for the '<em><b>SSN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF__SSN = 2;

	/**
	 * The feature id for the '<em><b>Is Logged In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF__IS_LOGGED_IN = 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF__PASSWORD = 4;

	/**
	 * The number of structural features of the '<em>Hotel Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Hotel Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.mdsdAdmin.BookingToAdmin <em>Booking To Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdAdmin.BookingToAdmin
	 * @see Classes.mdsdAdmin.impl.MdsdAdminPackageImpl#getBookingToAdmin()
	 * @generated
	 */
	int BOOKING_TO_ADMIN = 3;

	/**
	 * The number of structural features of the '<em>Booking To Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_TO_ADMIN_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Pet Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_TO_ADMIN___GET_PET_TYPES = 0;

	/**
	 * The number of operations of the '<em>Booking To Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_TO_ADMIN_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Classes.mdsdAdmin.Staff <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdAdmin.Staff
	 * @see Classes.mdsdAdmin.impl.MdsdAdminPackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 4;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Staff Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF___STAFF_LOGIN__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Staff Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF___STAFF_LOGOUT__STRING = 1;

	/**
	 * The operation id for the '<em>Display Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF___DISPLAY_ROOMS = 2;

	/**
	 * The operation id for the '<em>Change Room Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF___CHANGE_ROOM_STATUS__STRING_INT = 3;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link Classes.mdsdAdmin.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdAdmin.impl.RoomImpl
	 * @see Classes.mdsdAdmin.impl.MdsdAdminPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Classes.mdsdAdmin.AdminController <em>Admin Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Controller</em>'.
	 * @see Classes.mdsdAdmin.AdminController
	 * @generated
	 */
	EClass getAdminController();

	/**
	 * Returns the meta object for the containment reference list '{@link Classes.mdsdAdmin.AdminController#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see Classes.mdsdAdmin.AdminController#getRooms()
	 * @see #getAdminController()
	 * @generated
	 */
	EReference getAdminController_Rooms();

	/**
	 * Returns the meta object for the containment reference list '{@link Classes.mdsdAdmin.AdminController#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staff</em>'.
	 * @see Classes.mdsdAdmin.AdminController#getStaff()
	 * @see #getAdminController()
	 * @generated
	 */
	EReference getAdminController_Staff();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAdmin.AdminController#isLoggedIn(java.lang.String) <em>Is Logged In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Logged In</em>' operation.
	 * @see Classes.mdsdAdmin.AdminController#isLoggedIn(java.lang.String)
	 * @generated
	 */
	EOperation getAdminController__IsLoggedIn__String();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdAdmin.HotelStaff <em>Hotel Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Staff</em>'.
	 * @see Classes.mdsdAdmin.HotelStaff
	 * @generated
	 */
	EClass getHotelStaff();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdAdmin.HotelStaff#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Classes.mdsdAdmin.HotelStaff#getName()
	 * @see #getHotelStaff()
	 * @generated
	 */
	EAttribute getHotelStaff_Name();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdAdmin.HotelStaff#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see Classes.mdsdAdmin.HotelStaff#getRank()
	 * @see #getHotelStaff()
	 * @generated
	 */
	EAttribute getHotelStaff_Rank();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdAdmin.HotelStaff#getSSN <em>SSN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SSN</em>'.
	 * @see Classes.mdsdAdmin.HotelStaff#getSSN()
	 * @see #getHotelStaff()
	 * @generated
	 */
	EAttribute getHotelStaff_SSN();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdAdmin.HotelStaff#isLoggedIn <em>Is Logged In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Logged In</em>'.
	 * @see Classes.mdsdAdmin.HotelStaff#isLoggedIn()
	 * @see #getHotelStaff()
	 * @generated
	 */
	EAttribute getHotelStaff_IsLoggedIn();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdAdmin.HotelStaff#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see Classes.mdsdAdmin.HotelStaff#getPassword()
	 * @see #getHotelStaff()
	 * @generated
	 */
	EAttribute getHotelStaff_Password();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdAdmin.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see Classes.mdsdAdmin.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAdmin.Admin#addRoom(java.lang.String, java.lang.String, int) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see Classes.mdsdAdmin.Admin#addRoom(java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getAdmin__AddRoom__String_String_int();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAdmin.Admin#removeRoom(int) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see Classes.mdsdAdmin.Admin#removeRoom(int)
	 * @generated
	 */
	EOperation getAdmin__RemoveRoom__int();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAdmin.Admin#createStaff(java.lang.String, int, java.lang.String, java.lang.String) <em>Create Staff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Staff</em>' operation.
	 * @see Classes.mdsdAdmin.Admin#createStaff(java.lang.String, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAdmin__CreateStaff__String_int_String_String();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAdmin.Admin#removeStaff(java.lang.String) <em>Remove Staff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Staff</em>' operation.
	 * @see Classes.mdsdAdmin.Admin#removeStaff(java.lang.String)
	 * @generated
	 */
	EOperation getAdmin__RemoveStaff__String();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAdmin.Admin#modifyStaff(java.lang.String) <em>Modify Staff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modify Staff</em>' operation.
	 * @see Classes.mdsdAdmin.Admin#modifyStaff(java.lang.String)
	 * @generated
	 */
	EOperation getAdmin__ModifyStaff__String();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAdmin.Admin#displayStaff() <em>Display Staff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Staff</em>' operation.
	 * @see Classes.mdsdAdmin.Admin#displayStaff()
	 * @generated
	 */
	EOperation getAdmin__DisplayStaff();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdAdmin.BookingToAdmin <em>Booking To Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking To Admin</em>'.
	 * @see Classes.mdsdAdmin.BookingToAdmin
	 * @generated
	 */
	EClass getBookingToAdmin();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAdmin.BookingToAdmin#getPetTypes() <em>Get Pet Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Pet Types</em>' operation.
	 * @see Classes.mdsdAdmin.BookingToAdmin#getPetTypes()
	 * @generated
	 */
	EOperation getBookingToAdmin__GetPetTypes();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdAdmin.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see Classes.mdsdAdmin.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAdmin.Staff#staffLogin(java.lang.String, java.lang.String) <em>Staff Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Staff Login</em>' operation.
	 * @see Classes.mdsdAdmin.Staff#staffLogin(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getStaff__StaffLogin__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAdmin.Staff#staffLogout(java.lang.String) <em>Staff Logout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Staff Logout</em>' operation.
	 * @see Classes.mdsdAdmin.Staff#staffLogout(java.lang.String)
	 * @generated
	 */
	EOperation getStaff__StaffLogout__String();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAdmin.Staff#displayRooms() <em>Display Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Rooms</em>' operation.
	 * @see Classes.mdsdAdmin.Staff#displayRooms()
	 * @generated
	 */
	EOperation getStaff__DisplayRooms();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAdmin.Staff#changeRoomStatus(java.lang.String, int) <em>Change Room Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Room Status</em>' operation.
	 * @see Classes.mdsdAdmin.Staff#changeRoomStatus(java.lang.String, int)
	 * @generated
	 */
	EOperation getStaff__ChangeRoomStatus__String_int();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdAdmin.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see Classes.mdsdAdmin.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdAdmin.Room#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Classes.mdsdAdmin.Room#getType()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Type();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdAdmin.Room#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see Classes.mdsdAdmin.Room#getStatus()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Status();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdAdmin.Room#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Classes.mdsdAdmin.Room#getNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Number();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MdsdAdminFactory getMdsdAdminFactory();

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
		 * The meta object literal for the '{@link Classes.mdsdAdmin.impl.AdminControllerImpl <em>Admin Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdAdmin.impl.AdminControllerImpl
		 * @see Classes.mdsdAdmin.impl.MdsdAdminPackageImpl#getAdminController()
		 * @generated
		 */
		EClass ADMIN_CONTROLLER = eINSTANCE.getAdminController();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN_CONTROLLER__ROOMS = eINSTANCE.getAdminController_Rooms();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN_CONTROLLER__STAFF = eINSTANCE.getAdminController_Staff();

		/**
		 * The meta object literal for the '<em><b>Is Logged In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_CONTROLLER___IS_LOGGED_IN__STRING = eINSTANCE.getAdminController__IsLoggedIn__String();

		/**
		 * The meta object literal for the '{@link Classes.mdsdAdmin.impl.HotelStaffImpl <em>Hotel Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdAdmin.impl.HotelStaffImpl
		 * @see Classes.mdsdAdmin.impl.MdsdAdminPackageImpl#getHotelStaff()
		 * @generated
		 */
		EClass HOTEL_STAFF = eINSTANCE.getHotelStaff();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_STAFF__NAME = eINSTANCE.getHotelStaff_Name();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_STAFF__RANK = eINSTANCE.getHotelStaff_Rank();

		/**
		 * The meta object literal for the '<em><b>SSN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_STAFF__SSN = eINSTANCE.getHotelStaff_SSN();

		/**
		 * The meta object literal for the '<em><b>Is Logged In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_STAFF__IS_LOGGED_IN = eINSTANCE.getHotelStaff_IsLoggedIn();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_STAFF__PASSWORD = eINSTANCE.getHotelStaff_Password();

		/**
		 * The meta object literal for the '{@link Classes.mdsdAdmin.Admin <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdAdmin.Admin
		 * @see Classes.mdsdAdmin.impl.MdsdAdminPackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___ADD_ROOM__STRING_STRING_INT = eINSTANCE.getAdmin__AddRoom__String_String_int();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___REMOVE_ROOM__INT = eINSTANCE.getAdmin__RemoveRoom__int();

		/**
		 * The meta object literal for the '<em><b>Create Staff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___CREATE_STAFF__STRING_INT_STRING_STRING = eINSTANCE.getAdmin__CreateStaff__String_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Staff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___REMOVE_STAFF__STRING = eINSTANCE.getAdmin__RemoveStaff__String();

		/**
		 * The meta object literal for the '<em><b>Modify Staff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___MODIFY_STAFF__STRING = eINSTANCE.getAdmin__ModifyStaff__String();

		/**
		 * The meta object literal for the '<em><b>Display Staff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___DISPLAY_STAFF = eINSTANCE.getAdmin__DisplayStaff();

		/**
		 * The meta object literal for the '{@link Classes.mdsdAdmin.BookingToAdmin <em>Booking To Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdAdmin.BookingToAdmin
		 * @see Classes.mdsdAdmin.impl.MdsdAdminPackageImpl#getBookingToAdmin()
		 * @generated
		 */
		EClass BOOKING_TO_ADMIN = eINSTANCE.getBookingToAdmin();

		/**
		 * The meta object literal for the '<em><b>Get Pet Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_TO_ADMIN___GET_PET_TYPES = eINSTANCE.getBookingToAdmin__GetPetTypes();

		/**
		 * The meta object literal for the '{@link Classes.mdsdAdmin.Staff <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdAdmin.Staff
		 * @see Classes.mdsdAdmin.impl.MdsdAdminPackageImpl#getStaff()
		 * @generated
		 */
		EClass STAFF = eINSTANCE.getStaff();

		/**
		 * The meta object literal for the '<em><b>Staff Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF___STAFF_LOGIN__STRING_STRING = eINSTANCE.getStaff__StaffLogin__String_String();

		/**
		 * The meta object literal for the '<em><b>Staff Logout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF___STAFF_LOGOUT__STRING = eINSTANCE.getStaff__StaffLogout__String();

		/**
		 * The meta object literal for the '<em><b>Display Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF___DISPLAY_ROOMS = eINSTANCE.getStaff__DisplayRooms();

		/**
		 * The meta object literal for the '<em><b>Change Room Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF___CHANGE_ROOM_STATUS__STRING_INT = eINSTANCE.getStaff__ChangeRoomStatus__String_int();

		/**
		 * The meta object literal for the '{@link Classes.mdsdAdmin.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdAdmin.impl.RoomImpl
		 * @see Classes.mdsdAdmin.impl.MdsdAdminPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__TYPE = eINSTANCE.getRoom_Type();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__STATUS = eINSTANCE.getRoom_Status();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NUMBER = eINSTANCE.getRoom_Number();

	}

} //MdsdAdminPackage
