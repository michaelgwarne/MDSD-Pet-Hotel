/**
 */
package Classes.mdsdAdmin.util;

import Classes.mdsdAdmin.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Classes.mdsdAdmin.MdsdAdminPackage
 * @generated
 */
public class MdsdAdminAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MdsdAdminPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdsdAdminAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MdsdAdminPackage.eINSTANCE;
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
	protected MdsdAdminSwitch<Adapter> modelSwitch =
		new MdsdAdminSwitch<Adapter>() {
			@Override
			public Adapter caseAdminController(AdminController object) {
				return createAdminControllerAdapter();
			}
			@Override
			public Adapter caseHotelStaff(HotelStaff object) {
				return createHotelStaffAdapter();
			}
			@Override
			public Adapter caseAdmin(Admin object) {
				return createAdminAdapter();
			}
			@Override
			public Adapter caseBookingToAdmin(BookingToAdmin object) {
				return createBookingToAdminAdapter();
			}
			@Override
			public Adapter caseStaff(Staff object) {
				return createStaffAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
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
	 * Creates a new adapter for an object of class '{@link Classes.mdsdAdmin.AdminController <em>Admin Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.mdsdAdmin.AdminController
	 * @generated
	 */
	public Adapter createAdminControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.mdsdAdmin.HotelStaff <em>Hotel Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.mdsdAdmin.HotelStaff
	 * @generated
	 */
	public Adapter createHotelStaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.mdsdAdmin.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.mdsdAdmin.Admin
	 * @generated
	 */
	public Adapter createAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.mdsdAdmin.BookingToAdmin <em>Booking To Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.mdsdAdmin.BookingToAdmin
	 * @generated
	 */
	public Adapter createBookingToAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.mdsdAdmin.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.mdsdAdmin.Staff
	 * @generated
	 */
	public Adapter createStaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.mdsdAdmin.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.mdsdAdmin.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
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

} //MdsdAdminAdapterFactory
