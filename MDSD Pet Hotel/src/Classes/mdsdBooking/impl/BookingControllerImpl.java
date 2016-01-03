/**
 */
package Classes.mdsdBooking.impl;

import Classes.mdsdAdmin.Room;

import Classes.mdsdBooking.Booking;
import Classes.mdsdBooking.BookingController;
import Classes.mdsdBooking.MdsdBookingFactory;
import Classes.mdsdBooking.MdsdBookingPackage;
import Classes.mdsdBooking.Meal;
import Classes.mdsdBooking.Service;
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
 *   <li>{@link Classes.mdsdBooking.impl.BookingControllerImpl#getServices <em>Services</em>}</li>
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
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

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
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, MdsdBookingPackage.BOOKING_CONTROLLER__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modifyBooking(String bookingId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void cancelBooking(String bookingId) {
		// TODO: test
		for (Booking booking : bookings) {
			if(booking.getBookingId().equalsIgnoreCase(bookingId)){
				bookings.remove(booking);
				break;
			}
		}
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
	 * @generated NOT
	 */
	public void enterCustomerInfo(String customerName, String customerEmail, Booking booking, String petName, EList<Room> rooms) {
		booking.setCustomerName(customerName);
		booking.setCustomerEmail(customerEmail);
		booking.setPetName(petName);
		EList <Booking> pastBooking = getBookingList(customerEmail);
		booking.setBookingId(customerEmail + pastBooking.size());
		getBookings().remove(booking);
		getBookings().add(booking);
		for(Room room : rooms){
			if(room.getNumber() == booking.getRoomNumber()){
				room.setStatus("booked");
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking enterDatesOfStay(Date stayFrom, Date stayTo, EList<Room> rooms, String petType) {
		/* if stayTo is before StayFrom or either date
		 * is before the time the booking is made
		 * the booking fails and returns null
		 */
		if(stayFrom.after(stayTo) || stayFrom.before(new Date(System.currentTimeMillis())) 
				|| (stayTo.before(new Date(System.currentTimeMillis())))) return null;

		Booking booking = MdsdBookingFactory.eINSTANCE.createBooking();
		/* if rooms are available and match the pet type
		 * the first in the list is given to the booking
		 */
		if(rooms.size() > 0){
			for (Room room : rooms) {
				if((room.getType().equalsIgnoreCase(petType)) 
						&& (room.getStatus().equalsIgnoreCase("available"))){
					booking.setRoomNumber(room.getNumber());
					booking.setDateFrom(stayFrom);
					booking.setDateTo(stayTo);
					getBookings().add(booking);
					return booking;
				}
			}
		}
		// if no rooms available test existing bookings against the dates of stay
		EList <Booking> temp = getBookings();
		EList <Booking> temp2 = new BasicEList<Booking>();
		temp2.addAll(temp);
		int i = 0;
		for (Booking booking2 : getBookings()) {
			// test if dates wanted overlap with dates on the booking
			if(((stayFrom.after(booking2.getDateFrom()) || stayFrom.equals(booking2.getDateFrom())) 
					&&(stayFrom.before(booking2.getDateTo()) || stayFrom.equals(booking2.getDateTo())))
					||((stayTo.after(booking2.getDateFrom()) || stayTo.equals(booking2.getDateFrom()))
							&& (stayTo.before(booking2.getDateTo()) || stayTo.equals(booking2.getDateTo())))){
				// remove all bookings with that room number from the temporary list
				i = booking2.getRoomNumber();
				for (Booking booking3 : temp) {
					if(booking3.getRoomNumber() ==  i){

						temp2.remove(booking3);
					}
				}
			}
		}
		/* if the temp2 list is not empty then use the room number from the first index
		 * that has the correct room type, else return null
		 */
		if(temp2.size() > 0){
			for (Room room : rooms) {
				if((room.getType().equalsIgnoreCase(petType)) 
						&& !(room.getStatus().equalsIgnoreCase("available"))){
					booking.setRoomNumber(room.getNumber());
					booking.setDateFrom(stayFrom);
					booking.setDateTo(stayTo);
					getBookings().add(booking);
					return booking;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void enterMealInfo(String foodType, String schedule, float amountOfFood, float price, String bookingId) {
		// TODO: test
		Meal meal = MdsdBookingFactory.eINSTANCE.createMeal();
		meal.setFoodType(foodType);
		meal.setSchedule(schedule);
		meal.setAmountOfFood(amountOfFood);
		meal.setPrice(price);
		for (Booking booking : bookings) {
			if(booking.getBookingId().equalsIgnoreCase(bookingId)){
				booking.setMealInfo(meal);
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void enterService(Service service, String bookingId) {
		// TODO: test
		for (Booking booking : bookings) {
			if(booking.getBookingId().equalsIgnoreCase(bookingId)){
				booking.getBookedServices().add(service);
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkIn(String bookingID, EList<Room> rooms) {
		// TODO: test
		for (Booking booking : bookings) {
			if(booking.getBookingId() == bookingID){
				booking.setIsCheckedOut(false);
				booking.setIsCheckedIn(true);
				for(Room room : rooms){
					if(room.getNumber() == booking.getRoomNumber()){
						room.setStatus("occupied");
						break;
					}
				}
			}
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkOut(String bookingID, EList<Room> rooms) {
		for (Booking booking : bookings) {
			if(booking.getBookingId() == bookingID){
				booking.setIsCheckedOut(true);
				booking.setIsCheckedIn(false);
				for(Room room : rooms){
					if(room.getNumber() == booking.getRoomNumber()){
						room.setStatus("dirty");
						break;
					}
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkIn(String bookingID, Room rooms) {
		// TODO: test
		for (Booking booking : bookings) {
			if(booking.getBookingId() == bookingID){
				booking.setIsCheckedOut(false);
				booking.setIsCheckedIn(true);
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkOut(String bookingID, Room rooms) {
		for (Booking booking : bookings) {
			// TODO: test
			if(booking.getBookingId() == bookingID){
				booking.setIsCheckedOut(true);
				booking.setIsCheckedIn(false);
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addNewService(String description, float price) {
		// TODO: test
		Service service = MdsdBookingFactory.eINSTANCE.createService();
		service.setDescription(description);
		service.setPrice(price);
		getServices().add(service);
	}

	/**
	 * <!-- begin-user-doc -->
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
		case MdsdBookingPackage.BOOKING_CONTROLLER__SERVICES:
			return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
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
		case MdsdBookingPackage.BOOKING_CONTROLLER__SERVICES:
			return getServices();
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
		case MdsdBookingPackage.BOOKING_CONTROLLER__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends Service>)newValue);
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
		case MdsdBookingPackage.BOOKING_CONTROLLER__SERVICES:
			getServices().clear();
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
		case MdsdBookingPackage.BOOKING_CONTROLLER__SERVICES:
			return services != null && !services.isEmpty();
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
			case MdsdBookingPackage.STAFF_BOOKING___CHECK_IN__STRING_ELIST: return MdsdBookingPackage.BOOKING_CONTROLLER___CHECK_IN__STRING_ELIST;
			case MdsdBookingPackage.STAFF_BOOKING___CHECK_OUT__STRING_ELIST: return MdsdBookingPackage.BOOKING_CONTROLLER___CHECK_OUT__STRING_ELIST;
			case MdsdBookingPackage.STAFF_BOOKING___ADD_NEW_SERVICE__STRING_FLOAT: return MdsdBookingPackage.BOOKING_CONTROLLER___ADD_NEW_SERVICE__STRING_FLOAT;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MdsdBookingPackage.BOOKING_CONTROLLER___MODIFY_BOOKING__STRING:
			modifyBooking((String)arguments.get(0));
			return null;
		case MdsdBookingPackage.BOOKING_CONTROLLER___CANCEL_BOOKING__STRING:
			cancelBooking((String)arguments.get(0));
			return null;
		case MdsdBookingPackage.BOOKING_CONTROLLER___CONFIRM_BOOKING__STRING:
			confirmBooking((String)arguments.get(0));
			return null;
		case MdsdBookingPackage.BOOKING_CONTROLLER___ENTER_CUSTOMER_INFO__STRING_STRING_BOOKING_STRING_ELIST:
			enterCustomerInfo((String)arguments.get(0), (String)arguments.get(1), (Booking)arguments.get(2), (String)arguments.get(3), (EList<Room>)arguments.get(4));
			return null;
		case MdsdBookingPackage.BOOKING_CONTROLLER___ENTER_DATES_OF_STAY__DATE_DATE_ELIST_STRING:
			return enterDatesOfStay((Date)arguments.get(0), (Date)arguments.get(1), (EList<Room>)arguments.get(2), (String)arguments.get(3));
		case MdsdBookingPackage.BOOKING_CONTROLLER___ENTER_MEAL_INFO__STRING_STRING_FLOAT_FLOAT_STRING:
			enterMealInfo((String)arguments.get(0), (String)arguments.get(1), (Float)arguments.get(2), (Float)arguments.get(3), (String)arguments.get(4));
			return null;
		case MdsdBookingPackage.BOOKING_CONTROLLER___ENTER_SERVICE__SERVICE_STRING:
			enterService((Service)arguments.get(0), (String)arguments.get(1));
			return null;
		case MdsdBookingPackage.BOOKING_CONTROLLER___CHECK_IN__STRING_ELIST:
			checkIn((String)arguments.get(0), (EList<Room>)arguments.get(1));
			return null;
		case MdsdBookingPackage.BOOKING_CONTROLLER___CHECK_OUT__STRING_ELIST:
			checkOut((String)arguments.get(0), (EList<Room>)arguments.get(1));
			return null;
		case MdsdBookingPackage.BOOKING_CONTROLLER___ADD_NEW_SERVICE__STRING_FLOAT:
			addNewService((String)arguments.get(0), (Float)arguments.get(1));
			return null;
		case MdsdBookingPackage.BOOKING_CONTROLLER___GET_BOOKING_LIST__STRING:
			return getBookingList((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingControllerImpl
