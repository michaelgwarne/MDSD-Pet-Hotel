/**
 */
package Classes.mdsdBooking;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.mdsdBooking.MdsdBookingPackage#getUserBooking()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface UserBooking extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model emailRequired="true" emailOrdered="false" bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	void modifyBooking(String email, String bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false" bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	void cancelBooking(String name, String bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	Booking displayBookings(String email);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	void confirmBooking(String bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" customerNameRequired="true" customerNameOrdered="false" customerEmailRequired="true" customerEmailOrdered="false"
	 * @generated
	 */
	Booking enterCustomerInfo(String customerName, String customerEmail);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stayFromRequired="true" stayFromOrdered="false" stayToRequired="true" stayToOrdered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void enterDatesOfStay(Date stayFrom, Date stayTo, Booking booking);

} // UserBooking
