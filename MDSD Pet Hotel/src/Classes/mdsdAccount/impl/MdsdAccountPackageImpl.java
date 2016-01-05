/**
 */
package Classes.mdsdAccount.impl;

import Classes.mdsdAccount.Account;
import Classes.mdsdAccount.AccountController;
import Classes.mdsdAccount.BookingToAccount;
import Classes.mdsdAccount.CustomerAccount;
import Classes.mdsdAccount.MdsdAccountFactory;
import Classes.mdsdAccount.MdsdAccountPackage;
import Classes.mdsdAccount.Pet;

import Classes.mdsdAdmin.MdsdAdminPackage;

import Classes.mdsdAdmin.impl.MdsdAdminPackageImpl;

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
	private EClass accountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountControllerEClass = null;

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
		MdsdBillingPackageImpl theMdsdBillingPackage = (MdsdBillingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MdsdBillingPackage.eNS_URI) instanceof MdsdBillingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MdsdBillingPackage.eNS_URI) : MdsdBillingPackage.eINSTANCE);
		MdsdBookingPackageImpl theMdsdBookingPackage = (MdsdBookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MdsdBookingPackage.eNS_URI) instanceof MdsdBookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MdsdBookingPackage.eNS_URI) : MdsdBookingPackage.eINSTANCE);
		MdsdAdminPackageImpl theMdsdAdminPackage = (MdsdAdminPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MdsdAdminPackage.eNS_URI) instanceof MdsdAdminPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MdsdAdminPackage.eNS_URI) : MdsdAdminPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theMdsdAccountPackage.createPackageContents();
		theMdsdBillingPackage.createPackageContents();
		theMdsdBookingPackage.createPackageContents();
		theMdsdAdminPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theMdsdAccountPackage.initializePackageContents();
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
	public EOperation getBookingToAccount__IsUserLoggedIn__String() {
		return bookingToAccountEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccount() {
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_AccountID() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Pets() {
		return (EReference)accountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Password() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Name() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Email() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_IsLoggedIn() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPet() {
		return petEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPet_Name() {
		return (EAttribute)petEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPet_Type() {
		return (EAttribute)petEClass.getEStructuralFeatures().get(1);
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
	public EOperation getCustomerAccount__CreateAccount__String_String_String() {
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
	public EOperation getCustomerAccount__Logout__String() {
		return customerAccountEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerAccount__ViewRoom__int() {
		return customerAccountEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerAccount__AddPet__String_String_String() {
		return customerAccountEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerAccount__RemovePet__String_String_String() {
		return customerAccountEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountController() {
		return accountControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountController_Accounts() {
		return (EReference)accountControllerEClass.getEStructuralFeatures().get(0);
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
		createEOperation(bookingToAccountEClass, BOOKING_TO_ACCOUNT___IS_USER_LOGGED_IN__STRING);

		accountEClass = createEClass(ACCOUNT);
		createEAttribute(accountEClass, ACCOUNT__ACCOUNT_ID);
		createEReference(accountEClass, ACCOUNT__PETS);
		createEAttribute(accountEClass, ACCOUNT__PASSWORD);
		createEAttribute(accountEClass, ACCOUNT__NAME);
		createEAttribute(accountEClass, ACCOUNT__EMAIL);
		createEAttribute(accountEClass, ACCOUNT__IS_LOGGED_IN);

		petEClass = createEClass(PET);
		createEAttribute(petEClass, PET__NAME);
		createEAttribute(petEClass, PET__TYPE);

		customerAccountEClass = createEClass(CUSTOMER_ACCOUNT);
		createEOperation(customerAccountEClass, CUSTOMER_ACCOUNT___CREATE_ACCOUNT__STRING_STRING_STRING);
		createEOperation(customerAccountEClass, CUSTOMER_ACCOUNT___MODIFY_ACCOUNT);
		createEOperation(customerAccountEClass, CUSTOMER_ACCOUNT___LOGIN__STRING_STRING);
		createEOperation(customerAccountEClass, CUSTOMER_ACCOUNT___LOGOUT__STRING);
		createEOperation(customerAccountEClass, CUSTOMER_ACCOUNT___VIEW_ROOM__INT);
		createEOperation(customerAccountEClass, CUSTOMER_ACCOUNT___ADD_PET__STRING_STRING_STRING);
		createEOperation(customerAccountEClass, CUSTOMER_ACCOUNT___REMOVE_PET__STRING_STRING_STRING);

		accountControllerEClass = createEClass(ACCOUNT_CONTROLLER);
		createEReference(accountControllerEClass, ACCOUNT_CONTROLLER__ACCOUNTS);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		accountControllerEClass.getESuperTypes().add(this.getBookingToAccount());
		accountControllerEClass.getESuperTypes().add(this.getCustomerAccount());

		// Initialize classes, features, and operations; add parameters
		initEClass(bookingToAccountEClass, BookingToAccount.class, "BookingToAccount", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getBookingToAccount__GetAccount__String(), this.getAccount(), "getAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingToAccount__IsUserLoggedIn__String(), ecorePackage.getEBoolean(), "isUserLoggedIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "accountId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(accountEClass, Account.class, "Account", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccount_AccountID(), ecorePackage.getEString(), "accountID", null, 1, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccount_Pets(), this.getPet(), null, "pets", null, 0, -1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccount_Password(), ecorePackage.getEString(), "password", null, 1, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccount_Name(), theTypesPackage.getString(), "name", null, 1, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccount_Email(), ecorePackage.getEString(), "email", null, 1, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccount_IsLoggedIn(), ecorePackage.getEBoolean(), "isLoggedIn", null, 1, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(petEClass, Pet.class, "Pet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPet_Name(), ecorePackage.getEString(), "name", null, 1, 1, Pet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPet_Type(), ecorePackage.getEString(), "type", null, 1, 1, Pet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(customerAccountEClass, CustomerAccount.class, "CustomerAccount", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCustomerAccount__CreateAccount__String_String_String(), this.getAccount(), "createAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "customerName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "customerEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomerAccount__ModifyAccount(), null, "modifyAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomerAccount__Login__String_String(), null, "login", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomerAccount__Logout__String(), null, "logout", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "accountId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomerAccount__ViewRoom__int(), null, "viewRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomerAccount__AddPet__String_String_String(), null, "addPet", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "accountID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomerAccount__RemovePet__String_String_String(), null, "removePet", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "accountID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(accountControllerEClass, AccountController.class, "AccountController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccountController_Accounts(), this.getAccount(), null, "accounts", null, 0, -1, AccountController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MdsdAccountPackageImpl
