/**
 */
package Classes.mdsdAdmin;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdAdmin.AdminController#getRooms <em>Rooms</em>}</li>
 *   <li>{@link Classes.mdsdAdmin.AdminController#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @see Classes.mdsdAdmin.MdsdAdminPackage#getAdminController()
 * @model
 * @generated
 */
public interface AdminController extends Admin, BookingToAdmin, Staff {
	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.mdsdAdmin.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see Classes.mdsdAdmin.MdsdAdminPackage#getAdminController_Rooms()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.mdsdAdmin.HotelStaff}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' containment reference list.
	 * @see Classes.mdsdAdmin.MdsdAdminPackage#getAdminController_Staff()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<HotelStaff> getStaff();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssnRequired="true" ssnOrdered="false" isLoggedInRequired="true" isLoggedInOrdered="false"
	 * @generated
	 */
	void isLoggedin(String ssn, boolean isLoggedIn);

} // AdminController
