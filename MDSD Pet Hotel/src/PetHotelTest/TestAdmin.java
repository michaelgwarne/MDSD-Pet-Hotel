package PetHotelTest;
import static org.junit.Assert.*;
import org.junit.Test;
import Classes.mdsdAdmin.AdminController;
import Classes.mdsdAdmin.HotelStaff;
import Classes.mdsdAdmin.MdsdAdminFactory;
import Classes.mdsdAdmin.Room;

public class TestAdmin {
	
	AdminController adminCtrl = MdsdAdminFactory.eINSTANCE.createAdminController();
		
	@Test
	//test: a room is added successfully
	public void testAddRoom() {
		
		//add a room to the hotel
		adminCtrl.addRoom("horse","available", 1);
		
		//check the room is added
		Room room = adminCtrl.getRooms().get(0);
	
		assertNotNull(room);
	}
	
	@Test
	public void testRemoveRoom() {
		//add a room to the hotel
		adminCtrl.addRoom("horse","available", 1);
		adminCtrl.removeRoom(1);
		
		int room = adminCtrl.getRooms().size();
		assertEquals(0, room);
		
	}
	
	@Test
	public void testCreateStaff() {
		//Add a staff member
		adminCtrl.createStaff("Regine Aquino", 0, "444555", "abc");
		
		//check the staff is added
		HotelStaff staff = adminCtrl.getStaff().get(0);
		assertNotNull(staff);
		
		//create duplicate staff
		HotelStaff staff2 = adminCtrl.createStaff("Regine Aquino", 0, "444555", "abc");
		assertNull(staff2);
	}
	
	@Test
	public void testRemoveStaff() {
		//Add a staff member
		adminCtrl.createStaff("Regine Aquino", 0, "444555", "abc");
		//Remove staff
		adminCtrl.removeStaff("444555");
		
		//check staff is removed successfully
		int staff = adminCtrl.getStaff().size();
		assertEquals(0, staff);
	}
	
	@Test
	public void testStaffLogIn() {
		//Add a staff member
		adminCtrl.createStaff("Regine Aquino", 0, "444555", "abc");
		
		//The staff log in to the system with incorrect password
		adminCtrl.staffLogin("444555", "aaa");
		assertFalse(adminCtrl.isLoggedIn("444555"));
		//The staff log in to the system with incorrect username
		adminCtrl.staffLogin("44455", "abc");
		assertFalse(adminCtrl.isLoggedIn("444555"));
		//The staff log in to the system with correct username and password
		adminCtrl.staffLogin("444555", "abc");
		assertTrue(adminCtrl.isLoggedIn("444555"));	
		
	}
	
	@Test
	public void testStaffLogOut() {
		//Add a staff member
		HotelStaff staff = adminCtrl.createStaff("Regine Aquino", 0, "444555", "abc");
		
		//The staff log in to the system with correct username and password
		adminCtrl.staffLogin("444555", "abc");
		
		//The staff log out
		adminCtrl.staffLogout("444555");
		assertFalse(staff.isLoggedIn());
		
	}
	
	@Test
	public void testModifyStaff(){
		//Add a staff member
		HotelStaff staff = adminCtrl.createStaff("Regine Aquino", 0, "444555", "abc");
		adminCtrl.modifyStaff(staff.getSSN(), "Adelyn Aquino", 4);
		
		assertEquals(adminCtrl.getStaff().get(0).getName(), "Adelyn Aquino");
	}
}
