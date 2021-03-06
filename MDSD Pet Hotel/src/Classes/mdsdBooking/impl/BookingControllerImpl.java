/**
 */
package Classes.mdsdBooking.impl;

import Classes.mdsdAdmin.Room;
import Classes.mdsdBilling.Bill;
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
	 * @author Michael Warne
	 * 
	 * @Description Removes the booking that matches the 
	 * booking ID from the booking list
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void cancelBooking(String bookingId) {
		
		for (Booking booking : bookings) {
			if(booking.getBookingId().equals(bookingId)){
				bookings.remove(booking);
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * @author Michael Warne
	 * @description Sets attributes in a booking and generates a 
	 * unique ID for the booking based on the number of past bookngs
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void enterCustomerInfo(String customerName, String customerEmail, Booking booking, String petName, EList<Room> rooms) {
		booking.setCustomerName(customerName);
		booking.setCustomerEmail(customerEmail);
		booking.setPetName(petName);
		// get a list of previous bookings made by the user
		// and use the size of the list to create a unique ID
		EList <Booking> pastBooking = getBookingList(customerEmail);
		booking.setBookingId(customerEmail + pastBooking.size());
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
	 * @author Michael Warne
	 * @description Tests if a booking can be made
	 * for the given dates of stay
	 * @return Booking if successful, Null if dates do not fit
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking enterDatesOfStay(Date stayFrom, Date stayTo, EList<Room> rooms, String petType) {
		// if hotel has no rooms return null
		if(rooms.size() == 0) return null;
		/* if stayTo is before StayFrom or either date
		 *  is before the time the booking is made
		 * the booking fails and returns null
		 */
		if(stayFrom.after(stayTo) || stayFrom.before(new Date(System.currentTimeMillis())) 
				|| (stayTo.before(new Date(System.currentTimeMillis())))) return null;

		Booking newBooking = MdsdBookingFactory.eINSTANCE.createBooking();
		/* if a room status is "available" and matches the pet type
		 * the first found in the list is given to the booking
		 */
			for (Room room : rooms) {
				if((room.getType().equalsIgnoreCase(petType)) 
						&& (room.getStatus().equalsIgnoreCase("available"))){
					newBooking.setRoomNumber(room.getNumber());
					newBooking.setDateFrom(stayFrom);
					newBooking.setDateTo(stayTo);
					getBookings().add(newBooking);
					return newBooking;
				}
			}
		// if no rooms are available test existing bookings against the dates of stay
		
		EList <Booking> copyOfBookingList = new BasicEList<Booking>();
		copyOfBookingList.addAll(getBookings());
		int roomNumber;
		for (Booking booking : getBookings()) {
		// test if dates wanted overlap with dates on the booking
			if(((stayFrom.after(booking.getDateFrom()) || stayFrom.equals(booking.getDateFrom())) 
					&&(stayFrom.before(booking.getDateTo()) || stayFrom.equals(booking.getDateTo())))
					||((stayTo.after(booking.getDateFrom()) || stayTo.equals(booking.getDateFrom()))
							&& (stayTo.before(booking.getDateTo()) || stayTo.equals(booking.getDateTo())))){
		// remove all bookings with that room number from copyOfBookingList
				roomNumber = booking.getRoomNumber();
				for (Booking booking2 : getBookings()) {
					if(booking2.getRoomNumber() ==  roomNumber){
						copyOfBookingList.remove(booking2);
					}
				}
			}
		}
		/* if copyOfBookingList is not empty then use the room number from the first index
		 * that has the correct room type, else return null
		 */
		if(copyOfBookingList.size() > 0){
			for (Room room : rooms) {
				if((room.getType().equalsIgnoreCase(petType)) 
						&& !(room.getStatus().equalsIgnoreCase("available"))){
					newBooking.setRoomNumber(room.getNumber());
					newBooking.setDateFrom(stayFrom);
					newBooking.setDateTo(stayTo);
					getBookings().add(newBooking);
					return newBooking;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @author Michael Warne
	 * @description Adds a new Meal to the booking
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void enterMealInfo(String foodType, String schedule, float amountOfFood, float price, String bookingId) {
		
		Meal meal = MdsdBookingFactory.eINSTANCE.createMeal();
		meal.setFoodType(foodType);
		meal.setSchedule(schedule);
		meal.setAmountOfFood(amountOfFood);
		meal.setPrice(price);
		for (Booking booking : bookings) {
			if(booking.getBookingId().equals(bookingId)){
				booking.setMealInfo(meal);
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * @author Michael Warne
	 * @description adds a new service to a booking
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void enterService(Service service, String bookingId) {
		
		for (Booking booking : bookings) {
			if(booking.getBookingId().equals(bookingId)){
				booking.getBookedServices().add(service);
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * @author Michael Warne
	 * @description sets checkedIn attribute of a booking to true
	 * and sets the relevant room status to occupied.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkIn(String bookingID, EList<Room> rooms) {
		
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
	 * @author Michael Warne
	 * @description Tests if a bill has been paid, if
	 * true allows the customer to check out
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean checkOut(String bookingID, EList<Room> rooms, EList<Bill> bills) {
		
		for(Bill bill: bills){
			if(bill.getID().equals(bookingID)){
				if(!bill.isPaid()) return false;
				else break;	
			}
		}
		for (Booking booking : bookings) {
			if(booking.getBookingId() == bookingID){
				booking.setIsCheckedOut(true);
				booking.setIsCheckedIn(false);
				for(Room room : rooms){
					if(room.getNumber() == booking.getRoomNumber()){
						room.setStatus("dirty");
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @author Michael Warne
	 * @description Creates a new service and adds it to the master list
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addNewService(String description, float price) {
		
		Service service = MdsdBookingFactory.eINSTANCE.createService();
		service.setDescription(description);
		service.setPrice(price);
		getServices().add(service);
	}

	/**
	 * <!-- begin-user-doc -->
	 * @author Michael Warne
	 * @description returns a list of the booking that belong to the 
	 * email address
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> getBookingList(String email) {
		EList <Booking> temp = getBookings();
		EList <Booking> history = new BasicEList<Booking>();
		for (Booking booking : temp) {
			if(booking.getCustomerEmail().equals(email)){
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
				case MdsdBookingPackage.STAFF_BOOKING___CHECK_OUT__STRING_ELIST_ELIST: return MdsdBookingPackage.BOOKING_CONTROLLER___CHECK_OUT__STRING_ELIST_ELIST;
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
			case MdsdBookingPackage.BOOKING_CONTROLLER___CHECK_OUT__STRING_ELIST_ELIST:
				return checkOut((String)arguments.get(0), (EList<Room>)arguments.get(1), (EList<Bill>)arguments.get(2));
			case MdsdBookingPackage.BOOKING_CONTROLLER___ADD_NEW_SERVICE__STRING_FLOAT:
				addNewService((String)arguments.get(0), (Float)arguments.get(1));
				return null;
			case MdsdBookingPackage.BOOKING_CONTROLLER___GET_BOOKING_LIST__STRING:
				return getBookingList((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingControllerImpl
