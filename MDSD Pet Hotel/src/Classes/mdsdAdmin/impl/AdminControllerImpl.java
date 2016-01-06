/**
 */
package Classes.mdsdAdmin.impl;

import Classes.mdsdAdmin.AdminController;
import Classes.mdsdAdmin.BookingToAdmin;
import Classes.mdsdAdmin.HotelStaff;
import Classes.mdsdAdmin.MdsdAdminFactory;
import Classes.mdsdAdmin.MdsdAdminPackage;
import Classes.mdsdAdmin.Room;
import Classes.mdsdAdmin.Staff;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.mdsdAdmin.impl.AdminControllerImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link Classes.mdsdAdmin.impl.AdminControllerImpl#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdminControllerImpl extends MinimalEObjectImpl.Container implements AdminController {
	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<HotelStaff> staff;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdminControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdsdAdminPackage.Literals.ADMIN_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<Room>(Room.class, this, MdsdAdminPackage.ADMIN_CONTROLLER__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HotelStaff> getStaff() {
		if (staff == null) {
			staff = new EObjectContainmentEList<HotelStaff>(HotelStaff.class, this, MdsdAdminPackage.ADMIN_CONTROLLER__STAFF);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Room addRoom(String type, String status, int room) {
		for(Room testRoom : getRooms()){
			if(testRoom.getNumber() == room){
				return null;
			}
		}
		Room newRoom = MdsdAdminFactory.eINSTANCE.createRoom();
		newRoom.setType(type);
		newRoom.setStatus(status);
		newRoom.setNumber(room);
		getRooms().add(newRoom);
		return newRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeRoom(int number) {
		for (Room room : rooms) {
			if(room.getNumber() == number){
				rooms.remove(room);
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HotelStaff createStaff(String name, int rank, String SSN, String password) {
		// TODO: test
		for(HotelStaff testStaff : getStaff()){
			if(testStaff.getSSN().equalsIgnoreCase(SSN)){
				return null;
			}
		}
		HotelStaff staff = MdsdAdminFactory.eINSTANCE.createHotelStaff();
		staff.setName(name);
		staff.setRank(rank);
		staff.setSSN(SSN);
		staff.setPassword(password);
		getStaff().add(staff);
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeStaff(String SSN) {
		// TODO: test
		for (HotelStaff staff : getStaff()) {
			if(staff.getSSN().equals(SSN)){
				getStaff().remove(staff);
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modifyStaff(String SSN) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void displayStaff() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getPetTypes() {
EList<String> petTypes = new BasicEList<String>();
		for (Room room : getRooms()) {
			if(!petTypes.contains(room.getType()))
			petTypes.add(room.getType());
		}
		
		return petTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void staffLogin(String ssn, String password) {
		// TODO: test
		for(HotelStaff staff : getStaff()){
			if(staff.getSSN().equalsIgnoreCase(ssn) && staff.getPassword().equals(password)){
				
				staff.setIsLoggedIn(true);
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void staffLogout(String ssn) {
		// TODO: test
		for(HotelStaff staff : getStaff()){
			if(staff.getSSN().equalsIgnoreCase(ssn)){
				staff.setIsLoggedIn(false);
			}
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> getAvailableRooms() {
		EList<Room> available = new BasicEList<Room>();
		for (Room room : rooms) {
			if(room.getStatus().equalsIgnoreCase("available")){
				available.add(room);
			}
		}
		return available;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void displayRooms() {
		for (Room r: rooms){
			System.out.println(r.getStatus() + " " + r.getType() + " " + r.getNumber());
			}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeRoomStatus(String status, int roomNumber) {
		for (Room room : rooms) {
			if(room.getNumber() == roomNumber){
				room.setStatus(status);
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isLoggedIn(String ssn) {
		// TODO: test
		for(HotelStaff staff : getStaff()){
			if(staff.getSSN().equalsIgnoreCase(ssn)){
				return staff.isLoggedIn();
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MdsdAdminPackage.ADMIN_CONTROLLER__ROOMS:
				return ((InternalEList<?>)getRooms()).basicRemove(otherEnd, msgs);
			case MdsdAdminPackage.ADMIN_CONTROLLER__STAFF:
				return ((InternalEList<?>)getStaff()).basicRemove(otherEnd, msgs);
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
			case MdsdAdminPackage.ADMIN_CONTROLLER__ROOMS:
				return getRooms();
			case MdsdAdminPackage.ADMIN_CONTROLLER__STAFF:
				return getStaff();
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
			case MdsdAdminPackage.ADMIN_CONTROLLER__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Room>)newValue);
				return;
			case MdsdAdminPackage.ADMIN_CONTROLLER__STAFF:
				getStaff().clear();
				getStaff().addAll((Collection<? extends HotelStaff>)newValue);
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
			case MdsdAdminPackage.ADMIN_CONTROLLER__ROOMS:
				getRooms().clear();
				return;
			case MdsdAdminPackage.ADMIN_CONTROLLER__STAFF:
				getStaff().clear();
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
			case MdsdAdminPackage.ADMIN_CONTROLLER__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case MdsdAdminPackage.ADMIN_CONTROLLER__STAFF:
				return staff != null && !staff.isEmpty();
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
		if (baseClass == BookingToAdmin.class) {
			switch (baseOperationID) {
				case MdsdAdminPackage.BOOKING_TO_ADMIN___GET_PET_TYPES: return MdsdAdminPackage.ADMIN_CONTROLLER___GET_PET_TYPES;
				default: return -1;
			}
		}
		if (baseClass == Staff.class) {
			switch (baseOperationID) {
				case MdsdAdminPackage.STAFF___STAFF_LOGIN__STRING_STRING: return MdsdAdminPackage.ADMIN_CONTROLLER___STAFF_LOGIN__STRING_STRING;
				case MdsdAdminPackage.STAFF___STAFF_LOGOUT__STRING: return MdsdAdminPackage.ADMIN_CONTROLLER___STAFF_LOGOUT__STRING;
				case MdsdAdminPackage.STAFF___DISPLAY_ROOMS: return MdsdAdminPackage.ADMIN_CONTROLLER___DISPLAY_ROOMS;
				case MdsdAdminPackage.STAFF___CHANGE_ROOM_STATUS__STRING_INT: return MdsdAdminPackage.ADMIN_CONTROLLER___CHANGE_ROOM_STATUS__STRING_INT;
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
			case MdsdAdminPackage.ADMIN_CONTROLLER___ADD_ROOM__STRING_STRING_INT:
				return addRoom((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case MdsdAdminPackage.ADMIN_CONTROLLER___REMOVE_ROOM__INT:
				removeRoom((Integer)arguments.get(0));
				return null;
			case MdsdAdminPackage.ADMIN_CONTROLLER___CREATE_STAFF__STRING_INT_STRING_STRING:
				return createStaff((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case MdsdAdminPackage.ADMIN_CONTROLLER___REMOVE_STAFF__STRING:
				removeStaff((String)arguments.get(0));
				return null;
			case MdsdAdminPackage.ADMIN_CONTROLLER___MODIFY_STAFF__STRING:
				modifyStaff((String)arguments.get(0));
				return null;
			case MdsdAdminPackage.ADMIN_CONTROLLER___DISPLAY_STAFF:
				displayStaff();
				return null;
			case MdsdAdminPackage.ADMIN_CONTROLLER___GET_PET_TYPES:
				return getPetTypes();
			case MdsdAdminPackage.ADMIN_CONTROLLER___STAFF_LOGIN__STRING_STRING:
				staffLogin((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case MdsdAdminPackage.ADMIN_CONTROLLER___STAFF_LOGOUT__STRING:
				staffLogout((String)arguments.get(0));
				return null;
			case MdsdAdminPackage.ADMIN_CONTROLLER___DISPLAY_ROOMS:
				displayRooms();
				return null;
			case MdsdAdminPackage.ADMIN_CONTROLLER___CHANGE_ROOM_STATUS__STRING_INT:
				changeRoomStatus((String)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case MdsdAdminPackage.ADMIN_CONTROLLER___IS_LOGGED_IN__STRING:
				return isLoggedIn((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AdminControllerImpl
