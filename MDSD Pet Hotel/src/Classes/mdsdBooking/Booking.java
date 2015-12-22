/**
 */
package Classes.mdsdBooking;

import Classes.mdsdAdmin.Room;
import Classes.mdsdAdmin.Service;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdBooking.Booking#getCustomerName <em>Customer Name</em>}</li>
 *   <li>{@link Classes.mdsdBooking.Booking#getCustomerEmail <em>Customer Email</em>}</li>
 *   <li>{@link Classes.mdsdBooking.Booking#getBookingId <em>Booking Id</em>}</li>
 *   <li>{@link Classes.mdsdBooking.Booking#isCheckedIn <em>Is Checked In</em>}</li>
 *   <li>{@link Classes.mdsdBooking.Booking#isCheckedOut <em>Is Checked Out</em>}</li>
 *   <li>{@link Classes.mdsdBooking.Booking#getBookedServices <em>Booked Services</em>}</li>
 *   <li>{@link Classes.mdsdBooking.Booking#getMealInfo <em>Meal Info</em>}</li>
 *   <li>{@link Classes.mdsdBooking.Booking#getRoom <em>Room</em>}</li>
 *   <li>{@link Classes.mdsdBooking.Booking#getDateFrom <em>Date From</em>}</li>
 *   <li>{@link Classes.mdsdBooking.Booking#getDateTo <em>Date To</em>}</li>
 *   <li>{@link Classes.mdsdBooking.Booking#getBill_Id <em>Bill Id</em>}</li>
 *   <li>{@link Classes.mdsdBooking.Booking#getPetName <em>Pet Name</em>}</li>
 * </ul>
 *
 * @see Classes.mdsdBooking.MdsdBookingPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Customer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Name</em>' attribute.
	 * @see #setCustomerName(String)
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getBooking_CustomerName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCustomerName();

	/**
	 * Sets the value of the '{@link Classes.mdsdBooking.Booking#getCustomerName <em>Customer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Name</em>' attribute.
	 * @see #getCustomerName()
	 * @generated
	 */
	void setCustomerName(String value);

	/**
	 * Returns the value of the '<em><b>Customer Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Email</em>' attribute.
	 * @see #setCustomerEmail(String)
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getBooking_CustomerEmail()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCustomerEmail();

	/**
	 * Sets the value of the '{@link Classes.mdsdBooking.Booking#getCustomerEmail <em>Customer Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Email</em>' attribute.
	 * @see #getCustomerEmail()
	 * @generated
	 */
	void setCustomerEmail(String value);

	/**
	 * Returns the value of the '<em><b>Booking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Id</em>' attribute.
	 * @see #setBookingId(String)
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getBooking_BookingId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getBookingId();

	/**
	 * Sets the value of the '{@link Classes.mdsdBooking.Booking#getBookingId <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Id</em>' attribute.
	 * @see #getBookingId()
	 * @generated
	 */
	void setBookingId(String value);

	/**
	 * Returns the value of the '<em><b>Is Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Checked In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Checked In</em>' attribute.
	 * @see #setIsCheckedIn(boolean)
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getBooking_IsCheckedIn()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCheckedIn();

	/**
	 * Sets the value of the '{@link Classes.mdsdBooking.Booking#isCheckedIn <em>Is Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Checked In</em>' attribute.
	 * @see #isCheckedIn()
	 * @generated
	 */
	void setIsCheckedIn(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Checked Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Checked Out</em>' attribute.
	 * @see #setIsCheckedOut(boolean)
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getBooking_IsCheckedOut()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCheckedOut();

	/**
	 * Sets the value of the '{@link Classes.mdsdBooking.Booking#isCheckedOut <em>Is Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Checked Out</em>' attribute.
	 * @see #isCheckedOut()
	 * @generated
	 */
	void setIsCheckedOut(boolean value);

	/**
	 * Returns the value of the '<em><b>Booked Services</b></em>' reference list.
	 * The list contents are of type {@link Classes.mdsdAdmin.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booked Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booked Services</em>' reference list.
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getBooking_BookedServices()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Service> getBookedServices();

	/**
	 * Returns the value of the '<em><b>Meal Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meal Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meal Info</em>' containment reference.
	 * @see #setMealInfo(Meal)
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getBooking_MealInfo()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Meal getMealInfo();

	/**
	 * Sets the value of the '{@link Classes.mdsdBooking.Booking#getMealInfo <em>Meal Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meal Info</em>' containment reference.
	 * @see #getMealInfo()
	 * @generated
	 */
	void setMealInfo(Meal value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getBooking_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link Classes.mdsdBooking.Booking#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Date From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date From</em>' attribute.
	 * @see #setDateFrom(Date)
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getBooking_DateFrom()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDateFrom();

	/**
	 * Sets the value of the '{@link Classes.mdsdBooking.Booking#getDateFrom <em>Date From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date From</em>' attribute.
	 * @see #getDateFrom()
	 * @generated
	 */
	void setDateFrom(Date value);

	/**
	 * Returns the value of the '<em><b>Date To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date To</em>' attribute.
	 * @see #setDateTo(Date)
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getBooking_DateTo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDateTo();

	/**
	 * Sets the value of the '{@link Classes.mdsdBooking.Booking#getDateTo <em>Date To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date To</em>' attribute.
	 * @see #getDateTo()
	 * @generated
	 */
	void setDateTo(Date value);

	/**
	 * Returns the value of the '<em><b>Bill Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Id</em>' attribute.
	 * @see #setBill_Id(String)
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getBooking_Bill_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getBill_Id();

	/**
	 * Sets the value of the '{@link Classes.mdsdBooking.Booking#getBill_Id <em>Bill Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Id</em>' attribute.
	 * @see #getBill_Id()
	 * @generated
	 */
	void setBill_Id(String value);

	/**
	 * Returns the value of the '<em><b>Pet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pet Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pet Name</em>' attribute.
	 * @see #setPetName(String)
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getBooking_PetName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPetName();

	/**
	 * Sets the value of the '{@link Classes.mdsdBooking.Booking#getPetName <em>Pet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pet Name</em>' attribute.
	 * @see #getPetName()
	 * @generated
	 */
	void setPetName(String value);

} // Booking
