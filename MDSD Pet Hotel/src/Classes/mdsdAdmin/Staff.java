/**
 */
package Classes.mdsdAdmin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.mdsdAdmin.MdsdAdminPackage#getStaff()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Staff extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssnRequired="true" ssnOrdered="false" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	void staffLogin(String ssn, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssnRequired="true" ssnOrdered="false" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	void staffLogout(String ssn, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void displayRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model statusRequired="true" statusOrdered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void changeRoomStatus(String status, int roomNumber);

} // Staff
