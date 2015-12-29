/**
 */
package Classes.mdsdBooking;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.mdsdBooking.MdsdBookingPackage#getStaffBooking()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StaffBooking extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	void checkIn(String name, String bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	void checkOut(String name, String bookingID);

} // StaffBooking
