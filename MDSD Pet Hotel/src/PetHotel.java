import java.util.Date;

import Classes.mdsdAdmin.AdminController;
import Classes.mdsdAdmin.MdsdAdminFactory;
import Classes.mdsdBooking.Booking;
import Classes.mdsdBooking.BookingController;
import Classes.mdsdBooking.MdsdBookingFactory;

public class PetHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminController admin = MdsdAdminFactory.eINSTANCE.createAdminController();
		admin.addRoom("dog", "available", 1);
		admin.addRoom("cat", "available", 2);
		admin.displayRooms();
		BookingController booker = MdsdBookingFactory.eINSTANCE.createBookingController();
		for(int i = 0; i < 10; i++){
			booker.enterCustomerInfo("Dave Pig", "davepig@gmail.com");
			
		}
		Booking booking = booker.enterCustomerInfo("Kevin Cat", "kevincat@gmail.com");
		Date d1 = new Date(System.currentTimeMillis());
		Date d2 = new Date(System.currentTimeMillis() + 604800000);
		booker.enterDatesOfStay(d1, d2, booking);
		System.out.println(booking.toString());
		
	}

}
