package PetHotelTest;
import static org.junit.Assert.*;
import org.junit.Test;
import Classes.mdsdAccount.AccountController;
import Classes.mdsdAccount.MdsdAccountFactory;
import Classes.mdsdAdmin.AdminController;
import Classes.mdsdAdmin.HotelStaff;
import Classes.mdsdAdmin.MdsdAdminFactory;
import Classes.mdsdBooking.BookingController;
import Classes.mdsdBooking.MdsdBookingFactory;
import Classes.mdsdAdmin.Room;
import Classes.mdsdBilling.BillingController;
import Classes.mdsdBilling.MdsdBillingFactory;

public class TestAdmin {
	
	AdminController admin = MdsdAdminFactory.eINSTANCE.createAdminController();
	BookingController booker = MdsdBookingFactory.eINSTANCE.createBookingController();
	AccountController account = MdsdAccountFactory.eINSTANCE.createAccountController();
	BillingController billCtrl = MdsdBillingFactory.eINSTANCE.createBillingController();

	
	@Test
	//test: a room is added successfully
	public void testAddRoom() {
		
		//add a room to the hotel
		admin.addRoom("horse","available", 1);
		
		//check the room is added
		Room room = admin.getRooms().get(0);
	
		assertNotNull(room);
	}
	
	@Test
	public void testRemoveRoom() {
		//add a room to the hotel
		admin.addRoom("horse","available", 1);
		admin.removeRoom(1);
		
		int room = admin.getRooms().size();
		assertEquals(0, room);
		
	}
	
	@Test
	public void testCreatStaff() {
		//Add a staff
		admin.createStaff("Regine Aquino", 0, "444555", "abc");
		
		//check the staff is added
		HotelStaff staff = admin.getStaff().get(0);
		assertNotNull(staff);
		
		//create duplicate staff
		HotelStaff staff2 = admin.createStaff("Regine Aquino", 0, "444555", "abc");
		assertNull(staff2);
	}
	
	@Test
	public void testRemoveStaff() {
		//Add a staff
		admin.createStaff("Regine Aquino", 0, "444555", "abc");
		//Remove staff
		admin.removeStaff("444555");
		
		//check staff is removed successfully
		int staff = admin.getStaff().size();
		assertEquals(0, staff);
		
	}
	
	@Test
	public void testStaffLogIn() {
		//Add a staff
		admin.createStaff("Regine Aquino", 0, "444555", "abc");
		
		//The staff log in to the system with incorrect password
		admin.staffLogin("444555", "aaa");
		assertFalse(admin.isLoggedIn("444555"));
		//The staff log in to the system with incorrect username
		admin.staffLogin("44455", "abc");
		assertFalse(admin.isLoggedIn("444555"));
		//The staff log in to the system with correct username and password
		admin.staffLogin("444555", "abc");
		assertTrue(admin.isLoggedIn("444555"));	
		
	}
	
	@Test
	public void testStaffLogOut() {
		//Add a staff
		HotelStaff staff = admin.createStaff("Regine Aquino", 0, "444555", "abc");
		
		//The staff log in to the system with correct username and password
		admin.staffLogin("444555", "abc");
		
		//The staff log out
		admin.staffLogout("444555");
		assertFalse(staff.isLoggedIn());
		
	}
}
