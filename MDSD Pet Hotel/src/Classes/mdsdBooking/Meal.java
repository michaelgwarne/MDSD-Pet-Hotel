/**
 */
package Classes.mdsdBooking;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdBooking.Meal#getFoodType <em>Food Type</em>}</li>
 *   <li>{@link Classes.mdsdBooking.Meal#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link Classes.mdsdBooking.Meal#getAmountOfFood <em>Amount Of Food</em>}</li>
 *   <li>{@link Classes.mdsdBooking.Meal#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @see Classes.mdsdBooking.MdsdBookingPackage#getMeal()
 * @model
 * @generated
 */
public interface Meal extends EObject {
	/**
	 * Returns the value of the '<em><b>Food Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Food Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Food Type</em>' attribute.
	 * @see #setFoodType(String)
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getMeal_FoodType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFoodType();

	/**
	 * Sets the value of the '{@link Classes.mdsdBooking.Meal#getFoodType <em>Food Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Food Type</em>' attribute.
	 * @see #getFoodType()
	 * @generated
	 */
	void setFoodType(String value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' attribute.
	 * @see #setSchedule(String)
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getMeal_Schedule()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSchedule();

	/**
	 * Sets the value of the '{@link Classes.mdsdBooking.Meal#getSchedule <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' attribute.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(String value);

	/**
	 * Returns the value of the '<em><b>Amount Of Food</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Of Food</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Food</em>' attribute.
	 * @see #setAmountOfFood(float)
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getMeal_AmountOfFood()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	float getAmountOfFood();

	/**
	 * Sets the value of the '{@link Classes.mdsdBooking.Meal#getAmountOfFood <em>Amount Of Food</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Of Food</em>' attribute.
	 * @see #getAmountOfFood()
	 * @generated
	 */
	void setAmountOfFood(float value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see Classes.mdsdBooking.MdsdBookingPackage#getMeal_Price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link Classes.mdsdBooking.Meal#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

} // Meal
