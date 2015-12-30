import java.util.Date;

import Classes.mdsdAdmin.AdminController;
import Classes.mdsdAdmin.MdsdAdminFactory;
import Classes.mdsdBooking.Booking;
import Classes.mdsdBooking.BookingController;
import Classes.mdsdBooking.MdsdBookingFactory;

public class PetHotel {

	public static void main(String[] args) {
		long week = 604800000;
		AdminController admin = MdsdAdminFactory.eINSTANCE.createAdminController();
		BookingController booker = MdsdBookingFactory.eINSTANCE.createBookingController();
	
		
		Date d1 = new Date(System.currentTimeMillis() + week);
		Date d2 = new Date(System.currentTimeMillis() + (2*week));
		for(int i = 1; i < 5; i++){
		admin.addRoom("dog", "available", i);
		}
		admin.displayRooms();
		admin.removeRoom(4);
		
		
		
		
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getAvailableRooms());
		booker.enterCustomerInfo("Andy Anteater", "andy_anteater@gmail.com", booking);
		admin.changeRoomStatus("booked", booking.getRoomNumber());
	
		Booking booking2 = booker.enterDatesOfStay(new Date(System.currentTimeMillis() + (3 * week)), new Date(System.currentTimeMillis() + (5 * week)), admin.getAvailableRooms());
		booker.enterCustomerInfo("Peter Pig", "peter_pig@gmail.com", booking2);
		admin.changeRoomStatus("booked", booking2.getRoomNumber());
		
		Booking booking3 = booker.enterDatesOfStay(d1, d2, admin.getAvailableRooms());
		booker.enterCustomerInfo("Andy Anteater", "andy_anteater@gmail.com", booking3);
		admin.changeRoomStatus("booked", booking3.getRoomNumber());
		
		Booking booking4 = booker.enterDatesOfStay(new Date(System.currentTimeMillis() + (10000 + week)), new Date(System.currentTimeMillis() + (2 + 10000 * week)), admin.getAvailableRooms());
		booker.enterCustomerInfo("Andy Anteater", "andy_anteater@gmail.com", booking4);
		admin.changeRoomStatus("booked", booking4.getRoomNumber());
	
		for (Booking book : booker.getBookings()) {
			System.out.println(book.getBookingId() + " " + book.getRoomNumber());
		}
		admin.displayRooms();
	}

}
