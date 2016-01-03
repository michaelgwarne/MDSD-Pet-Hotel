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
import Classes.mdsdBooking.Meal;
import Classes.mdsdBooking.Service;
import Classes.mdsdBooking.impl.BookingImpl;
import Classes.mdsdAdmin.Room;

public class TestBooking {
	


	long week = 604800000;
	
	AdminController admin = MdsdAdminFactory.eINSTANCE.createAdminController();
	BookingController booker = MdsdBookingFactory.eINSTANCE.createBookingController();
	AccountController account = MdsdAccountFactory.eINSTANCE.createAccountController();
	BillingController bill = MdsdBillingFactory.eINSTANCE.createBillingController();
	//Room room = MdsdAdminFactory.eINSTANCE.createAdminController();
	
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
	
	@Test
	public void bookingTestCustomerInfo(){
		
		for(int i = 1; i < 2; i++){
			admin.addRoom("dog", "available", i);
		}
		//book a room for a dog
	
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Su San", "susan@gmail.com", booking, "Bob");

		
		String customerName = booking.getCustomerName();
		String customerEmail = booking.getCustomerEmail();
		String petName = booking.getPetName();
		
		//checking if the hotel get correct customer info
		assertEquals("Su San", customerName);
		assertEquals("susan@gmail.com", customerEmail);
		assertEquals("Bob", petName);
	}
	
	
	@Test
	public void bookingTestRoomStatus() {
		String status;
		
		for(int i = 1; i < 2; i++){
			admin.addRoom("dog", "available", i);
		}
		
		//book a room for a dog
	
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Su San", "susan@gmail.com", booking, "Bob");
		admin.changeRoomStatus("booked", booking.getRoomNumber());
		
		
		//get room status and check if the room is booked.
		EList<Room> rooms = admin.getRooms();
		for (Room room : rooms) {
			if(room.getNumber() == booking.getRoomNumber()) {
				status = room.getStatus();
				assertEquals("booked", status);
				break;
			}
		}
		
	}
	
	@Test
	public void bookingTestMealInfo() {
		
		for(int i = 1; i < 2; i++){
			admin.addRoom("dog", "available", i);
		}
		
		//book a room for a dog
	
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Su San", "susan@gmail.com", booking, "Bob");
		admin.changeRoomStatus("booked", booking.getRoomNumber());
		
		//enter meal for pet
		booker.enterMealInfo("vegetarian", "10.00",400 , 30, booking.getBookingId());
		
		//booking should contain meal
		Meal meal = booking.getMealInfo();
		assertNotNull(meal); 
		
	}
	
	@Test
	public void bookingTestEnterService() { //need to be fixed
		
		//Add room and service
		for(int i = 1; i < 2; i++){
			admin.addRoom("dog", "available", i);
		}
		booker.addNewService("spa", 300);
		Service spa;
		
		//book a room for a dog
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Su San", "susan@gmail.com", booking, "Bob");
		admin.changeRoomStatus("booked", booking.getRoomNumber());
	
		//Enter service
		booker.enterService(spa, booking.getBookingId());

		assertNotNull(booking.getBookedServices());
		
	}
	
	@Test
	public void testCheckIn() { 
		//room status is changed, isCheckIn = true
		
		//add rooms
		for(int i = 1; i < 2; i++){
			admin.addRoom("dog", "available", i);
		}
		
		//book a room for a dog
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Su San", "susan@gmail.com", booking, "Bob");
		admin.changeRoomStatus("booked", booking.getRoomNumber());
		
		//check Bob in to the hotel
		booker.checkIn(booking.getBookingId());
		
		assertEquals(true , booking.isCheckedIn());
	}
	
}
