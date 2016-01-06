/**
 */
package Classes.mdsdBilling.impl;

import Classes.mdsdAccount.MdsdAccountPackage;

import Classes.mdsdAccount.impl.MdsdAccountPackageImpl;

import Classes.mdsdAdmin.MdsdAdminPackage;

import Classes.mdsdAdmin.impl.MdsdAdminPackageImpl;

import Classes.mdsdBilling.Bill;
import Classes.mdsdBilling.BillingController;
import Classes.mdsdBilling.BookingToBill;
import Classes.mdsdBilling.CustomerBilling;
import Classes.mdsdBilling.MdsdBillingFactory;
import Classes.mdsdBilling.MdsdBillingPackage;
import Classes.mdsdBilling.StaffBilling;
import Classes.mdsdBilling.Transaction;

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
public class MdsdBillingPackageImpl extends EPackageImpl implements MdsdBillingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billingControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffBillingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingToBillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerBillingEClass = null;

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
	 * @see Classes.mdsdBilling.MdsdBillingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MdsdBillingPackageImpl() {
		super(eNS_URI, MdsdBillingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MdsdBillingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MdsdBillingPackage init() {
		if (isInited) return (MdsdBillingPackage)EPackage.Registry.INSTANCE.getEPackage(MdsdBillingPackage.eNS_URI);

		// Obtain or create and register package
		MdsdBillingPackageImpl theMdsdBillingPackage = (MdsdBillingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MdsdBillingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MdsdBillingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MdsdBookingPackageImpl theMdsdBookingPackage = (MdsdBookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MdsdBookingPackage.eNS_URI) instanceof MdsdBookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MdsdBookingPackage.eNS_URI) : MdsdBookingPackage.eINSTANCE);
		MdsdAdminPackageImpl theMdsdAdminPackage = (MdsdAdminPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MdsdAdminPackage.eNS_URI) instanceof MdsdAdminPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MdsdAdminPackage.eNS_URI) : MdsdAdminPackage.eINSTANCE);
		MdsdAccountPackageImpl theMdsdAccountPackage = (MdsdAccountPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MdsdAccountPackage.eNS_URI) instanceof MdsdAccountPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MdsdAccountPackage.eNS_URI) : MdsdAccountPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theMdsdBillingPackage.createPackageContents();
		theMdsdBookingPackage.createPackageContents();
		theMdsdAdminPackage.createPackageContents();
		theMdsdAccountPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theMdsdBillingPackage.initializePackageContents();
		theMdsdBookingPackage.initializePackageContents();
		theMdsdAdminPackage.initializePackageContents();
		theMdsdAccountPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMdsdBillingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MdsdBillingPackage.eNS_URI, theMdsdBillingPackage);
		return theMdsdBillingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillingController() {
		return billingControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillingController_Bills() {
		return (EReference)billingControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBill() {
		return billEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_IsPaid() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBill_Transactions() {
		return (EReference)billEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_ID() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__GetTotalAmount() {
		return billEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransaction() {
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Description() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Price() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffBilling() {
		return staffBillingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffBilling__ModifyBill__String_String_float() {
		return staffBillingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffBilling__GiveRefund__String_String() {
		return staffBillingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffBilling__IsPaid__String() {
		return staffBillingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffBilling__PrintReceipt__String() {
		return staffBillingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingToBill() {
		return bookingToBillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingToBill__AddTransaction__String_float_Booking() {
		return bookingToBillEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerBilling() {
		return customerBillingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdsdBillingFactory getMdsdBillingFactory() {
		return (MdsdBillingFactory)getEFactoryInstance();
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
		billingControllerEClass = createEClass(BILLING_CONTROLLER);
		createEReference(billingControllerEClass, BILLING_CONTROLLER__BILLS);

		billEClass = createEClass(BILL);
		createEAttribute(billEClass, BILL__IS_PAID);
		createEReference(billEClass, BILL__TRANSACTIONS);
		createEAttribute(billEClass, BILL__ID);
		createEOperation(billEClass, BILL___GET_TOTAL_AMOUNT);

		transactionEClass = createEClass(TRANSACTION);
		createEAttribute(transactionEClass, TRANSACTION__DESCRIPTION);
		createEAttribute(transactionEClass, TRANSACTION__PRICE);

		staffBillingEClass = createEClass(STAFF_BILLING);
		createEOperation(staffBillingEClass, STAFF_BILLING___MODIFY_BILL__STRING_STRING_FLOAT);
		createEOperation(staffBillingEClass, STAFF_BILLING___GIVE_REFUND__STRING_STRING);
		createEOperation(staffBillingEClass, STAFF_BILLING___IS_PAID__STRING);
		createEOperation(staffBillingEClass, STAFF_BILLING___PRINT_RECEIPT__STRING);

		bookingToBillEClass = createEClass(BOOKING_TO_BILL);
		createEOperation(bookingToBillEClass, BOOKING_TO_BILL___ADD_TRANSACTION__STRING_FLOAT_BOOKING);

		customerBillingEClass = createEClass(CUSTOMER_BILLING);
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
		MdsdBookingPackage theMdsdBookingPackage = (MdsdBookingPackage)EPackage.Registry.INSTANCE.getEPackage(MdsdBookingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		billingControllerEClass.getESuperTypes().add(this.getStaffBilling());
		billingControllerEClass.getESuperTypes().add(this.getBookingToBill());
		billingControllerEClass.getESuperTypes().add(this.getCustomerBilling());

		// Initialize classes, features, and operations; add parameters
		initEClass(billingControllerEClass, BillingController.class, "BillingController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBillingController_Bills(), this.getBill(), null, "bills", null, 0, -1, BillingController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(billEClass, Bill.class, "Bill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBill_IsPaid(), ecorePackage.getEBoolean(), "isPaid", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_Transactions(), this.getTransaction(), null, "transactions", null, 0, -1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_ID(), ecorePackage.getEString(), "ID", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBill__GetTotalAmount(), ecorePackage.getEFloat(), "getTotalAmount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransaction_Description(), ecorePackage.getEString(), "description", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransaction_Price(), ecorePackage.getEFloat(), "price", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(staffBillingEClass, StaffBilling.class, "StaffBilling", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getStaffBilling__ModifyBill__String_String_float(), null, "modifyBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "transaction", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "billID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "newPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffBilling__GiveRefund__String_String(), null, "giveRefund", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "transaction", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "billId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffBilling__IsPaid__String(), ecorePackage.getEBoolean(), "isPaid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "billID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffBilling__PrintReceipt__String(), null, "printReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "billID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingToBillEClass, BookingToBill.class, "BookingToBill", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBookingToBill__AddTransaction__String_float_Booking(), null, "addTransaction", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMdsdBookingPackage.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(customerBillingEClass, CustomerBilling.class, "CustomerBilling", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MdsdBillingPackageImpl
