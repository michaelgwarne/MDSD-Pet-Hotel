/**
 */
package Classes.mdsdAccount.impl;

import Classes.mdsdAccount.Account;
import Classes.mdsdAccount.MdsdAccountPackage;
import Classes.mdsdAccount.Pet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdAccount.impl.AccountImpl#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link Classes.mdsdAccount.impl.AccountImpl#getPets <em>Pets</em>}</li>
 *   <li>{@link Classes.mdsdAccount.impl.AccountImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link Classes.mdsdAccount.impl.AccountImpl#getName <em>Name</em>}</li>
 *   <li>{@link Classes.mdsdAccount.impl.AccountImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Classes.mdsdAccount.impl.AccountImpl#isLoggedIn <em>Is Logged In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountImpl extends MinimalEObjectImpl.Container implements Account {
	/**
	 * The default value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected String accountID = ACCOUNT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPets() <em>Pets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPets()
	 * @generated
	 * @ordered
	 */
	protected EList<Pet> pets;

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
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdsdAccountPackage.Literals.ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountID() {
		return accountID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountID(String newAccountID) {
		String oldAccountID = accountID;
		accountID = newAccountID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdAccountPackage.ACCOUNT__ACCOUNT_ID, oldAccountID, accountID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pet> getPets() {
		if (pets == null) {
			pets = new EObjectResolvingEList<Pet>(Pet.class, this, MdsdAccountPackage.ACCOUNT__PETS);
		}
		return pets;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdAccountPackage.ACCOUNT__PASSWORD, oldPassword, password));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdAccountPackage.ACCOUNT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdAccountPackage.ACCOUNT__EMAIL, oldEmail, email));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MdsdAccountPackage.ACCOUNT__IS_LOGGED_IN, oldIsLoggedIn, isLoggedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdsdAccountPackage.ACCOUNT__ACCOUNT_ID:
				return getAccountID();
			case MdsdAccountPackage.ACCOUNT__PETS:
				return getPets();
			case MdsdAccountPackage.ACCOUNT__PASSWORD:
				return getPassword();
			case MdsdAccountPackage.ACCOUNT__NAME:
				return getName();
			case MdsdAccountPackage.ACCOUNT__EMAIL:
				return getEmail();
			case MdsdAccountPackage.ACCOUNT__IS_LOGGED_IN:
				return isLoggedIn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MdsdAccountPackage.ACCOUNT__ACCOUNT_ID:
				setAccountID((String)newValue);
				return;
			case MdsdAccountPackage.ACCOUNT__PETS:
				getPets().clear();
				getPets().addAll((Collection<? extends Pet>)newValue);
				return;
			case MdsdAccountPackage.ACCOUNT__PASSWORD:
				setPassword((String)newValue);
				return;
			case MdsdAccountPackage.ACCOUNT__NAME:
				setName((String)newValue);
				return;
			case MdsdAccountPackage.ACCOUNT__EMAIL:
				setEmail((String)newValue);
				return;
			case MdsdAccountPackage.ACCOUNT__IS_LOGGED_IN:
				setIsLoggedIn((Boolean)newValue);
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
			case MdsdAccountPackage.ACCOUNT__ACCOUNT_ID:
				setAccountID(ACCOUNT_ID_EDEFAULT);
				return;
			case MdsdAccountPackage.ACCOUNT__PETS:
				getPets().clear();
				return;
			case MdsdAccountPackage.ACCOUNT__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case MdsdAccountPackage.ACCOUNT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MdsdAccountPackage.ACCOUNT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case MdsdAccountPackage.ACCOUNT__IS_LOGGED_IN:
				setIsLoggedIn(IS_LOGGED_IN_EDEFAULT);
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
			case MdsdAccountPackage.ACCOUNT__ACCOUNT_ID:
				return ACCOUNT_ID_EDEFAULT == null ? accountID != null : !ACCOUNT_ID_EDEFAULT.equals(accountID);
			case MdsdAccountPackage.ACCOUNT__PETS:
				return pets != null && !pets.isEmpty();
			case MdsdAccountPackage.ACCOUNT__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case MdsdAccountPackage.ACCOUNT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MdsdAccountPackage.ACCOUNT__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case MdsdAccountPackage.ACCOUNT__IS_LOGGED_IN:
				return isLoggedIn != IS_LOGGED_IN_EDEFAULT;
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
		result.append(" (accountID: ");
		result.append(accountID);
		result.append(", password: ");
		result.append(password);
		result.append(", name: ");
		result.append(name);
		result.append(", email: ");
		result.append(email);
		result.append(", isLoggedIn: ");
		result.append(isLoggedIn);
		result.append(')');
		return result.toString();
	}

} //AccountImpl
