/**
 */
package Classes.mdsdBooking.impl;

import Classes.mdsdAdmin.Room;

import Classes.mdsdBooking.Booking;
import Classes.mdsdBooking.BookingController;
import Classes.mdsdBooking.MdsdBookingFactory;
import Classes.mdsdBooking.MdsdBookingPackage;
import Classes.mdsdBooking.StaffBooking;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdBooking.impl.BookingControllerImpl#getBookings <em>Bookings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingControllerImpl extends MinimalEObjectImpl.Container implements BookingController {
	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> bookings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdsdBookingPackage.Literals.BOOKING_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getBookings() {
		if (bookings == null) {
			bookings = new EObjectContainmentEList<Booking>(Booking.class, this, MdsdBookingPackage.BOOKING_CONTROLLER__BOOKINGS);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modifyBooking(String email, String bookingId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBooking(String name, String bookingId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking displayBookings(String email) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void confirmBooking(String bookingId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkIn(String name, String bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOut(String name, String bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRoomStatus(String status, Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking enterCustomerInfo(String customerName, String customerEmail) {
		Booking booking = MdsdBookingFactory.eINSTANCE.createBooking();
		booking.setCustomerName(customerName);
		booking.setCustomerEmail(customerEmail);
		EList <Booking> pastBooking = getBookingList(customerEmail);
		
		booking.setBookingId(customerEmail + pastBooking.size());
		
		getBookings().add(booking);
		
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void enterDatesOfStay(Date stayFrom, Date stayTo, Booking booking) {
		booking.setDateFrom(stayFrom);
		booking.setDateTo(stayTo);
		// TODO: test against other bookings
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns the list of Bookings created using the email address
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> getBookingList(String email) {
		EList <Booking> temp = getBookings();
		EList <Booking> history = new BasicEList<Booking>();
		for (Booking booking : temp) {
			if(booking.getCustomerEmail().equalsIgnoreCase(email)){
				history.add(booking);
			}
		}
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MdsdBookingPackage.BOOKING_CONTROLLER__BOOKINGS:
				return ((InternalEList<?>)getBookings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdsdBookingPackage.BOOKING_CONTROLLER__BOOKINGS:
				return getBookings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MdsdBookingPackage.BOOKING_CONTROLLER__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection<? extends Booking>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MdsdBookingPackage.BOOKING_CONTROLLER__BOOKINGS:
				getBookings().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MdsdBookingPackage.BOOKING_CONTROLLER__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == StaffBooking.class) {
			switch (baseOperationID) {
				case MdsdBookingPackage.STAFF_BOOKING___CHECK_IN__STRING_STRING: return MdsdBookingPackage.BOOKING_CONTROLLER___CHECK_IN__STRING_STRING;
				case MdsdBookingPackage.STAFF_BOOKING___CHECK_OUT__STRING_STRING: return MdsdBookingPackage.BOOKING_CONTROLLER___CHECK_OUT__STRING_STRING;
				case MdsdBookingPackage.STAFF_BOOKING___CHANGE_ROOM_STATUS__STRING_ROOM: return MdsdBookingPackage.BOOKING_CONTROLLER___CHANGE_ROOM_STATUS__STRING_ROOM;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MdsdBookingPackage.BOOKING_CONTROLLER___MODIFY_BOOKING__STRING_STRING:
				modifyBooking((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case MdsdBookingPackage.BOOKING_CONTROLLER___CANCEL_BOOKING__STRING_STRING:
				cancelBooking((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case MdsdBookingPackage.BOOKING_CONTROLLER___DISPLAY_BOOKINGS__STRING:
				return displayBookings((String)arguments.get(0));
			case MdsdBookingPackage.BOOKING_CONTROLLER___CONFIRM_BOOKING__STRING:
				confirmBooking((String)arguments.get(0));
				return null;
			case MdsdBookingPackage.BOOKING_CONTROLLER___ENTER_CUSTOMER_INFO__STRING_STRING:
				return enterCustomerInfo((String)arguments.get(0), (String)arguments.get(1));
			case MdsdBookingPackage.BOOKING_CONTROLLER___ENTER_DATES_OF_STAY__DATE_DATE_BOOKING:
				enterDatesOfStay((Date)arguments.get(0), (Date)arguments.get(1), (Booking)arguments.get(2));
				return null;
			case MdsdBookingPackage.BOOKING_CONTROLLER___CHECK_IN__STRING_STRING:
				checkIn((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case MdsdBookingPackage.BOOKING_CONTROLLER___CHECK_OUT__STRING_STRING:
				checkOut((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case MdsdBookingPackage.BOOKING_CONTROLLER___CHANGE_ROOM_STATUS__STRING_ROOM:
				changeRoomStatus((String)arguments.get(0), (Room)arguments.get(1));
				return null;
			case MdsdBookingPackage.BOOKING_CONTROLLER___GET_BOOKING_LIST__STRING:
				return getBookingList((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingControllerImpl
