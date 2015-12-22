/**
 */
package Classes.mdsdBooking.impl;

import Classes.mdsdBooking.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MdsdBookingFactoryImpl extends EFactoryImpl implements MdsdBookingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MdsdBookingFactory init() {
		try {
			MdsdBookingFactory theMdsdBookingFactory = (MdsdBookingFactory)EPackage.Registry.INSTANCE.getEFactory(MdsdBookingPackage.eNS_URI);
			if (theMdsdBookingFactory != null) {
				return theMdsdBookingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MdsdBookingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdsdBookingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MdsdBookingPackage.BOOKING_CONTROLLER: return createBookingController();
			case MdsdBookingPackage.MEAL: return createMeal();
			case MdsdBookingPackage.BOOKING: return createBooking();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingController createBookingController() {
		BookingControllerImpl bookingController = new BookingControllerImpl();
		return bookingController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meal createMeal() {
		MealImpl meal = new MealImpl();
		return meal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdsdBookingPackage getMdsdBookingPackage() {
		return (MdsdBookingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MdsdBookingPackage getPackage() {
		return MdsdBookingPackage.eINSTANCE;
	}

} //MdsdBookingFactoryImpl
