/**
 */
package Classes.mdsdAccount.impl;

import Classes.mdsdAccount.Account;
import Classes.mdsdAccount.AccountController;
import Classes.mdsdAccount.CustomerAccount;
import Classes.mdsdAccount.MdsdAccountFactory;
import Classes.mdsdAccount.MdsdAccountPackage;
import Classes.mdsdAccount.Pet;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdAccount.impl.AccountControllerImpl#getAccounts <em>Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountControllerImpl extends MinimalEObjectImpl.Container implements AccountController {
	/**
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Account> accounts;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdsdAccountPackage.Literals.ACCOUNT_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Account> getAccounts() {
		if (accounts == null) {
			accounts = new EObjectContainmentEList<Account>(Account.class, this, MdsdAccountPackage.ACCOUNT_CONTROLLER__ACCOUNTS);
		}
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @author Michael Warne
	 * @description returns the account associated with the email address
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Account getAccount(String email) {
		
		for(Account account : getAccounts()){
			if(account.getEmail().equals(email)){
				return account;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @author Michael Warne
	 * @description tests if a customer is logged in 
	 * to their account
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isUserLoggedIn(String accountId) {
		
				for(Account account : getAccounts()){
					if(account.getAccountID().equals(accountId)){
						return account.isLoggedIn();
					}
				}
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @author Michael Warne
	 * @description tests if the email is already used for an account,
	 * if not creates a new account
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Account createAccount(String customerName, String customerEmail, String password) {
		
		for(Account account : getAccounts()){
			if(account.getEmail().equals(customerEmail)){
				return null;
			}
		}
		Account account = MdsdAccountFactory.eINSTANCE.createAccount();
		account.setAccountID(customerEmail);
		account.setEmail(customerEmail);
		account.setName(customerName);
		account.setPassword(password);
		getAccounts().add(account);
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @author Michael Warne
	 * @description If email and password match logs the customer in
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void login(String email, String password) {
		
		for(Account account : getAccounts()){
			if(account.getAccountID().equals(email) 
					&& account.getPassword().equals(password)){
				account.setIsLoggedIn(true);
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * @author Michael Warne
	 * @description logs the customer out
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void logout(String accountId) {
		
				for(Account account : getAccounts()){
					if(account.getAccountID().equals(accountId) ){
						account.setIsLoggedIn(false);
						break;
					}
				}
	}

	/**
	 * <!-- begin-user-doc -->
	 * @author Michael Warne
	 * @description Adds a new pet to an account
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addPet(String name, String type, String accountID) {
		
		Pet pet = MdsdAccountFactory.eINSTANCE.createPet();
		pet.setName(name);
		pet.setType(type);
		for(Account account : getAccounts()){
			if(account.getAccountID().equals(accountID)){
				account.getPets().add(pet);
				break;
			}
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * @author Michael Warne
	 * @description removes a pet from the account
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removePet(String name, String type, String accountID) {
		
		for(Account account : getAccounts()){
			if(account.getAccountID().equals(accountID)){
				for(Pet pet : account.getPets()){
					if(pet.getName().equalsIgnoreCase(name) && pet.getType().equalsIgnoreCase(type)){
						account.getPets().remove(pet);
						break;
					}
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MdsdAccountPackage.ACCOUNT_CONTROLLER__ACCOUNTS:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MdsdAccountPackage.ACCOUNT_CONTROLLER__ACCOUNTS:
				return getAccounts();
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
			case MdsdAccountPackage.ACCOUNT_CONTROLLER__ACCOUNTS:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends Account>)newValue);
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
			case MdsdAccountPackage.ACCOUNT_CONTROLLER__ACCOUNTS:
				getAccounts().clear();
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
			case MdsdAccountPackage.ACCOUNT_CONTROLLER__ACCOUNTS:
				return accounts != null && !accounts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == CustomerAccount.class) {
			switch (baseOperationID) {
				case MdsdAccountPackage.CUSTOMER_ACCOUNT___CREATE_ACCOUNT__STRING_STRING_STRING: return MdsdAccountPackage.ACCOUNT_CONTROLLER___CREATE_ACCOUNT__STRING_STRING_STRING;
				case MdsdAccountPackage.CUSTOMER_ACCOUNT___LOGIN__STRING_STRING: return MdsdAccountPackage.ACCOUNT_CONTROLLER___LOGIN__STRING_STRING;
				case MdsdAccountPackage.CUSTOMER_ACCOUNT___LOGOUT__STRING: return MdsdAccountPackage.ACCOUNT_CONTROLLER___LOGOUT__STRING;
				case MdsdAccountPackage.CUSTOMER_ACCOUNT___ADD_PET__STRING_STRING_STRING: return MdsdAccountPackage.ACCOUNT_CONTROLLER___ADD_PET__STRING_STRING_STRING;
				case MdsdAccountPackage.CUSTOMER_ACCOUNT___REMOVE_PET__STRING_STRING_STRING: return MdsdAccountPackage.ACCOUNT_CONTROLLER___REMOVE_PET__STRING_STRING_STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MdsdAccountPackage.ACCOUNT_CONTROLLER___GET_ACCOUNT__STRING:
				return getAccount((String)arguments.get(0));
			case MdsdAccountPackage.ACCOUNT_CONTROLLER___IS_USER_LOGGED_IN__STRING:
				return isUserLoggedIn((String)arguments.get(0));
			case MdsdAccountPackage.ACCOUNT_CONTROLLER___CREATE_ACCOUNT__STRING_STRING_STRING:
				return createAccount((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case MdsdAccountPackage.ACCOUNT_CONTROLLER___LOGIN__STRING_STRING:
				login((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case MdsdAccountPackage.ACCOUNT_CONTROLLER___LOGOUT__STRING:
				logout((String)arguments.get(0));
				return null;
			case MdsdAccountPackage.ACCOUNT_CONTROLLER___ADD_PET__STRING_STRING_STRING:
				addPet((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case MdsdAccountPackage.ACCOUNT_CONTROLLER___REMOVE_PET__STRING_STRING_STRING:
				removePet((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	

} //AccountControllerImpl
