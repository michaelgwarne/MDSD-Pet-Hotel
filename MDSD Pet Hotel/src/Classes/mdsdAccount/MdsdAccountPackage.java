/**
 */
package Classes.mdsdAccount;

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
 * @see Classes.mdsdAccount.MdsdAccountFactory
 * @model kind="package"
 * @generated
 */
public interface MdsdAccountPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mdsdAccount";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/mdsdAccount.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.mdsdAccount";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MdsdAccountPackage eINSTANCE = Classes.mdsdAccount.impl.MdsdAccountPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.mdsdAccount.BookingToAccount <em>Booking To Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdAccount.BookingToAccount
	 * @see Classes.mdsdAccount.impl.MdsdAccountPackageImpl#getBookingToAccount()
	 * @generated
	 */
	int BOOKING_TO_ACCOUNT = 0;

	/**
	 * The number of structural features of the '<em>Booking To Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_TO_ACCOUNT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_TO_ACCOUNT___GET_ACCOUNT__STRING = 0;

	/**
	 * The operation id for the '<em>Is User Logged In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_TO_ACCOUNT___IS_USER_LOGGED_IN__STRING = 1;

	/**
	 * The number of operations of the '<em>Booking To Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_TO_ACCOUNT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Classes.mdsdAccount.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdAccount.impl.AccountImpl
	 * @see Classes.mdsdAccount.impl.MdsdAccountPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 1;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ACCOUNT_ID = 0;

	/**
	 * The feature id for the '<em><b>Pets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__PETS = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__EMAIL = 4;

	/**
	 * The feature id for the '<em><b>Is Logged In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__IS_LOGGED_IN = 5;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.mdsdAccount.impl.PetImpl <em>Pet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdAccount.impl.PetImpl
	 * @see Classes.mdsdAccount.impl.MdsdAccountPackageImpl#getPet()
	 * @generated
	 */
	int PET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Pet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.mdsdAccount.CustomerAccount <em>Customer Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdAccount.CustomerAccount
	 * @see Classes.mdsdAccount.impl.MdsdAccountPackageImpl#getCustomerAccount()
	 * @generated
	 */
	int CUSTOMER_ACCOUNT = 3;

	/**
	 * The number of structural features of the '<em>Customer Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT___CREATE_ACCOUNT__STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT___LOGIN__STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT___LOGOUT__STRING = 2;

	/**
	 * The operation id for the '<em>Add Pet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT___ADD_PET__STRING_STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Remove Pet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT___REMOVE_PET__STRING_STRING_STRING = 4;

	/**
	 * The number of operations of the '<em>Customer Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link Classes.mdsdAccount.impl.AccountControllerImpl <em>Account Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdAccount.impl.AccountControllerImpl
	 * @see Classes.mdsdAccount.impl.MdsdAccountPackageImpl#getAccountController()
	 * @generated
	 */
	int ACCOUNT_CONTROLLER = 4;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_CONTROLLER__ACCOUNTS = BOOKING_TO_ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Account Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_CONTROLLER_FEATURE_COUNT = BOOKING_TO_ACCOUNT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_CONTROLLER___GET_ACCOUNT__STRING = BOOKING_TO_ACCOUNT___GET_ACCOUNT__STRING;

	/**
	 * The operation id for the '<em>Is User Logged In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_CONTROLLER___IS_USER_LOGGED_IN__STRING = BOOKING_TO_ACCOUNT___IS_USER_LOGGED_IN__STRING;

	/**
	 * The operation id for the '<em>Create Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_CONTROLLER___CREATE_ACCOUNT__STRING_STRING_STRING = BOOKING_TO_ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_CONTROLLER___LOGIN__STRING_STRING = BOOKING_TO_ACCOUNT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_CONTROLLER___LOGOUT__STRING = BOOKING_TO_ACCOUNT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Pet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_CONTROLLER___ADD_PET__STRING_STRING_STRING = BOOKING_TO_ACCOUNT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove Pet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_CONTROLLER___REMOVE_PET__STRING_STRING_STRING = BOOKING_TO_ACCOUNT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Account Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_CONTROLLER_OPERATION_COUNT = BOOKING_TO_ACCOUNT_OPERATION_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link Classes.mdsdAccount.BookingToAccount <em>Booking To Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking To Account</em>'.
	 * @see Classes.mdsdAccount.BookingToAccount
	 * @generated
	 */
	EClass getBookingToAccount();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAccount.BookingToAccount#getAccount(java.lang.String) <em>Get Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Account</em>' operation.
	 * @see Classes.mdsdAccount.BookingToAccount#getAccount(java.lang.String)
	 * @generated
	 */
	EOperation getBookingToAccount__GetAccount__String();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAccount.BookingToAccount#isUserLoggedIn(java.lang.String) <em>Is User Logged In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is User Logged In</em>' operation.
	 * @see Classes.mdsdAccount.BookingToAccount#isUserLoggedIn(java.lang.String)
	 * @generated
	 */
	EOperation getBookingToAccount__IsUserLoggedIn__String();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdAccount.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see Classes.mdsdAccount.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdAccount.Account#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see Classes.mdsdAccount.Account#getAccountID()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_AccountID();

	/**
	 * Returns the meta object for the reference list '{@link Classes.mdsdAccount.Account#getPets <em>Pets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pets</em>'.
	 * @see Classes.mdsdAccount.Account#getPets()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Pets();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdAccount.Account#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see Classes.mdsdAccount.Account#getPassword()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Password();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdAccount.Account#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Classes.mdsdAccount.Account#getName()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Name();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdAccount.Account#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Classes.mdsdAccount.Account#getEmail()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Email();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdAccount.Account#isLoggedIn <em>Is Logged In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Logged In</em>'.
	 * @see Classes.mdsdAccount.Account#isLoggedIn()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_IsLoggedIn();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdAccount.Pet <em>Pet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pet</em>'.
	 * @see Classes.mdsdAccount.Pet
	 * @generated
	 */
	EClass getPet();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdAccount.Pet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Classes.mdsdAccount.Pet#getName()
	 * @see #getPet()
	 * @generated
	 */
	EAttribute getPet_Name();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdAccount.Pet#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Classes.mdsdAccount.Pet#getType()
	 * @see #getPet()
	 * @generated
	 */
	EAttribute getPet_Type();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdAccount.CustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Account</em>'.
	 * @see Classes.mdsdAccount.CustomerAccount
	 * @generated
	 */
	EClass getCustomerAccount();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAccount.CustomerAccount#createAccount(java.lang.String, java.lang.String, java.lang.String) <em>Create Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Account</em>' operation.
	 * @see Classes.mdsdAccount.CustomerAccount#createAccount(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCustomerAccount__CreateAccount__String_String_String();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAccount.CustomerAccount#login(java.lang.String, java.lang.String) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see Classes.mdsdAccount.CustomerAccount#login(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCustomerAccount__Login__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAccount.CustomerAccount#logout(java.lang.String) <em>Logout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Logout</em>' operation.
	 * @see Classes.mdsdAccount.CustomerAccount#logout(java.lang.String)
	 * @generated
	 */
	EOperation getCustomerAccount__Logout__String();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAccount.CustomerAccount#addPet(java.lang.String, java.lang.String, java.lang.String) <em>Add Pet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Pet</em>' operation.
	 * @see Classes.mdsdAccount.CustomerAccount#addPet(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCustomerAccount__AddPet__String_String_String();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAccount.CustomerAccount#removePet(java.lang.String, java.lang.String, java.lang.String) <em>Remove Pet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Pet</em>' operation.
	 * @see Classes.mdsdAccount.CustomerAccount#removePet(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCustomerAccount__RemovePet__String_String_String();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdAccount.AccountController <em>Account Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account Controller</em>'.
	 * @see Classes.mdsdAccount.AccountController
	 * @generated
	 */
	EClass getAccountController();

	/**
	 * Returns the meta object for the containment reference list '{@link Classes.mdsdAccount.AccountController#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounts</em>'.
	 * @see Classes.mdsdAccount.AccountController#getAccounts()
	 * @see #getAccountController()
	 * @generated
	 */
	EReference getAccountController_Accounts();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MdsdAccountFactory getMdsdAccountFactory();

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
		 * The meta object literal for the '{@link Classes.mdsdAccount.BookingToAccount <em>Booking To Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdAccount.BookingToAccount
		 * @see Classes.mdsdAccount.impl.MdsdAccountPackageImpl#getBookingToAccount()
		 * @generated
		 */
		EClass BOOKING_TO_ACCOUNT = eINSTANCE.getBookingToAccount();

		/**
		 * The meta object literal for the '<em><b>Get Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_TO_ACCOUNT___GET_ACCOUNT__STRING = eINSTANCE.getBookingToAccount__GetAccount__String();

		/**
		 * The meta object literal for the '<em><b>Is User Logged In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_TO_ACCOUNT___IS_USER_LOGGED_IN__STRING = eINSTANCE.getBookingToAccount__IsUserLoggedIn__String();

		/**
		 * The meta object literal for the '{@link Classes.mdsdAccount.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdAccount.impl.AccountImpl
		 * @see Classes.mdsdAccount.impl.MdsdAccountPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Account ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__ACCOUNT_ID = eINSTANCE.getAccount_AccountID();

		/**
		 * The meta object literal for the '<em><b>Pets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__PETS = eINSTANCE.getAccount_Pets();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__PASSWORD = eINSTANCE.getAccount_Password();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__NAME = eINSTANCE.getAccount_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__EMAIL = eINSTANCE.getAccount_Email();

		/**
		 * The meta object literal for the '<em><b>Is Logged In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__IS_LOGGED_IN = eINSTANCE.getAccount_IsLoggedIn();

		/**
		 * The meta object literal for the '{@link Classes.mdsdAccount.impl.PetImpl <em>Pet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdAccount.impl.PetImpl
		 * @see Classes.mdsdAccount.impl.MdsdAccountPackageImpl#getPet()
		 * @generated
		 */
		EClass PET = eINSTANCE.getPet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PET__NAME = eINSTANCE.getPet_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PET__TYPE = eINSTANCE.getPet_Type();

		/**
		 * The meta object literal for the '{@link Classes.mdsdAccount.CustomerAccount <em>Customer Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdAccount.CustomerAccount
		 * @see Classes.mdsdAccount.impl.MdsdAccountPackageImpl#getCustomerAccount()
		 * @generated
		 */
		EClass CUSTOMER_ACCOUNT = eINSTANCE.getCustomerAccount();

		/**
		 * The meta object literal for the '<em><b>Create Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_ACCOUNT___CREATE_ACCOUNT__STRING_STRING_STRING = eINSTANCE.getCustomerAccount__CreateAccount__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_ACCOUNT___LOGIN__STRING_STRING = eINSTANCE.getCustomerAccount__Login__String_String();

		/**
		 * The meta object literal for the '<em><b>Logout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_ACCOUNT___LOGOUT__STRING = eINSTANCE.getCustomerAccount__Logout__String();

		/**
		 * The meta object literal for the '<em><b>Add Pet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_ACCOUNT___ADD_PET__STRING_STRING_STRING = eINSTANCE.getCustomerAccount__AddPet__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Pet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_ACCOUNT___REMOVE_PET__STRING_STRING_STRING = eINSTANCE.getCustomerAccount__RemovePet__String_String_String();

		/**
		 * The meta object literal for the '{@link Classes.mdsdAccount.impl.AccountControllerImpl <em>Account Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdAccount.impl.AccountControllerImpl
		 * @see Classes.mdsdAccount.impl.MdsdAccountPackageImpl#getAccountController()
		 * @generated
		 */
		EClass ACCOUNT_CONTROLLER = eINSTANCE.getAccountController();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT_CONTROLLER__ACCOUNTS = eINSTANCE.getAccountController_Accounts();

	}

} //MdsdAccountPackage
