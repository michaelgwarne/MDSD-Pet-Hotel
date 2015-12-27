/**
 */
package Classes.mdsdAdmin.impl;

import Classes.ClassesPackage;

import Classes.impl.ClassesPackageImpl;

import Classes.mdsdAccount.MdsdAccountPackage;

import Classes.mdsdAccount.impl.MdsdAccountPackageImpl;

import Classes.mdsdAdmin.Admin;
import Classes.mdsdAdmin.AdminController;
import Classes.mdsdAdmin.BookingToAdmin;
import Classes.mdsdAdmin.HotelStaff;
import Classes.mdsdAdmin.MdsdAdminFactory;
import Classes.mdsdAdmin.MdsdAdminPackage;
import Classes.mdsdAdmin.Room;
import Classes.mdsdAdmin.Service;
import Classes.mdsdAdmin.Staff;

import Classes.mdsdBilling.MdsdBillingPackage;

import Classes.mdsdBilling.impl.MdsdBillingPackageImpl;

import Classes.mdsdBooking.MdsdBookingPackage;

import Classes.mdsdBooking.impl.MdsdBookingPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MdsdAdminPackageImpl extends EPackageImpl implements MdsdAdminPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelStaffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingToAdminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Classes.mdsdAdmin.MdsdAdminPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MdsdAdminPackageImpl() {
		super(eNS_URI, MdsdAdminFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MdsdAdminPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MdsdAdminPackage init() {
		if (isInited) return (MdsdAdminPackage)EPackage.Registry.INSTANCE.getEPackage(MdsdAdminPackage.eNS_URI);

		// Obtain or create and register package
		MdsdAdminPackageImpl theMdsdAdminPackage = (MdsdAdminPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MdsdAdminPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MdsdAdminPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ClassesPackageImpl theClassesPackage = (ClassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI) instanceof ClassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI) : ClassesPackage.eINSTANCE);
		MdsdBillingPackageImpl theMdsdBillingPackage = (MdsdBillingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MdsdBillingPackage.eNS_URI) instanceof MdsdBillingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MdsdBillingPackage.eNS_URI) : MdsdBillingPackage.eINSTANCE);
		MdsdBookingPackageImpl theMdsdBookingPackage = (MdsdBookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MdsdBookingPackage.eNS_URI) instanceof MdsdBookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MdsdBookingPackage.eNS_URI) : MdsdBookingPackage.eINSTANCE);
		MdsdAccountPackageImpl theMdsdAccountPackage = (MdsdAccountPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MdsdAccountPackage.eNS_URI) instanceof MdsdAccountPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MdsdAccountPackage.eNS_URI) : MdsdAccountPackage.eINSTANCE);

		// Create package meta-data objects
		theMdsdAdminPackage.createPackageContents();
		theClassesPackage.createPackageContents();
		theMdsdBillingPackage.createPackageContents();
		theMdsdBookingPackage.createPackageContents();
		theMdsdAccountPackage.createPackageContents();

		// Initialize created meta-data
		theMdsdAdminPackage.initializePackageContents();
		theClassesPackage.initializePackageContents();
		theMdsdBillingPackage.initializePackageContents();
		theMdsdBookingPackage.initializePackageContents();
		theMdsdAccountPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMdsdAdminPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MdsdAdminPackage.eNS_URI, theMdsdAdminPackage);
		return theMdsdAdminPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdminController() {
		return adminControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdminController_Rooms() {
		return (EReference)adminControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdminController_Staff() {
		return (EReference)adminControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotelStaff() {
		return hotelStaffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotelStaff_Name() {
		return (EAttribute)hotelStaffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotelStaff_Rank() {
		return (EAttribute)hotelStaffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotelStaff_SSN() {
		return (EAttribute)hotelStaffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdmin() {
		return adminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdmin__AddRoom__String_String_int() {
		return adminEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdmin__RemoveRoom__int() {
		return adminEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdmin__CreateStaff__String_int_String() {
		return adminEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdmin__RemoveStaff__String() {
		return adminEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdmin__ModifyStaff__String() {
		return adminEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdmin__DisplayStaff() {
		return adminEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingToAdmin() {
		return bookingToAdminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingToAdmin__GetPetTypes() {
		return bookingToAdminEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingToAdmin__GetAvailableRooms() {
		return bookingToAdminEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingToAdmin__GetServiceList() {
		return bookingToAdminEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaff() {
		return staffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaff__StaffLogin() {
		return staffEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaff__StaffLogout() {
		return staffEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaff__DisplayRooms() {
		return staffEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Description() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Price() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Type() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Status() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Number() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdsdAdminFactory getMdsdAdminFactory() {
		return (MdsdAdminFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		adminControllerEClass = createEClass(ADMIN_CONTROLLER);
		createEReference(adminControllerEClass, ADMIN_CONTROLLER__ROOMS);
		createEReference(adminControllerEClass, ADMIN_CONTROLLER__STAFF);

		hotelStaffEClass = createEClass(HOTEL_STAFF);
		createEAttribute(hotelStaffEClass, HOTEL_STAFF__NAME);
		createEAttribute(hotelStaffEClass, HOTEL_STAFF__RANK);
		createEAttribute(hotelStaffEClass, HOTEL_STAFF__SSN);

		adminEClass = createEClass(ADMIN);
		createEOperation(adminEClass, ADMIN___ADD_ROOM__STRING_STRING_INT);
		createEOperation(adminEClass, ADMIN___REMOVE_ROOM__INT);
		createEOperation(adminEClass, ADMIN___CREATE_STAFF__STRING_INT_STRING);
		createEOperation(adminEClass, ADMIN___REMOVE_STAFF__STRING);
		createEOperation(adminEClass, ADMIN___MODIFY_STAFF__STRING);
		createEOperation(adminEClass, ADMIN___DISPLAY_STAFF);

		bookingToAdminEClass = createEClass(BOOKING_TO_ADMIN);
		createEOperation(bookingToAdminEClass, BOOKING_TO_ADMIN___GET_PET_TYPES);
		createEOperation(bookingToAdminEClass, BOOKING_TO_ADMIN___GET_AVAILABLE_ROOMS);
		createEOperation(bookingToAdminEClass, BOOKING_TO_ADMIN___GET_SERVICE_LIST);

		staffEClass = createEClass(STAFF);
		createEOperation(staffEClass, STAFF___STAFF_LOGIN);
		createEOperation(staffEClass, STAFF___STAFF_LOGOUT);
		createEOperation(staffEClass, STAFF___DISPLAY_ROOMS);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__DESCRIPTION);
		createEAttribute(serviceEClass, SERVICE__PRICE);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__TYPE);
		createEAttribute(roomEClass, ROOM__STATUS);
		createEAttribute(roomEClass, ROOM__NUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		adminControllerEClass.getESuperTypes().add(this.getAdmin());
		adminControllerEClass.getESuperTypes().add(this.getBookingToAdmin());
		adminControllerEClass.getESuperTypes().add(this.getStaff());

		// Initialize classes, features, and operations; add parameters
		initEClass(adminControllerEClass, AdminController.class, "AdminController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdminController_Rooms(), this.getRoom(), null, "rooms", null, 0, -1, AdminController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdminController_Staff(), this.getHotelStaff(), null, "staff", null, 0, -1, AdminController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hotelStaffEClass, HotelStaff.class, "HotelStaff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotelStaff_Name(), ecorePackage.getEString(), "Name", null, 1, 1, HotelStaff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotelStaff_Rank(), ecorePackage.getEInt(), "rank", null, 1, 1, HotelStaff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotelStaff_SSN(), ecorePackage.getEString(), "SSN", null, 1, 1, HotelStaff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(adminEClass, Admin.class, "Admin", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getAdmin__AddRoom__String_String_int(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "status", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdmin__RemoveRoom__int(), null, "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "number", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdmin__CreateStaff__String_int_String(), null, "createStaff", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "rank", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSN", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdmin__RemoveStaff__String(), null, "removeStaff", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSN", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdmin__ModifyStaff__String(), null, "modifyStaff", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSN", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAdmin__DisplayStaff(), null, "displayStaff", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingToAdminEClass, BookingToAdmin.class, "BookingToAdmin", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getBookingToAdmin__GetPetTypes(), ecorePackage.getEString(), "getPetTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBookingToAdmin__GetAvailableRooms(), null, "getAvailableRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBookingToAdmin__GetServiceList(), null, "getServiceList", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(staffEClass, Staff.class, "Staff", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getStaff__StaffLogin(), null, "staffLogin", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaff__StaffLogout(), null, "staffLogout", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaff__DisplayRooms(), null, "displayRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Description(), ecorePackage.getEString(), "description", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getService_Price(), ecorePackage.getEFloat(), "price", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Type(), ecorePackage.getEString(), "type", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Status(), ecorePackage.getEString(), "status", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Number(), ecorePackage.getEInt(), "number", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //MdsdAdminPackageImpl
