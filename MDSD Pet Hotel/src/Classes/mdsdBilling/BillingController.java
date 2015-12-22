/**
 */
package Classes.mdsdBilling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Billing Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdBilling.BillingController#getBills <em>Bills</em>}</li>
 * </ul>
 *
 * @see Classes.mdsdBilling.MdsdBillingPackage#getBillingController()
 * @model
 * @generated
 */
public interface BillingController extends StaffBilling, BookingToBill, CustomerBilling {
	/**
	 * Returns the value of the '<em><b>Bills</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.mdsdBilling.Bill}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bills</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bills</em>' containment reference list.
	 * @see Classes.mdsdBilling.MdsdBillingPackage#getBillingController_Bills()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Bill> getBills();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createBill();

} // BillingController
