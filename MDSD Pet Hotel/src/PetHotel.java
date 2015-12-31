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
		for(int j = 1; j < 5; j++){
			admin.addRoom("cat", "available", j);
			}
		admin.displayRooms();
		admin.removeRoom(4);
		
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Andy Anteater", "andy_anteater@gmail.com", booking, "Regine");
		admin.changeRoomStatus("booked", booking.getRoomNumber());
	
		Booking booking2 = booker.enterDatesOfStay(new Date(System.currentTimeMillis() + (3 * week)), new Date(System.currentTimeMillis() + (5 * week)), admin.getRooms() ,"dog");
		booker.enterCustomerInfo("Peter Pig", "peter_pig@gmail.com", booking2, "Pimmie");
		admin.changeRoomStatus("booked", booking2.getRoomNumber());
		
		Booking booking3 = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Andy Anteater", "andy_anteater@gmail.com", booking3, "Regine");
		admin.changeRoomStatus("booked", booking3.getRoomNumber());
		
		Booking booking4 = booker.enterDatesOfStay(new Date(System.currentTimeMillis() + (10000 + week)), new Date(System.currentTimeMillis() + (2 + 10000 * week)), admin.getRooms(), "dog");
		booker.enterCustomerInfo("Andy Anteater", "andy_anteater@gmail.com", booking4, "Regine");
		admin.changeRoomStatus("booked", booking4.getRoomNumber());
	
		for (Booking book : booker.getBookings()) {
			System.out.println(book.getBookingId() + " " + book.getRoomNumber());
		}
		admin.displayRooms();
		System.out.println(admin.getPetTypes());
		booker.cancelBooking(booking2.getBookingId());
		for (Booking book2 : booker.getBookings()) {
			System.out.println(book2.getBookingId() + " " + book2.getRoomNumber());
		}
	}

}

