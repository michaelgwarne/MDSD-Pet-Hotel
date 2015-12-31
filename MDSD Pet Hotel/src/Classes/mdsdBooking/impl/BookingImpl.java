/**
 */
package Classes.mdsdBooking.impl;

import Classes.mdsdBooking.Booking;
import Classes.mdsdBooking.MdsdBookingPackage;
import Classes.mdsdBooking.Meal;
import Classes.mdsdBooking.Service;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdBooking.impl.BookingImpl#getCustomerName <em>Customer Name</em>}</li>
 *   <li>{@link Classes.mdsdBooking.impl.BookingImpl#getCustomerEmail <em>Customer Email</em>}</li>
 *   <li>{@link Classes.mdsdBooking.impl.BookingImpl#getBookingId <em>Booking Id</em>}</li>
 *   <li>{@link Classes.mdsdBooking.impl.BookingImpl#isCheckedIn <em>Is Checked In</em>}</li>
 *   <li>{@link Classes.mdsdBooking.impl.BookingImpl#isCheckedOut <em>Is Checked Out</em>}</li>
 *   <li>{@link Classes.mdsdBooking.impl.BookingImpl#getBookedServices <em>Booked Services</em>}</li>
 *   <li>{@link Classes.mdsdBooking.impl.BookingImpl#getMealInfo <em>Meal Info</em>}</li>
 *   <li>{@link Classes.mdsdBooking.impl.BookingImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link Classes.mdsdBooking.impl.BookingImpl#getDateFrom <em>Date From</em>}</li>
 *   <li>{@link Classes.mdsdBooking.impl.BookingImpl#getDateTo <em>Date To</em>}</li>
 *   <li>{@link Classes.mdsdBooking.impl.BookingImpl#getBill_Id <em>Bill Id</em>}</li>
 *   <li>{@link Classes.mdsdBooking.impl.BookingImpl#getPetName <em>Pet Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The default value of the '{@link #getCustomerName() <em>Customer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerName()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerName() <em>Customer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerName()
	 * @generated
	 * @ordered
	 */
	protected String customerName = CUSTOMER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerEmail() <em>Customer Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerEmail() <em>Customer Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerEmail()
	 * @generated
	 * @ordered
	 */
	protected String customerEmail = CUSTOMER_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookingId() <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingId()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookingId() <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingId()
	 * @generated
	 * @ordered
	 */
	protected String bookingId = BOOKING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckedIn() <em>Is Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CHECKED_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckedIn() <em>Is Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected boolean isCheckedIn = IS_CHECKED_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckedOut() <em>Is Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedOut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CHECKED_OUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckedOut() <em>Is Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedOut()
	 * @generated
	 * @ordered
	 */
	protected boolean isCheckedOut = IS_CHECKED_OUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBookedServices() <em>Booked Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> bookedServices;

	/**
	 * The cached value of the '{@link #getMealInfo() <em>Meal Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMealInfo()
	 * @generated
	 * @ordered
	 */
	protected Meal mealInfo;

	/**
	 * The default value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected int roomNumber = ROOM_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFrom() <em>Date From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFrom() <em>Date From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFrom()
	 * @generated
	 * @ordered
	 */
	protected Date dateFrom = DATE_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateTo() <em>Date To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTo()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTo() <em>Date To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTo()
	 * @generated
	 * @ordered
	 */
	protected Date dateTo = DATE_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getBill_Id() <em>Bill Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill_Id()
	 * @generated
	 * @ordered
	 */
	protected static final String BILL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBill_Id() <em>Bill Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill_Id()
	 * @generated
	 * @ordered
	 */
	protected String bill_Id = BILL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPetName() <em>Pet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetName()
	 * @generated
	 * @ordered
	 */
	protected static final String PET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPetName() <em>Pet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetName()
	 * @generated
	 * @ordered
	 */
	protected String petName = PET_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdsdBookingPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerName(String newCustomerName) {
		String oldCustomerName = customerName;
		customerName = newCustomerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.BOOKING__CUSTOMER_NAME, oldCustomerName, customerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerEmail() {
		return customerEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerEmail(String newCustomerEmail) {
		String oldCustomerEmail = customerEmail;
		customerEmail = newCustomerEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.BOOKING__CUSTOMER_EMAIL, oldCustomerEmail, customerEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookingId() {
		return bookingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingId(String newBookingId) {
		String oldBookingId = bookingId;
		bookingId = newBookingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.BOOKING__BOOKING_ID, oldBookingId, bookingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckedIn() {
		return isCheckedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCheckedIn(boolean newIsCheckedIn) {
		boolean oldIsCheckedIn = isCheckedIn;
		isCheckedIn = newIsCheckedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.BOOKING__IS_CHECKED_IN, oldIsCheckedIn, isCheckedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckedOut() {
		return isCheckedOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCheckedOut(boolean newIsCheckedOut) {
		boolean oldIsCheckedOut = isCheckedOut;
		isCheckedOut = newIsCheckedOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.BOOKING__IS_CHECKED_OUT, oldIsCheckedOut, isCheckedOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getBookedServices() {
		if (bookedServices == null) {
			bookedServices = new EObjectResolvingEList<Service>(Service.class, this, MdsdBookingPackage.BOOKING__BOOKED_SERVICES);
		}
		return bookedServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meal getMealInfo() {
		return mealInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMealInfo(Meal newMealInfo, NotificationChain msgs) {
		Meal oldMealInfo = mealInfo;
		mealInfo = newMealInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.BOOKING__MEAL_INFO, oldMealInfo, newMealInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMealInfo(Meal newMealInfo) {
		if (newMealInfo != mealInfo) {
			NotificationChain msgs = null;
			if (mealInfo != null)
				msgs = ((InternalEObject)mealInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MdsdBookingPackage.BOOKING__MEAL_INFO, null, msgs);
			if (newMealInfo != null)
				msgs = ((InternalEObject)newMealInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MdsdBookingPackage.BOOKING__MEAL_INFO, null, msgs);
			msgs = basicSetMealInfo(newMealInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.BOOKING__MEAL_INFO, newMealInfo, newMealInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNumber(int newRoomNumber) {
		int oldRoomNumber = roomNumber;
		roomNumber = newRoomNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.BOOKING__ROOM_NUMBER, oldRoomNumber, roomNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateFrom() {
		return dateFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFrom(Date newDateFrom) {
		Date oldDateFrom = dateFrom;
		dateFrom = newDateFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.BOOKING__DATE_FROM, oldDateFrom, dateFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateTo() {
		return dateTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTo(Date newDateTo) {
		Date oldDateTo = dateTo;
		dateTo = newDateTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.BOOKING__DATE_TO, oldDateTo, dateTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBill_Id() {
		return bill_Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBill_Id(String newBill_Id) {
		String oldBill_Id = bill_Id;
		bill_Id = newBill_Id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.BOOKING__BILL_ID, oldBill_Id, bill_Id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPetName() {
		return petName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetName(String newPetName) {
		String oldPetName = petName;
		petName = newPetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.BOOKING__PET_NAME, oldPetName, petName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MdsdBookingPackage.BOOKING__MEAL_INFO:
				return basicSetMealInfo(null, msgs);
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
			case MdsdBookingPackage.BOOKING__CUSTOMER_NAME:
				return getCustomerName();
			case MdsdBookingPackage.BOOKING__CUSTOMER_EMAIL:
				return getCustomerEmail();
			case MdsdBookingPackage.BOOKING__BOOKING_ID:
				return getBookingId();
			case MdsdBookingPackage.BOOKING__IS_CHECKED_IN:
				return isCheckedIn();
			case MdsdBookingPackage.BOOKING__IS_CHECKED_OUT:
				return isCheckedOut();
			case MdsdBookingPackage.BOOKING__BOOKED_SERVICES:
				return getBookedServices();
			case MdsdBookingPackage.BOOKING__MEAL_INFO:
				return getMealInfo();
			case MdsdBookingPackage.BOOKING__ROOM_NUMBER:
				return getRoomNumber();
			case MdsdBookingPackage.BOOKING__DATE_FROM:
				return getDateFrom();
			case MdsdBookingPackage.BOOKING__DATE_TO:
				return getDateTo();
			case MdsdBookingPackage.BOOKING__BILL_ID:
				return getBill_Id();
			case MdsdBookingPackage.BOOKING__PET_NAME:
				return getPetName();
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
			case MdsdBookingPackage.BOOKING__CUSTOMER_NAME:
				setCustomerName((String)newValue);
				return;
			case MdsdBookingPackage.BOOKING__CUSTOMER_EMAIL:
				setCustomerEmail((String)newValue);
				return;
			case MdsdBookingPackage.BOOKING__BOOKING_ID:
				setBookingId((String)newValue);
				return;
			case MdsdBookingPackage.BOOKING__IS_CHECKED_IN:
				setIsCheckedIn((Boolean)newValue);
				return;
			case MdsdBookingPackage.BOOKING__IS_CHECKED_OUT:
				setIsCheckedOut((Boolean)newValue);
				return;
			case MdsdBookingPackage.BOOKING__BOOKED_SERVICES:
				getBookedServices().clear();
				getBookedServices().addAll((Collection<? extends Service>)newValue);
				return;
			case MdsdBookingPackage.BOOKING__MEAL_INFO:
				setMealInfo((Meal)newValue);
				return;
			case MdsdBookingPackage.BOOKING__ROOM_NUMBER:
				setRoomNumber((Integer)newValue);
				return;
			case MdsdBookingPackage.BOOKING__DATE_FROM:
				setDateFrom((Date)newValue);
				return;
			case MdsdBookingPackage.BOOKING__DATE_TO:
				setDateTo((Date)newValue);
				return;
			case MdsdBookingPackage.BOOKING__BILL_ID:
				setBill_Id((String)newValue);
				return;
			case MdsdBookingPackage.BOOKING__PET_NAME:
				setPetName((String)newValue);
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
			case MdsdBookingPackage.BOOKING__CUSTOMER_NAME:
				setCustomerName(CUSTOMER_NAME_EDEFAULT);
				return;
			case MdsdBookingPackage.BOOKING__CUSTOMER_EMAIL:
				setCustomerEmail(CUSTOMER_EMAIL_EDEFAULT);
				return;
			case MdsdBookingPackage.BOOKING__BOOKING_ID:
				setBookingId(BOOKING_ID_EDEFAULT);
				return;
			case MdsdBookingPackage.BOOKING__IS_CHECKED_IN:
				setIsCheckedIn(IS_CHECKED_IN_EDEFAULT);
				return;
			case MdsdBookingPackage.BOOKING__IS_CHECKED_OUT:
				setIsCheckedOut(IS_CHECKED_OUT_EDEFAULT);
				return;
			case MdsdBookingPackage.BOOKING__BOOKED_SERVICES:
				getBookedServices().clear();
				return;
			case MdsdBookingPackage.BOOKING__MEAL_INFO:
				setMealInfo((Meal)null);
				return;
			case MdsdBookingPackage.BOOKING__ROOM_NUMBER:
				setRoomNumber(ROOM_NUMBER_EDEFAULT);
				return;
			case MdsdBookingPackage.BOOKING__DATE_FROM:
				setDateFrom(DATE_FROM_EDEFAULT);
				return;
			case MdsdBookingPackage.BOOKING__DATE_TO:
				setDateTo(DATE_TO_EDEFAULT);
				return;
			case MdsdBookingPackage.BOOKING__BILL_ID:
				setBill_Id(BILL_ID_EDEFAULT);
				return;
			case MdsdBookingPackage.BOOKING__PET_NAME:
				setPetName(PET_NAME_EDEFAULT);
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
			case MdsdBookingPackage.BOOKING__CUSTOMER_NAME:
				return CUSTOMER_NAME_EDEFAULT == null ? customerName != null : !CUSTOMER_NAME_EDEFAULT.equals(customerName);
			case MdsdBookingPackage.BOOKING__CUSTOMER_EMAIL:
				return CUSTOMER_EMAIL_EDEFAULT == null ? customerEmail != null : !CUSTOMER_EMAIL_EDEFAULT.equals(customerEmail);
			case MdsdBookingPackage.BOOKING__BOOKING_ID:
				return BOOKING_ID_EDEFAULT == null ? bookingId != null : !BOOKING_ID_EDEFAULT.equals(bookingId);
			case MdsdBookingPackage.BOOKING__IS_CHECKED_IN:
				return isCheckedIn != IS_CHECKED_IN_EDEFAULT;
			case MdsdBookingPackage.BOOKING__IS_CHECKED_OUT:
				return isCheckedOut != IS_CHECKED_OUT_EDEFAULT;
			case MdsdBookingPackage.BOOKING__BOOKED_SERVICES:
				return bookedServices != null && !bookedServices.isEmpty();
			case MdsdBookingPackage.BOOKING__MEAL_INFO:
				return mealInfo != null;
			case MdsdBookingPackage.BOOKING__ROOM_NUMBER:
				return roomNumber != ROOM_NUMBER_EDEFAULT;
			case MdsdBookingPackage.BOOKING__DATE_FROM:
				return DATE_FROM_EDEFAULT == null ? dateFrom != null : !DATE_FROM_EDEFAULT.equals(dateFrom);
			case MdsdBookingPackage.BOOKING__DATE_TO:
				return DATE_TO_EDEFAULT == null ? dateTo != null : !DATE_TO_EDEFAULT.equals(dateTo);
			case MdsdBookingPackage.BOOKING__BILL_ID:
				return BILL_ID_EDEFAULT == null ? bill_Id != null : !BILL_ID_EDEFAULT.equals(bill_Id);
			case MdsdBookingPackage.BOOKING__PET_NAME:
				return PET_NAME_EDEFAULT == null ? petName != null : !PET_NAME_EDEFAULT.equals(petName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (customerName: ");
		result.append(customerName);
		result.append(", customerEmail: ");
		result.append(customerEmail);
		result.append(", bookingId: ");
		result.append(bookingId);
		result.append(", isCheckedIn: ");
		result.append(isCheckedIn);
		result.append(", isCheckedOut: ");
		result.append(isCheckedOut);
		result.append(", roomNumber: ");
		result.append(roomNumber);
		result.append(", dateFrom: ");
		result.append(dateFrom);
		result.append(", dateTo: ");
		result.append(dateTo);
		result.append(", bill_Id: ");
		result.append(bill_Id);
		result.append(", petName: ");
		result.append(petName);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
