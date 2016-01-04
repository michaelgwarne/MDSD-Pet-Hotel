/**
 */
package Classes.mdsdAdmin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.mdsdAdmin.MdsdAdminPackage#getAdmin()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Admin extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" typeRequired="true" typeOrdered="false" statusRequired="true" statusOrdered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	Room addRoom(String type, String status, int room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numberRequired="true" numberOrdered="false"
	 * @generated
	 */
	void removeRoom(int number);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false" rankRequired="true" rankOrdered="false" SSNRequired="true" SSNOrdered="false"
	 * @generated
	 */
	void createStaff(String name, int rank, String SSN);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSNRequired="true" SSNOrdered="false"
	 * @generated
	 */
	void removeStaff(String SSN);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSNRequired="true" SSNOrdered="false"
	 * @generated
	 */
	void modifyStaff(String SSN);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void displayStaff();

} // Admin
