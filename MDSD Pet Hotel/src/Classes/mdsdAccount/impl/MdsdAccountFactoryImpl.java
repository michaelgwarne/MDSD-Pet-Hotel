/**
 */
package Classes.mdsdAccount.impl;

import Classes.mdsdAccount.*;

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
public class MdsdAccountFactoryImpl extends EFactoryImpl implements MdsdAccountFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MdsdAccountFactory init() {
		try {
			MdsdAccountFactory theMdsdAccountFactory = (MdsdAccountFactory)EPackage.Registry.INSTANCE.getEFactory(MdsdAccountPackage.eNS_URI);
			if (theMdsdAccountFactory != null) {
				return theMdsdAccountFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MdsdAccountFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdsdAccountFactoryImpl() {
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
			case MdsdAccountPackage.ACCOUNT: return createAccount();
			case MdsdAccountPackage.PET: return createPet();
			case MdsdAccountPackage.CUSTOMER: return createCustomer();
			case MdsdAccountPackage.ACCOUNT_CONTROLLER: return createAccountController();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pet createPet() {
		PetImpl pet = new PetImpl();
		return pet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountController createAccountController() {
		AccountControllerImpl accountController = new AccountControllerImpl();
		return accountController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdsdAccountPackage getMdsdAccountPackage() {
		return (MdsdAccountPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MdsdAccountPackage getPackage() {
		return MdsdAccountPackage.eINSTANCE;
	}

} //MdsdAccountFactoryImpl
