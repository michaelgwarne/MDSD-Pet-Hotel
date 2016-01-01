import static org.junit.Assert.*;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import Classes.mdsdAccount.AccountController;
import Classes.mdsdAccount.MdsdAccountFactory;
import Classes.mdsdAdmin.AdminController;
import Classes.mdsdAdmin.MdsdAdminFactory;
import Classes.mdsdBilling.BillingController;
import Classes.mdsdBilling.MdsdBillingFactory;
import Classes.mdsdBooking.Booking;
import Classes.mdsdBooking.BookingController;
import Classes.mdsdBooking.MdsdBookingFactory;

public class TestBooking {
	
	long week = 604800000;
	
	AdminController admin = MdsdAdminFactory.eINSTANCE.createAdminController();
	BookingController booker = MdsdBookingFactory.eINSTANCE.createBookingController();
	AccountController account = MdsdAccountFactory.eINSTANCE.createAccountController();
	BillingController bill = MdsdBillingFactory.eINSTANCE.createBillingController();
	
	Date d1 = new Date(System.currentTimeMillis() + week);
	Date d2 = new Date(System.currentTimeMillis() + (3*week));
	Date d3 = new Date(System.currentTimeMillis() + (2*week));
	Date d4 = new Date(System.currentTimeMillis() + (4*week));
	

	@Test
	public void testBookingPetNotExist() {
		//add room
			for(int i = 1; i < 5; i++){
			admin.addRoom("dog", "available", i);
			}
		//create booking
			Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "cat");
			assertNull(booking);
	   }
	@Test
	public void testBookingDateOverlap() {
		//add room & create full booking
		for(int i = 1; i < 2; i++){
			admin.addRoom("dog", "available", i);
			booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
			}
		//create booking
		
		Booking booking = booker.enterDatesOfStay(d3, d4, admin.getRooms(), "dog");
		assertNull(booking);	
	}
}
