/**
 */
package Classes.mdsdBilling;

import Classes.mdsdBooking.Booking;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking To Bill</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.mdsdBilling.MdsdBillingPackage#getBookingToBill()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BookingToBill extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descriptionRequired="true" descriptionOrdered="false" amountRequired="true" amountOrdered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void addTransaction(String description, float amount, Booking booking);

} // BookingToBill
