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
	 * @model required="true" ordered="false" customerNameRequired="true" customerNameOrdered="false" customerEmailRequired="true" customerEmailOrdered="false" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	Account createAccount(String customerName, String customerEmail, String password);

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
	 * @return 
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
	 * @model nameRequired="true" nameOrdered="false" typeRequired="true" typeOrdered="false" accountIDRequired="true" accountIDOrdered="false"
	 * @generated
	 */
	void addPet(String name, String type, String accountID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false" typeRequired="true" typeOrdered="false" accountIDRequired="true" accountIDOrdered="false"
	 * @generated
	 */
	void removePet(String name, String type, String accountID);

} // CustomerAccount
