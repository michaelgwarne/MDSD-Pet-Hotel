/**
 */
package Classes.mdsdAdmin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdAdmin.Room#getType <em>Type</em>}</li>
 *   <li>{@link Classes.mdsdAdmin.Room#getStatus <em>Status</em>}</li>
 *   <li>{@link Classes.mdsdAdmin.Room#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see Classes.mdsdAdmin.MdsdAdminPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see Classes.mdsdAdmin.MdsdAdminPackage#getRoom_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link Classes.mdsdAdmin.Room#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see Classes.mdsdAdmin.MdsdAdminPackage#getRoom_Status()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link Classes.mdsdAdmin.Room#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see Classes.mdsdAdmin.MdsdAdminPackage#getRoom_Number()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link Classes.mdsdAdmin.Room#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

} // Room
