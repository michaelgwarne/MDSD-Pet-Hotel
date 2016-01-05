/**
 */
package Classes.mdsdAccount.impl;

import Classes.mdsdAccount.Account;
import Classes.mdsdAccount.AccountController;
import Classes.mdsdAccount.Customer;
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
 *   <li>{@link Classes.mdsdAccount.impl.AccountControllerImpl#getCustomers <em>Customers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountControllerImpl extends MinimalEObjectImpl.Container implements AccountController {
	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customers;

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
	public EList<Customer> getCustomers() {
		if (customers == null) {
			customers = new EObjectContainmentEList<Customer>(Customer.class, this, MdsdAccountPackage.ACCOUNT_CONTROLLER__CUSTOMERS);
		}
		return customers;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getAccount(String email) {
		for (Customer customer : customers) {	
			if(customer.getEmail().equalsIgnoreCase(email)) {
				return customer.getAccount();
				
			}
			
			}
			
			
		
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Account createAccount(String customerName, String customerEmail, String password) {
		// TODO: test
		for(Customer customer : getCustomers()){
			if(customer.getEmail().equalsIgnoreCase(customerEmail)){
				return null;
			}
		}
		Customer newCustomer = MdsdAccountFactory.eINSTANCE.createCustomer();
		Account account = MdsdAccountFactory.eINSTANCE.createAccount();
		account.setAccountID(customerEmail);
		account.setPassword(password);
		newCustomer.setEmail(customerEmail);
		newCustomer.setName(customerName);
		newCustomer.setAccount(account);
		getCustomers().add(newCustomer);
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modifyAccount() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @generated
	 */
	public void login(String email, String password) {
		for (Customer customer : customers) {	
			if(customer.getEmail() == password){
				customer.isLogin(true);
				customer.isLogin(false);
				System.out.println(customer);
		
			}
		
		}
		
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void logout() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void viewRoom(int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addPet(String name, String type, String accountID) {
		// TODO: test
		for(Customer customer : getCustomers()){
			if(customer.getAccount().getAccountID().equalsIgnoreCase(accountID)){
				Pet pet = MdsdAccountFactory.eINSTANCE.createPet();
				pet.setName(name);
				pet.setType(type);
				customer.getAccount().getPets().add(pet);
				break;
			}
		}	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removePet(String name, String type, String accountID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MdsdAccountPackage.ACCOUNT_CONTROLLER__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
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
			case MdsdAccountPackage.ACCOUNT_CONTROLLER__CUSTOMERS:
				return getCustomers();
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
			case MdsdAccountPackage.ACCOUNT_CONTROLLER__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends Customer>)newValue);
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
			case MdsdAccountPackage.ACCOUNT_CONTROLLER__CUSTOMERS:
				getCustomers().clear();
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
			case MdsdAccountPackage.ACCOUNT_CONTROLLER__CUSTOMERS:
				return customers != null && !customers.isEmpty();
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
				case MdsdAccountPackage.CUSTOMER_ACCOUNT___MODIFY_ACCOUNT: return MdsdAccountPackage.ACCOUNT_CONTROLLER___MODIFY_ACCOUNT;
				case MdsdAccountPackage.CUSTOMER_ACCOUNT___LOGIN__STRING_STRING: return MdsdAccountPackage.ACCOUNT_CONTROLLER___LOGIN__STRING_STRING;
				case MdsdAccountPackage.CUSTOMER_ACCOUNT___LOGOUT: return MdsdAccountPackage.ACCOUNT_CONTROLLER___LOGOUT;
				case MdsdAccountPackage.CUSTOMER_ACCOUNT___VIEW_ROOM__INT: return MdsdAccountPackage.ACCOUNT_CONTROLLER___VIEW_ROOM__INT;
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
			case MdsdAccountPackage.ACCOUNT_CONTROLLER___CREATE_ACCOUNT__STRING_STRING_STRING:
				return createAccount((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case MdsdAccountPackage.ACCOUNT_CONTROLLER___MODIFY_ACCOUNT:
				modifyAccount();
				return null;
			case MdsdAccountPackage.ACCOUNT_CONTROLLER___LOGIN__STRING_STRING:
				login((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case MdsdAccountPackage.ACCOUNT_CONTROLLER___LOGOUT:
				logout();
				return null;
			case MdsdAccountPackage.ACCOUNT_CONTROLLER___VIEW_ROOM__INT:
				viewRoom((Integer)arguments.get(0));
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
