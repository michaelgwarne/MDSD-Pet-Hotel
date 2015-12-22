/**
 */
package Classes.mdsdAccount;

import Classes.Account;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking To Account</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.mdsdAccount.MdsdAccountPackage#getBookingToAccount()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BookingToAccount extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	Account getAccount(String email);

} // BookingToAccount
