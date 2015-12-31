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
	 * @model bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	void checkIn(String bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	void checkOut(String bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descriptionRequired="true" descriptionOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void addNewService(String description, float price);

} // StaffBooking
