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
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" rankRequired="true" rankOrdered="false" SSNRequired="true" SSNOrdered="false" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	HotelStaff createStaff(String name, int rank, String SSN, String password);

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
	 * @model SSNRequired="true" SSNOrdered="false" newNameRequired="true" newNameOrdered="false" newRankRequired="true" newRankOrdered="false"
	 * @generated
	 */
	void modifyStaff(String SSN, String newName, int newRank);

} // Admin
