/**
 */
package Classes.mdsdAdmin;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking To Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.mdsdAdmin.MdsdAdminPackage#getBookingToAdmin()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BookingToAdmin extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getPetTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Room> getAvailableRooms();

} // BookingToAdmin
