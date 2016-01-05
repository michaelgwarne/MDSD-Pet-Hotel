/**
 */
package Classes.mdsdAccount;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdAccount.AccountController#getCustomers <em>Customers</em>}</li>
 * </ul>
 *
 * @see Classes.mdsdAccount.MdsdAccountPackage#getAccountController()
 * @model
 * @generated
 */
public interface AccountController extends BookingToAccount, CustomerAccount {
	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.mdsdAccount.Customer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see Classes.mdsdAccount.MdsdAccountPackage#getAccountController_Customers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Customer> getCustomers();
	

} // AccountController
