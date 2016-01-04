/**
 */
package Classes.mdsdAccount;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Account</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.mdsdAccount.MdsdAccountPackage#getCustomerAccount()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CustomerAccount extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerNameRequired="true" customerNameOrdered="false" customerEmailRequired="true" customerEmailOrdered="false"
	 * @generated
	 */
	void createAccount(String customerName, String customerEmail);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void modifyAccount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model emailRequired="true" emailOrdered="false" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	void login(String email, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void logout();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void viewRoom(int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false" typeRequired="true" typeOrdered="false"
	 * @generated
	 */
	void addPet(String name, String type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false" typeRequired="true" typeOrdered="false"
	 * @generated
	 */
	void removePet(String name, String type);

} // CustomerAccount
