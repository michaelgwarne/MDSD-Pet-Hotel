/**
 */
package Classes.mdsdAdmin.impl;

import Classes.mdsdAdmin.HotelStaff;
import Classes.mdsdAdmin.MdsdAdminPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Staff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdAdmin.impl.HotelStaffImpl#getName <em>Name</em>}</li>
 *   <li>{@link Classes.mdsdAdmin.impl.HotelStaffImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link Classes.mdsdAdmin.impl.HotelStaffImpl#getSSN <em>SSN</em>}</li>
 *   <li>{@link Classes.mdsdAdmin.impl.HotelStaffImpl#isLoggedIn <em>Is Logged In</em>}</li>
 *   <li>{@link Classes.mdsdAdmin.impl.HotelStaffImpl#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HotelStaffImpl extends MinimalEObjectImpl.Container implements HotelStaff {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final int RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected int rank = RANK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSN() <em>SSN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSN()
	 * @generated
	 * @ordered
	 */
	protected static final String SSN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSN() <em>SSN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSN()
	 * @generated
	 * @ordered
	 */
	protected String ssn = SSN_EDEFAULT;

	/**
	 * The default value of the '{@link #isLoggedIn() <em>Is Logged In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoggedIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOGGED_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoggedIn() <em>Is Logged In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoggedIn()
	 * @generated
	 * @ordered
	 */
	protected boolean isLoggedIn = IS_LOGGED_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HotelStaffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdsdAdminPackage.Literals.HOTEL_STAFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdAdminPackage.HOTEL_STAFF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(int newRank) {
		int oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdAdminPackage.HOTEL_STAFF__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSSN() {
		return ssn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSSN(String newSSN) {
		String oldSSN = ssn;
		ssn = newSSN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdAdminPackage.HOTEL_STAFF__SSN, oldSSN, ssn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLoggedIn(boolean newIsLoggedIn) {
		boolean oldIsLoggedIn = isLoggedIn;
		isLoggedIn = newIsLoggedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdAdminPackage.HOTEL_STAFF__IS_LOGGED_IN, oldIsLoggedIn, isLoggedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdAdminPackage.HOTEL_STAFF__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdsdAdminPackage.HOTEL_STAFF__NAME:
				return getName();
			case MdsdAdminPackage.HOTEL_STAFF__RANK:
				return getRank();
			case MdsdAdminPackage.HOTEL_STAFF__SSN:
				return getSSN();
			case MdsdAdminPackage.HOTEL_STAFF__IS_LOGGED_IN:
				return isLoggedIn();
			case MdsdAdminPackage.HOTEL_STAFF__PASSWORD:
				return getPassword();
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
			case MdsdAdminPackage.HOTEL_STAFF__NAME:
				setName((String)newValue);
				return;
			case MdsdAdminPackage.HOTEL_STAFF__RANK:
				setRank((Integer)newValue);
				return;
			case MdsdAdminPackage.HOTEL_STAFF__SSN:
				setSSN((String)newValue);
				return;
			case MdsdAdminPackage.HOTEL_STAFF__IS_LOGGED_IN:
				setIsLoggedIn((Boolean)newValue);
				return;
			case MdsdAdminPackage.HOTEL_STAFF__PASSWORD:
				setPassword((String)newValue);
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
			case MdsdAdminPackage.HOTEL_STAFF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MdsdAdminPackage.HOTEL_STAFF__RANK:
				setRank(RANK_EDEFAULT);
				return;
			case MdsdAdminPackage.HOTEL_STAFF__SSN:
				setSSN(SSN_EDEFAULT);
				return;
			case MdsdAdminPackage.HOTEL_STAFF__IS_LOGGED_IN:
				setIsLoggedIn(IS_LOGGED_IN_EDEFAULT);
				return;
			case MdsdAdminPackage.HOTEL_STAFF__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
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
			case MdsdAdminPackage.HOTEL_STAFF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MdsdAdminPackage.HOTEL_STAFF__RANK:
				return rank != RANK_EDEFAULT;
			case MdsdAdminPackage.HOTEL_STAFF__SSN:
				return SSN_EDEFAULT == null ? ssn != null : !SSN_EDEFAULT.equals(ssn);
			case MdsdAdminPackage.HOTEL_STAFF__IS_LOGGED_IN:
				return isLoggedIn != IS_LOGGED_IN_EDEFAULT;
			case MdsdAdminPackage.HOTEL_STAFF__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", rank: ");
		result.append(rank);
		result.append(", SSN: ");
		result.append(ssn);
		result.append(", isLoggedIn: ");
		result.append(isLoggedIn);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //HotelStaffImpl
