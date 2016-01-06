/**
 */
package Classes.mdsdBilling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Billing</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.mdsdBilling.MdsdBillingPackage#getStaffBilling()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StaffBilling extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model transactionRequired="true" transactionOrdered="false" billIDRequired="true" billIDOrdered="false" newPriceRequired="true" newPriceOrdered="false"
	 * @generated
	 */
	void modifyBill(String transaction, String billID, float newPrice);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model transactionRequired="true" transactionOrdered="false" billIdRequired="true" billIdOrdered="false"
	 * @generated
	 */
	void giveRefund(String transaction, String billId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	boolean isPaid(String billID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	void printReceipt(String billID);

} // StaffBilling
