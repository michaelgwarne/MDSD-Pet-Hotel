/**
 */
package Classes.mdsdAdmin.impl;

import Classes.mdsdAdmin.*;

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
public class MdsdAdminFactoryImpl extends EFactoryImpl implements MdsdAdminFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MdsdAdminFactory init() {
		try {
			MdsdAdminFactory theMdsdAdminFactory = (MdsdAdminFactory)EPackage.Registry.INSTANCE.getEFactory(MdsdAdminPackage.eNS_URI);
			if (theMdsdAdminFactory != null) {
				return theMdsdAdminFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MdsdAdminFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdsdAdminFactoryImpl() {
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
			case MdsdAdminPackage.ADMIN_CONTROLLER: return createAdminController();
			case MdsdAdminPackage.HOTEL_STAFF: return createHotelStaff();
			case MdsdAdminPackage.ROOM: return createRoom();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdminController createAdminController() {
		AdminControllerImpl adminController = new AdminControllerImpl();
		return adminController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelStaff createHotelStaff() {
		HotelStaffImpl hotelStaff = new HotelStaffImpl();
		return hotelStaff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdsdAdminPackage getMdsdAdminPackage() {
		return (MdsdAdminPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MdsdAdminPackage getPackage() {
		return MdsdAdminPackage.eINSTANCE;
	}

} //MdsdAdminFactoryImpl
