/**
 */
package Classes.util;

import Classes.*;

import Classes.mdsdAccount.BookingToAccount;
import Classes.mdsdAccount.CustomerAccount;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Classes.ClassesPackage
 * @generated
 */
public class ClassesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClassesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ClassesPackage.eINSTANCE;
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
	protected ClassesSwitch<Adapter> modelSwitch =
		new ClassesSwitch<Adapter>() {
			@Override
			public Adapter caseAccount(Account object) {
				return createAccountAdapter();
			}
			@Override
			public Adapter casePet(Pet object) {
				return createPetAdapter();
			}
			@Override
			public Adapter caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			@Override
			public Adapter caseAccountController(AccountController object) {
				return createAccountControllerAdapter();
			}
			@Override
			public Adapter caseBookingToAccount(BookingToAccount object) {
				return createBookingToAccountAdapter();
			}
			@Override
			public Adapter caseCustomerAccount(CustomerAccount object) {
				return createCustomerAccountAdapter();
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
	 * Creates a new adapter for an object of class '{@link Classes.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Pet <em>Pet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Pet
	 * @generated
	 */
	public Adapter createPetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.AccountController <em>Account Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.AccountController
	 * @generated
	 */
	public Adapter createAccountControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.mdsdAccount.BookingToAccount <em>Booking To Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.mdsdAccount.BookingToAccount
	 * @generated
	 */
	public Adapter createBookingToAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.mdsdAccount.CustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.mdsdAccount.CustomerAccount
	 * @generated
	 */
	public Adapter createCustomerAccountAdapter() {
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

} //ClassesAdapterFactory
