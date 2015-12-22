/**
 */
package Classes.mdsdBilling;

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
 * @see Classes.mdsdBilling.MdsdBillingFactory
 * @model kind="package"
 * @generated
 */
public interface MdsdBillingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mdsdBilling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/mdsdBilling.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.mdsdBilling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MdsdBillingPackage eINSTANCE = Classes.mdsdBilling.impl.MdsdBillingPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.mdsdBilling.StaffBilling <em>Staff Billing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdBilling.StaffBilling
	 * @see Classes.mdsdBilling.impl.MdsdBillingPackageImpl#getStaffBilling()
	 * @generated
	 */
	int STAFF_BILLING = 3;

	/**
	 * The number of structural features of the '<em>Staff Billing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BILLING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Modify Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BILLING___MODIFY_BILL = 0;

	/**
	 * The operation id for the '<em>Display Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BILLING___DISPLAY_BILL = 1;

	/**
	 * The operation id for the '<em>Give Refund</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BILLING___GIVE_REFUND = 2;

	/**
	 * The operation id for the '<em>Is Paid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BILLING___IS_PAID = 3;

	/**
	 * The operation id for the '<em>Print Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BILLING___PRINT_RECEIPT = 4;

	/**
	 * The number of operations of the '<em>Staff Billing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BILLING_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link Classes.mdsdBilling.impl.BillingControllerImpl <em>Billing Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdBilling.impl.BillingControllerImpl
	 * @see Classes.mdsdBilling.impl.MdsdBillingPackageImpl#getBillingController()
	 * @generated
	 */
	int BILLING_CONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Bills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_CONTROLLER__BILLS = STAFF_BILLING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Billing Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_CONTROLLER_FEATURE_COUNT = STAFF_BILLING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Modify Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_CONTROLLER___MODIFY_BILL = STAFF_BILLING___MODIFY_BILL;

	/**
	 * The operation id for the '<em>Display Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_CONTROLLER___DISPLAY_BILL = STAFF_BILLING___DISPLAY_BILL;

	/**
	 * The operation id for the '<em>Give Refund</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_CONTROLLER___GIVE_REFUND = STAFF_BILLING___GIVE_REFUND;

	/**
	 * The operation id for the '<em>Is Paid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_CONTROLLER___IS_PAID = STAFF_BILLING___IS_PAID;

	/**
	 * The operation id for the '<em>Print Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_CONTROLLER___PRINT_RECEIPT = STAFF_BILLING___PRINT_RECEIPT;

	/**
	 * The operation id for the '<em>Add Transaction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_CONTROLLER___ADD_TRANSACTION__STRING_FLOAT_BOOKING = STAFF_BILLING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Confirm Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_CONTROLLER___CONFIRM_PAYMENT = STAFF_BILLING_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_CONTROLLER___CREATE_BILL = STAFF_BILLING_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Billing Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_CONTROLLER_OPERATION_COUNT = STAFF_BILLING_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link Classes.mdsdBilling.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdBilling.impl.BillImpl
	 * @see Classes.mdsdBilling.impl.MdsdBillingPackageImpl#getBill()
	 * @generated
	 */
	int BILL = 1;

	/**
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__IS_PAID = 0;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__TRANSACTIONS = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__ID = 2;

	/**
	 * The number of structural features of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Total Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___GET_TOTAL_AMOUNT = 0;

	/**
	 * The number of operations of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Classes.mdsdBilling.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdBilling.impl.TransactionImpl
	 * @see Classes.mdsdBilling.impl.MdsdBillingPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PRICE = 1;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.mdsdBilling.BookingToBill <em>Booking To Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdBilling.BookingToBill
	 * @see Classes.mdsdBilling.impl.MdsdBillingPackageImpl#getBookingToBill()
	 * @generated
	 */
	int BOOKING_TO_BILL = 4;

	/**
	 * The number of structural features of the '<em>Booking To Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_TO_BILL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Transaction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_TO_BILL___ADD_TRANSACTION__STRING_FLOAT_BOOKING = 0;

	/**
	 * The number of operations of the '<em>Booking To Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_TO_BILL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Classes.mdsdBilling.CustomerBilling <em>Customer Billing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.mdsdBilling.CustomerBilling
	 * @see Classes.mdsdBilling.impl.MdsdBillingPackageImpl#getCustomerBilling()
	 * @generated
	 */
	int CUSTOMER_BILLING = 5;

	/**
	 * The number of structural features of the '<em>Customer Billing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Confirm Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING___CONFIRM_PAYMENT = 0;

	/**
	 * The number of operations of the '<em>Customer Billing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_BILLING_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link Classes.mdsdBilling.BillingController <em>Billing Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Billing Controller</em>'.
	 * @see Classes.mdsdBilling.BillingController
	 * @generated
	 */
	EClass getBillingController();

	/**
	 * Returns the meta object for the containment reference list '{@link Classes.mdsdBilling.BillingController#getBills <em>Bills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bills</em>'.
	 * @see Classes.mdsdBilling.BillingController#getBills()
	 * @see #getBillingController()
	 * @generated
	 */
	EReference getBillingController_Bills();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBilling.BillingController#createBill() <em>Create Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Bill</em>' operation.
	 * @see Classes.mdsdBilling.BillingController#createBill()
	 * @generated
	 */
	EOperation getBillingController__CreateBill();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdBilling.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see Classes.mdsdBilling.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBilling.Bill#isPaid <em>Is Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Paid</em>'.
	 * @see Classes.mdsdBilling.Bill#isPaid()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_IsPaid();

	/**
	 * Returns the meta object for the containment reference list '{@link Classes.mdsdBilling.Bill#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transactions</em>'.
	 * @see Classes.mdsdBilling.Bill#getTransactions()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Transactions();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBilling.Bill#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Classes.mdsdBilling.Bill#getID()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_ID();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBilling.Bill#getTotalAmount() <em>Get Total Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Total Amount</em>' operation.
	 * @see Classes.mdsdBilling.Bill#getTotalAmount()
	 * @generated
	 */
	EOperation getBill__GetTotalAmount();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdBilling.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see Classes.mdsdBilling.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBilling.Transaction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Classes.mdsdBilling.Transaction#getDescription()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Description();

	/**
	 * Returns the meta object for the attribute '{@link Classes.mdsdBilling.Transaction#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Classes.mdsdBilling.Transaction#getPrice()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Price();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdBilling.StaffBilling <em>Staff Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Billing</em>'.
	 * @see Classes.mdsdBilling.StaffBilling
	 * @generated
	 */
	EClass getStaffBilling();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBilling.StaffBilling#modifyBill() <em>Modify Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modify Bill</em>' operation.
	 * @see Classes.mdsdBilling.StaffBilling#modifyBill()
	 * @generated
	 */
	EOperation getStaffBilling__ModifyBill();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBilling.StaffBilling#displayBill() <em>Display Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display Bill</em>' operation.
	 * @see Classes.mdsdBilling.StaffBilling#displayBill()
	 * @generated
	 */
	EOperation getStaffBilling__DisplayBill();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBilling.StaffBilling#giveRefund() <em>Give Refund</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Give Refund</em>' operation.
	 * @see Classes.mdsdBilling.StaffBilling#giveRefund()
	 * @generated
	 */
	EOperation getStaffBilling__GiveRefund();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBilling.StaffBilling#isPaid() <em>Is Paid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Paid</em>' operation.
	 * @see Classes.mdsdBilling.StaffBilling#isPaid()
	 * @generated
	 */
	EOperation getStaffBilling__IsPaid();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBilling.StaffBilling#printReceipt() <em>Print Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print Receipt</em>' operation.
	 * @see Classes.mdsdBilling.StaffBilling#printReceipt()
	 * @generated
	 */
	EOperation getStaffBilling__PrintReceipt();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdBilling.BookingToBill <em>Booking To Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking To Bill</em>'.
	 * @see Classes.mdsdBilling.BookingToBill
	 * @generated
	 */
	EClass getBookingToBill();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBilling.BookingToBill#addTransaction(java.lang.String, float, Classes.mdsdBooking.Booking) <em>Add Transaction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Transaction</em>' operation.
	 * @see Classes.mdsdBilling.BookingToBill#addTransaction(java.lang.String, float, Classes.mdsdBooking.Booking)
	 * @generated
	 */
	EOperation getBookingToBill__AddTransaction__String_float_Booking();

	/**
	 * Returns the meta object for class '{@link Classes.mdsdBilling.CustomerBilling <em>Customer Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Billing</em>'.
	 * @see Classes.mdsdBilling.CustomerBilling
	 * @generated
	 */
	EClass getCustomerBilling();

	/**
	 * Returns the meta object for the '{@link Classes.mdsdBilling.CustomerBilling#confirmPayment() <em>Confirm Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Confirm Payment</em>' operation.
	 * @see Classes.mdsdBilling.CustomerBilling#confirmPayment()
	 * @generated
	 */
	EOperation getCustomerBilling__ConfirmPayment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MdsdBillingFactory getMdsdBillingFactory();

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
		 * The meta object literal for the '{@link Classes.mdsdBilling.impl.BillingControllerImpl <em>Billing Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdBilling.impl.BillingControllerImpl
		 * @see Classes.mdsdBilling.impl.MdsdBillingPackageImpl#getBillingController()
		 * @generated
		 */
		EClass BILLING_CONTROLLER = eINSTANCE.getBillingController();

		/**
		 * The meta object literal for the '<em><b>Bills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLING_CONTROLLER__BILLS = eINSTANCE.getBillingController_Bills();

		/**
		 * The meta object literal for the '<em><b>Create Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILLING_CONTROLLER___CREATE_BILL = eINSTANCE.getBillingController__CreateBill();

		/**
		 * The meta object literal for the '{@link Classes.mdsdBilling.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdBilling.impl.BillImpl
		 * @see Classes.mdsdBilling.impl.MdsdBillingPackageImpl#getBill()
		 * @generated
		 */
		EClass BILL = eINSTANCE.getBill();

		/**
		 * The meta object literal for the '<em><b>Is Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__IS_PAID = eINSTANCE.getBill_IsPaid();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__TRANSACTIONS = eINSTANCE.getBill_Transactions();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__ID = eINSTANCE.getBill_ID();

		/**
		 * The meta object literal for the '<em><b>Get Total Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___GET_TOTAL_AMOUNT = eINSTANCE.getBill__GetTotalAmount();

		/**
		 * The meta object literal for the '{@link Classes.mdsdBilling.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdBilling.impl.TransactionImpl
		 * @see Classes.mdsdBilling.impl.MdsdBillingPackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__DESCRIPTION = eINSTANCE.getTransaction_Description();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__PRICE = eINSTANCE.getTransaction_Price();

		/**
		 * The meta object literal for the '{@link Classes.mdsdBilling.StaffBilling <em>Staff Billing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdBilling.StaffBilling
		 * @see Classes.mdsdBilling.impl.MdsdBillingPackageImpl#getStaffBilling()
		 * @generated
		 */
		EClass STAFF_BILLING = eINSTANCE.getStaffBilling();

		/**
		 * The meta object literal for the '<em><b>Modify Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_BILLING___MODIFY_BILL = eINSTANCE.getStaffBilling__ModifyBill();

		/**
		 * The meta object literal for the '<em><b>Display Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_BILLING___DISPLAY_BILL = eINSTANCE.getStaffBilling__DisplayBill();

		/**
		 * The meta object literal for the '<em><b>Give Refund</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_BILLING___GIVE_REFUND = eINSTANCE.getStaffBilling__GiveRefund();

		/**
		 * The meta object literal for the '<em><b>Is Paid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_BILLING___IS_PAID = eINSTANCE.getStaffBilling__IsPaid();

		/**
		 * The meta object literal for the '<em><b>Print Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_BILLING___PRINT_RECEIPT = eINSTANCE.getStaffBilling__PrintReceipt();

		/**
		 * The meta object literal for the '{@link Classes.mdsdBilling.BookingToBill <em>Booking To Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdBilling.BookingToBill
		 * @see Classes.mdsdBilling.impl.MdsdBillingPackageImpl#getBookingToBill()
		 * @generated
		 */
		EClass BOOKING_TO_BILL = eINSTANCE.getBookingToBill();

		/**
		 * The meta object literal for the '<em><b>Add Transaction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_TO_BILL___ADD_TRANSACTION__STRING_FLOAT_BOOKING = eINSTANCE.getBookingToBill__AddTransaction__String_float_Booking();

		/**
		 * The meta object literal for the '{@link Classes.mdsdBilling.CustomerBilling <em>Customer Billing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.mdsdBilling.CustomerBilling
		 * @see Classes.mdsdBilling.impl.MdsdBillingPackageImpl#getCustomerBilling()
		 * @generated
		 */
		EClass CUSTOMER_BILLING = eINSTANCE.getCustomerBilling();

		/**
		 * The meta object literal for the '<em><b>Confirm Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_BILLING___CONFIRM_PAYMENT = eINSTANCE.getCustomerBilling__ConfirmPayment();

	}

} //MdsdBillingPackage
