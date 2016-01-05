/**
 */
package Classes.mdsdAccount;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdAccount.Account#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link Classes.mdsdAccount.Account#getPets <em>Pets</em>}</li>
 *   <li>{@link Classes.mdsdAccount.Account#getPassword <em></em>}</li>
 * </ul>
 *
 * @see Classes.mdsdAccount.MdsdAccountPackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends EObject {
	/**
	 * Returns the value of the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account ID</em>' attribute.
	 * @see #setAccountID(String)
	 * @see Classes.mdsdAccount.MdsdAccountPackage#getAccount_AccountID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAccountID();

	/**
	 * Sets the value of the '{@link Classes.mdsdAccount.Account#getAccountID <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account ID</em>' attribute.
	 * @see #getAccountID()
	 * @generated
	 */
	void setAccountID(String value);

	/**
	 * Returns the value of the '<em><b>Pets</b></em>' reference list.
	 * The list contents are of type {@link Classes.mdsdAccount.Pet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pets</em>' reference list.
	 * @see Classes.mdsdAccount.MdsdAccountPackage#getAccount_Pets()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Pet> getPets();

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see Classes.mdsdAccount.MdsdAccountPackage#getAccount_Password()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link Classes.mdsdAccount.Account#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);



} // Account
