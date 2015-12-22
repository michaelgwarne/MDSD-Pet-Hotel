/**
 */
package Classes.mdsdBooking.impl;

import Classes.mdsdBooking.MdsdBookingPackage;
import Classes.mdsdBooking.Meal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdBooking.impl.MealImpl#getFoodType <em>Food Type</em>}</li>
 *   <li>{@link Classes.mdsdBooking.impl.MealImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link Classes.mdsdBooking.impl.MealImpl#getAmountOfFood <em>Amount Of Food</em>}</li>
 *   <li>{@link Classes.mdsdBooking.impl.MealImpl#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MealImpl extends MinimalEObjectImpl.Container implements Meal {
	/**
	 * The default value of the '{@link #getFoodType() <em>Food Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodType()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOD_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFoodType() <em>Food Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodType()
	 * @generated
	 * @ordered
	 */
	protected String foodType = FOOD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchedule() <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected String schedule = SCHEDULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountOfFood() <em>Amount Of Food</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfFood()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_OF_FOOD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmountOfFood() <em>Amount Of Food</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfFood()
	 * @generated
	 * @ordered
	 */
	protected float amountOfFood = AMOUNT_OF_FOOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MealImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdsdBookingPackage.Literals.MEAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFoodType() {
		return foodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoodType(String newFoodType) {
		String oldFoodType = foodType;
		foodType = newFoodType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.MEAL__FOOD_TYPE, oldFoodType, foodType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(String newSchedule) {
		String oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.MEAL__SCHEDULE, oldSchedule, schedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmountOfFood() {
		return amountOfFood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountOfFood(float newAmountOfFood) {
		float oldAmountOfFood = amountOfFood;
		amountOfFood = newAmountOfFood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.MEAL__AMOUNT_OF_FOOD, oldAmountOfFood, amountOfFood));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdBookingPackage.MEAL__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdsdBookingPackage.MEAL__FOOD_TYPE:
				return getFoodType();
			case MdsdBookingPackage.MEAL__SCHEDULE:
				return getSchedule();
			case MdsdBookingPackage.MEAL__AMOUNT_OF_FOOD:
				return getAmountOfFood();
			case MdsdBookingPackage.MEAL__PRICE:
				return getPrice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MdsdBookingPackage.MEAL__FOOD_TYPE:
				setFoodType((String)newValue);
				return;
			case MdsdBookingPackage.MEAL__SCHEDULE:
				setSchedule((String)newValue);
				return;
			case MdsdBookingPackage.MEAL__AMOUNT_OF_FOOD:
				setAmountOfFood((Float)newValue);
				return;
			case MdsdBookingPackage.MEAL__PRICE:
				setPrice((Float)newValue);
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
			case MdsdBookingPackage.MEAL__FOOD_TYPE:
				setFoodType(FOOD_TYPE_EDEFAULT);
				return;
			case MdsdBookingPackage.MEAL__SCHEDULE:
				setSchedule(SCHEDULE_EDEFAULT);
				return;
			case MdsdBookingPackage.MEAL__AMOUNT_OF_FOOD:
				setAmountOfFood(AMOUNT_OF_FOOD_EDEFAULT);
				return;
			case MdsdBookingPackage.MEAL__PRICE:
				setPrice(PRICE_EDEFAULT);
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
			case MdsdBookingPackage.MEAL__FOOD_TYPE:
				return FOOD_TYPE_EDEFAULT == null ? foodType != null : !FOOD_TYPE_EDEFAULT.equals(foodType);
			case MdsdBookingPackage.MEAL__SCHEDULE:
				return SCHEDULE_EDEFAULT == null ? schedule != null : !SCHEDULE_EDEFAULT.equals(schedule);
			case MdsdBookingPackage.MEAL__AMOUNT_OF_FOOD:
				return amountOfFood != AMOUNT_OF_FOOD_EDEFAULT;
			case MdsdBookingPackage.MEAL__PRICE:
				return price != PRICE_EDEFAULT;
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
		result.append(" (foodType: ");
		result.append(foodType);
		result.append(", schedule: ");
		result.append(schedule);
		result.append(", amountOfFood: ");
		result.append(amountOfFood);
		result.append(", price: ");
		result.append(price);
		result.append(')');
		return result.toString();
	}

} //MealImpl
