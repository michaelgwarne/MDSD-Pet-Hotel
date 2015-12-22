/**
 */
package Classes.mdsdAccount;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
	 * The number of operations of the '<em>Booking To Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_TO_ACCOUNT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Classes.mdsdAccount.CustomerAccount <em>Customer Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdAccount.CustomerAccount
	 * @see Classes.mdsdAccount.impl.MdsdAccountPackageImpl#getCustomerAccount()
	 * @generated
	 */
	int CUSTOMER_ACCOUNT = 1;

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
	int CUSTOMER_ACCOUNT___CREATE_ACCOUNT = 0;

	/**
	 * The operation id for the '<em>Modify Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT___MODIFY_ACCOUNT = 1;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT___LOGIN__STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT___LOGOUT = 3;

	/**
	 * The operation id for the '<em>View Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT___VIEW_ROOM = 4;

	/**
	 * The number of operations of the '<em>Customer Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT_OPERATION_COUNT = 5;


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
	 * Returns the meta object for class '{@link Classes.mdsdAccount.CustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Account</em>'.
	 * @see Classes.mdsdAccount.CustomerAccount
	 * @generated
	 */
	EClass getCustomerAccount();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAccount.CustomerAccount#createAccount() <em>Create Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Account</em>' operation.
	 * @see Classes.mdsdAccount.CustomerAccount#createAccount()
	 * @generated
	 */
	EOperation getCustomerAccount__CreateAccount();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAccount.CustomerAccount#modifyAccount() <em>Modify Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modify Account</em>' operation.
	 * @see Classes.mdsdAccount.CustomerAccount#modifyAccount()
	 * @generated
	 */
	EOperation getCustomerAccount__ModifyAccount();

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
	 * Returns the meta object for the '{@link Classes.mdsdAccount.CustomerAccount#logout() <em>Logout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Logout</em>' operation.
	 * @see Classes.mdsdAccount.CustomerAccount#logout()
	 * @generated
	 */
	EOperation getCustomerAccount__Logout();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdAccount.CustomerAccount#viewRoom() <em>View Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Room</em>' operation.
	 * @see Classes.mdsdAccount.CustomerAccount#viewRoom()
	 * @generated
	 */
	EOperation getCustomerAccount__ViewRoom();

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
		EOperation CUSTOMER_ACCOUNT___CREATE_ACCOUNT = eINSTANCE.getCustomerAccount__CreateAccount();

		/**
		 * The meta object literal for the '<em><b>Modify Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_ACCOUNT___MODIFY_ACCOUNT = eINSTANCE.getCustomerAccount__ModifyAccount();

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
		EOperation CUSTOMER_ACCOUNT___LOGOUT = eINSTANCE.getCustomerAccount__Logout();

		/**
		 * The meta object literal for the '<em><b>View Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_ACCOUNT___VIEW_ROOM = eINSTANCE.getCustomerAccount__ViewRoom();

	}

} //MdsdAccountPackage
