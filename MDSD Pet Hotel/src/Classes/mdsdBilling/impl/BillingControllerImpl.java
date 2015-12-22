/**
 */
package Classes.mdsdBilling.impl;

import Classes.mdsdBilling.Bill;
import Classes.mdsdBilling.BillingController;
import Classes.mdsdBilling.BookingToBill;
import Classes.mdsdBilling.CustomerBilling;
import Classes.mdsdBilling.MdsdBillingPackage;

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
	public void modifyBill() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayBill() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void giveRefund() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isPaid() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void printReceipt() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addTransaction(String description, float amount, Booking Booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public void createBill() {
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
			case MdsdBillingPackage.BILLING_CONTROLLER___MODIFY_BILL:
				modifyBill();
				return null;
			case MdsdBillingPackage.BILLING_CONTROLLER___DISPLAY_BILL:
				displayBill();
				return null;
			case MdsdBillingPackage.BILLING_CONTROLLER___GIVE_REFUND:
				giveRefund();
				return null;
			case MdsdBillingPackage.BILLING_CONTROLLER___IS_PAID:
				isPaid();
				return null;
			case MdsdBillingPackage.BILLING_CONTROLLER___PRINT_RECEIPT:
				printReceipt();
				return null;
			case MdsdBillingPackage.BILLING_CONTROLLER___ADD_TRANSACTION__STRING_FLOAT_BOOKING:
				addTransaction((String)arguments.get(0), (Float)arguments.get(1), (Booking)arguments.get(2));
				return null;
			case MdsdBillingPackage.BILLING_CONTROLLER___CONFIRM_PAYMENT:
				confirmPayment();
				return null;
			case MdsdBillingPackage.BILLING_CONTROLLER___CREATE_BILL:
				createBill();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BillingControllerImpl
