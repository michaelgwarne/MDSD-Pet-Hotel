/**
 */
package Classes.mdsdBilling.impl;

import Classes.mdsdBilling.Bill;
import Classes.mdsdBilling.BillingController;
import Classes.mdsdBilling.BookingToBill;
import Classes.mdsdBilling.CustomerBilling;
import Classes.mdsdBilling.MdsdBillingFactory;
import Classes.mdsdBilling.MdsdBillingPackage;
import Classes.mdsdBilling.Transaction;
import Classes.mdsdBooking.Booking;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Billing Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdBilling.impl.BillingControllerImpl#getBills <em>Bills</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BillingControllerImpl extends MinimalEObjectImpl.Container implements BillingController {
	/**
	 * The cached value of the '{@link #getBills() <em>Bills</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBills()
	 * @generated
	 * @ordered
	 */
	protected EList<Bill> bills;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillingControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdsdBillingPackage.Literals.BILLING_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bill> getBills() {
		if (bills == null) {
			bills = new EObjectContainmentEList<Bill>(Bill.class, this, MdsdBillingPackage.BILLING_CONTROLLER__BILLS);
		}
		return bills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modifyBill(String transaction, String billID, float newPrice) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Bill displayBill(String billId) {
		// TODO: test
		Bill bill = MdsdBillingFactory.eINSTANCE.createBill();
		for(Bill tempBill : getBills()){
			if(tempBill.getID().equalsIgnoreCase(billId)){
				bill = tempBill;
				break;
			}
		}
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void giveRefund(String transaction, String billId) {
		// TODO: test
		for(Bill bill : getBills()){
			if(bill.getID().equalsIgnoreCase(billId)){
				for(Transaction transaction2 : bill.getTransactions()){
					if(transaction2.getDescription().equalsIgnoreCase(transaction)){
						transaction2.setPrice(0);
						transaction2.setDescription(transaction + " - REFUNDED");
						break;
					}
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isPaid(String billID) {
		boolean isPaid = false;
		for(Bill bill : getBills()){
			if(bill.getID().equalsIgnoreCase(billID)){
				isPaid = bill.isPaid();
				break;
			}
		}
		return isPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReceipt(String billID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addTransaction(String description, float amount, Booking booking) {
		// TODO: test
				Bill bill;
				Transaction transaction = MdsdBillingFactory.eINSTANCE.createTransaction();
				transaction.setDescription(description);
				transaction.setPrice(amount);
				if(booking.getBill_Id() == null){
					bill = MdsdBillingFactory.eINSTANCE.createBill();
					bill.getTransactions().add(transaction);
					bill.setID(booking.getBookingId());
				}
				else{
					for(Bill existingBill : getBills()){
						if(existingBill.getID().equalsIgnoreCase(booking.getBill_Id())){
							existingBill.getTransactions().add(transaction);
							break;
						}
					}
				}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void confirmPayment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MdsdBillingPackage.BILLING_CONTROLLER__BILLS:
				return ((InternalEList<?>)getBills()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdsdBillingPackage.BILLING_CONTROLLER__BILLS:
				return getBills();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MdsdBillingPackage.BILLING_CONTROLLER__BILLS:
				getBills().clear();
				getBills().addAll((Collection<? extends Bill>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MdsdBillingPackage.BILLING_CONTROLLER__BILLS:
				getBills().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MdsdBillingPackage.BILLING_CONTROLLER__BILLS:
				return bills != null && !bills.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == BookingToBill.class) {
			switch (baseOperationID) {
				case MdsdBillingPackage.BOOKING_TO_BILL___ADD_TRANSACTION__STRING_FLOAT_BOOKING: return MdsdBillingPackage.BILLING_CONTROLLER___ADD_TRANSACTION__STRING_FLOAT_BOOKING;
				default: return -1;
			}
		}
		if (baseClass == CustomerBilling.class) {
			switch (baseOperationID) {
				case MdsdBillingPackage.CUSTOMER_BILLING___CONFIRM_PAYMENT: return MdsdBillingPackage.BILLING_CONTROLLER___CONFIRM_PAYMENT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MdsdBillingPackage.BILLING_CONTROLLER___MODIFY_BILL__STRING_STRING_FLOAT:
				modifyBill((String)arguments.get(0), (String)arguments.get(1), (Float)arguments.get(2));
				return null;
			case MdsdBillingPackage.BILLING_CONTROLLER___DISPLAY_BILL__STRING:
				return displayBill((String)arguments.get(0));
			case MdsdBillingPackage.BILLING_CONTROLLER___GIVE_REFUND__STRING_STRING:
				giveRefund((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case MdsdBillingPackage.BILLING_CONTROLLER___IS_PAID__STRING:
				return isPaid((String)arguments.get(0));
			case MdsdBillingPackage.BILLING_CONTROLLER___PRINT_RECEIPT__STRING:
				printReceipt((String)arguments.get(0));
				return null;
			case MdsdBillingPackage.BILLING_CONTROLLER___ADD_TRANSACTION__STRING_FLOAT_BOOKING:
				addTransaction((String)arguments.get(0), (Float)arguments.get(1), (Booking)arguments.get(2));
				return null;
			case MdsdBillingPackage.BILLING_CONTROLLER___CONFIRM_PAYMENT:
				confirmPayment();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BillingControllerImpl
