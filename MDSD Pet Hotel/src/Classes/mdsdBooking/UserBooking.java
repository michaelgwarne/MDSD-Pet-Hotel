/**
 */
package Classes.mdsdBooking;

import Classes.mdsdAdmin.Room;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

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
	 * @model bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	void confirmBooking(String bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerNameRequired="true" customerNameOrdered="false" customerEmailRequired="true" customerEmailOrdered="false" bookingRequired="true" bookingOrdered="false" petNameRequired="true" petNameOrdered="false"
	 * @generated
	 */
	void enterCustomerInfo(String customerName, String customerEmail, Booking booking, String petName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" stayFromRequired="true" stayFromOrdered="false" stayToRequired="true" stayToOrdered="false" roomsMany="true" roomsOrdered="false"
	 * @generated
	 */
	Booking enterDatesOfStay(Date stayFrom, Date stayTo, EList<Room> rooms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model foodTypeRequired="true" foodTypeOrdered="false" scheduleRequired="true" scheduleOrdered="false" amountOfFoodRequired="true" amountOfFoodOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void enterMealInfo(String foodType, String schedule, float amountOfFood, float price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceRequired="true" serviceOrdered="false"
	 * @generated
	 */
	void enterService(Service service);

} // UserBooking
