import static org.junit.Assert.*;
import java.util.Date;
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
	public void bookingAvilableRoom(){
		
		for(int i = 1; i < 5; i++){
			admin.addRoom("cat", "available", i);
		}
		//book a room for a cat
	
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "cat");
		booker.enterCustomerInfo("Andy Anteater", "andy_anteater@gmail.com", booking, "Bob");
		admin.changeRoomStatus("booked", booking.getRoomNumber());
		
		assertNotNull(booking); // want to use assertEquals but don't know how the Elist<Booking> look like.
		/*assertEquals(<Classes.mdsdBooking.impl.BookingImpl@7cdbc5d3
				(customerName\: Andy Anteater\, 
						customerEmail\: andy_anteater@gmail.com\, 
						bookingId\: andy_anteater@gmail.com1\, 
						isCheckedIn\: false\, 
						isCheckedOut\: false\, 
						roomNumber\: 1\, dateFrom\: Sat Jan 09 12\:07\:43 CET 2016\, 
						dateTo\: Sat Jan 23 12\:07\:43 CET 2016\, 
						bill_Id\: null\, petName\: Bob)> ,booking);*/
	}
	
	
	@Test
	public void bookingPetNotExist() {
		//add room
			for(int i = 1; i < 5; i++){
			admin.addRoom("dog", "available", i);
			}
		//create booking
			Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "cat");
			assertNull(booking);
	   }
	
	
	@Test
	public void bookingDateOverlap() {
		//add room & create full booking
			admin.addRoom("dog", "available", 1);
			Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
			booker.enterCustomerInfo("Andy Anteater", "andy_anteater@gmail.com", booking, "Bob");
			admin.changeRoomStatus("booked", booking.getRoomNumber());
		//create booking with overlap date
		Booking booking2 = booker.enterDatesOfStay(d3, d4, admin.getRooms(), "dog");
		assertNull(booking2);	
	}
	
	@Test
	public void bookingFullBooked() {
		//add a room and a booking 
		admin.addRoom("dog", "available", 1);
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Andy Anteater", "andy_anteater@gmail.com", booking, "Bob");
		admin.changeRoomStatus("booked", booking.getRoomNumber());
		
		//Create new booking with the same period of stay
		Booking booking2 = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		System.out.println(booker.getBookings());
		assertNull(booking2);
		
	}
	
	
	
	
}
