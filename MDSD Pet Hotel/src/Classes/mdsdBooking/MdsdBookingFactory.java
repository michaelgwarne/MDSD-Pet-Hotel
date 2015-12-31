/**
 */
package Classes.mdsdBooking;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Classes.mdsdBooking.MdsdBookingPackage
 * @generated
 */
public interface MdsdBookingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MdsdBookingFactory eINSTANCE = Classes.mdsdBooking.impl.MdsdBookingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Booking Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Controller</em>'.
	 * @generated
	 */
	BookingController createBookingController();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Meal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meal</em>'.
	 * @generated
	 */
	Meal createMeal();

	/**
	 * Returns a new object of class '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking</em>'.
	 * @generated
	 */
	Booking createBooking();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MdsdBookingPackage getMdsdBookingPackage();

} //MdsdBookingFactory
