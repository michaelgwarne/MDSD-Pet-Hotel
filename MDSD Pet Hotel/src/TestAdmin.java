import static org.junit.Assert.*;
import org.junit.Test;
import Classes.mdsdAccount.AccountController;
import Classes.mdsdAccount.MdsdAccountFactory;
import Classes.mdsdAdmin.AdminController;
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
}
