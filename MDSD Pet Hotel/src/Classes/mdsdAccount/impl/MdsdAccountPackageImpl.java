/**
 */
package Classes.mdsdAccount.impl;

import Classes.ClassesPackage;

import Classes.impl.ClassesPackageImpl;

import Classes.mdsdAccount.BookingToAccount;
import Classes.mdsdAccount.CustomerAccount;
import Classes.mdsdAccount.MdsdAccountFactory;
import Classes.mdsdAccount.MdsdAccountPackage;

import Classes.mdsdAdmin.MdsdAdminPackage;

import Classes.mdsdAdmin.impl.MdsdAdminPackageImpl;

import Classes.mdsdBilling.MdsdBillingPackage;

import Classes.mdsdBilling.impl.MdsdBillingPackageImpl;

import Classes.mdsdBooking.MdsdBookingPackage;

import Classes.mdsdBooking.impl.MdsdBookingPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MdsdAccountPackageImpl extends EPackageImpl implements MdsdAccountPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingToAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerAccountEClass = null;

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
	 * @see Classes.mdsdAccount.MdsdAccountPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MdsdAccountPackageImpl() {
		super(eNS_URI, MdsdAccountFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MdsdAccountPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MdsdAccountPackage init() {
		if (isInited) return (MdsdAccountPackage)EPackage.Registry.INSTANCE.getEPackage(MdsdAccountPackage.eNS_URI);

		// Obtain or create and register package
		MdsdAccountPackageImpl theMdsdAccountPackage = (MdsdAccountPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MdsdAccountPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MdsdAccountPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ClassesPackageImpl theClassesPackage = (ClassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI) instanceof ClassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI) : ClassesPackage.eINSTANCE);
		MdsdBillingPackageImpl theMdsdBillingPackage = (MdsdBillingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MdsdBillingPackage.eNS_URI) instanceof MdsdBillingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MdsdBillingPackage.eNS_URI) : MdsdBillingPackage.eINSTANCE);
		MdsdBookingPackageImpl theMdsdBookingPackage = (MdsdBookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MdsdBookingPackage.eNS_URI) instanceof MdsdBookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MdsdBookingPackage.eNS_URI) : MdsdBookingPackage.eINSTANCE);
		MdsdAdminPackageImpl theMdsdAdminPackage = (MdsdAdminPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MdsdAdminPackage.eNS_URI) instanceof MdsdAdminPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MdsdAdminPackage.eNS_URI) : MdsdAdminPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theMdsdAccountPackage.createPackageContents();
		theClassesPackage.createPackageContents();
		theMdsdBillingPackage.createPackageContents();
		theMdsdBookingPackage.createPackageContents();
		theMdsdAdminPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theMdsdAccountPackage.initializePackageContents();
		theClassesPackage.initializePackageContents();
		theMdsdBillingPackage.initializePackageContents();
		theMdsdBookingPackage.initializePackageContents();
		theMdsdAdminPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMdsdAccountPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MdsdAccountPackage.eNS_URI, theMdsdAccountPackage);
		return theMdsdAccountPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingToAccount() {
		return bookingToAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingToAccount__GetAccount__String() {
		return bookingToAccountEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerAccount() {
		return customerAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerAccount__CreateAccount() {
		return customerAccountEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerAccount__ModifyAccount() {
		return customerAccountEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerAccount__Login__String_String() {
		return customerAccountEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerAccount__Logout() {
		return customerAccountEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerAccount__ViewRoom() {
		return customerAccountEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdsdAccountFactory getMdsdAccountFactory() {
		return (MdsdAccountFactory)getEFactoryInstance();
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
		bookingToAccountEClass = createEClass(BOOKING_TO_ACCOUNT);
		createEOperation(bookingToAccountEClass, BOOKING_TO_ACCOUNT___GET_ACCOUNT__STRING);

		customerAccountEClass = createEClass(CUSTOMER_ACCOUNT);
		createEOperation(customerAccountEClass, CUSTOMER_ACCOUNT___CREATE_ACCOUNT);
		createEOperation(customerAccountEClass, CUSTOMER_ACCOUNT___MODIFY_ACCOUNT);
		createEOperation(customerAccountEClass, CUSTOMER_ACCOUNT___LOGIN__STRING_STRING);
		createEOperation(customerAccountEClass, CUSTOMER_ACCOUNT___LOGOUT);
		createEOperation(customerAccountEClass, CUSTOMER_ACCOUNT___VIEW_ROOM);
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

		// Obtain other dependent packages
		ClassesPackage theClassesPackage = (ClassesPackage)EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(bookingToAccountEClass, BookingToAccount.class, "BookingToAccount", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getBookingToAccount__GetAccount__String(), theClassesPackage.getAccount(), "getAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(customerAccountEClass, CustomerAccount.class, "CustomerAccount", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCustomerAccount__CreateAccount(), null, "createAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomerAccount__ModifyAccount(), null, "modifyAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomerAccount__Login__String_String(), null, "login", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomerAccount__Logout(), null, "logout", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomerAccount__ViewRoom(), null, "viewRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
	}

} //MdsdAccountPackageImpl
