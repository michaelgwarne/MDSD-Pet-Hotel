/**
 */
package Classes.mdsdBooking;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdBooking.BookingController#getBookings <em>Bookings</em>}</li>
 * </ul>
 *
 * @see Classes.mdsdBooking.MdsdBookingPackage#getBookingController()
 * @model
 * @generated
 */
public interface BookingController extends UserBooking, StaffBooking {
	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' containment reference list.
	 * The list contents are of type {@link Classes.mdsdBooking.Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' containment reference list.
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getBookingController_Bookings()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Booking> getBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerNameRequired="true" customerNameOrdered="false" customerEmailRequired="true" customerEmailOrdered="false"
	 * @generated
	 */
	void enterCustomerInfo(String customerName, String customerEmail);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stayFromRequired="true" stayFromOrdered="false" stayToRequired="true" stayToOrdered="false"
	 * @generated
	 */
	void enterDatesOfStay(Date stayFrom, Date stayTo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String generateId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	EList<Booking> getBookingList(String email);

} // BookingController
