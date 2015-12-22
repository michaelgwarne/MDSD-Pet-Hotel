/**
 */
package Classes.mdsdBooking.util;

import Classes.mdsdBooking.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Classes.mdsdBooking.MdsdBookingPackage
 * @generated
 */
public class MdsdBookingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MdsdBookingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdsdBookingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MdsdBookingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MdsdBookingSwitch<Adapter> modelSwitch =
		new MdsdBookingSwitch<Adapter>() {
			@Override
			public Adapter caseBookingController(BookingController object) {
				return createBookingControllerAdapter();
			}
			@Override
			public Adapter caseUserBooking(UserBooking object) {
				return createUserBookingAdapter();
			}
			@Override
			public Adapter caseStaffBooking(StaffBooking object) {
				return createStaffBookingAdapter();
			}
			@Override
			public Adapter caseMeal(Meal object) {
				return createMealAdapter();
			}
			@Override
			public Adapter caseBooking(Booking object) {
				return createBookingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Classes.mdsdBooking.BookingController <em>Booking Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.mdsdBooking.BookingController
	 * @generated
	 */
	public Adapter createBookingControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.mdsdBooking.UserBooking <em>User Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.mdsdBooking.UserBooking
	 * @generated
	 */
	public Adapter createUserBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.mdsdBooking.StaffBooking <em>Staff Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.mdsdBooking.StaffBooking
	 * @generated
	 */
	public Adapter createStaffBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.mdsdBooking.Meal <em>Meal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.mdsdBooking.Meal
	 * @generated
	 */
	public Adapter createMealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.mdsdBooking.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.mdsdBooking.Booking
	 * @generated
	 */
	public Adapter createBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MdsdBookingAdapterFactory
