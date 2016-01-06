package PetHotelTest;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;
import Classes.mdsdAccount.AccountController;
import Classes.mdsdAccount.MdsdAccountFactory;
import Classes.mdsdAdmin.AdminController;
import Classes.mdsdAdmin.MdsdAdminFactory;
import Classes.mdsdBooking.Booking;
import Classes.mdsdBooking.BookingController;
import Classes.mdsdBooking.MdsdBookingFactory;
import Classes.mdsdBooking.Meal;
import Classes.mdsdBooking.Service;
import Classes.mdsdAdmin.Room;
import Classes.mdsdBilling.Bill;
import Classes.mdsdBilling.BillingController;
import Classes.mdsdBilling.MdsdBillingFactory;

public class TestBooking {

	long week = 604800000;

	AdminController adminCtrl = MdsdAdminFactory.eINSTANCE.createAdminController();
	BookingController bookingCtrl = MdsdBookingFactory.eINSTANCE.createBookingController();
	AccountController accountCtrl = MdsdAccountFactory.eINSTANCE.createAccountController();
	BillingController billCtrl = MdsdBillingFactory.eINSTANCE.createBillingController();

	Date d1 = new Date(System.currentTimeMillis() + week);
	Date d2 = new Date(System.currentTimeMillis() + (3 * week));
	Date d3 = new Date(System.currentTimeMillis() + (2 * week));
	Date d4 = new Date(System.currentTimeMillis() + (4 * week));
	Date pastDate = new Date(System.currentTimeMillis() - week);

	@Test
	// test: add rooms with duplicate number
	public void testAddDuplicateRooms() {

		adminCtrl.addRoom("horse", "available", 1);
		adminCtrl.addRoom("horse", "available", 2);
		Room room = adminCtrl.addRoom("horse", "available", 1);
		assertNull(room);
	}

	@Test
	// test: book a room when there is at least an available room
	public void testBookRoom() {

		for (int i = 1; i < 5; i++) {
			adminCtrl.addRoom("cat", "available", i);
		}
		// book a room for a cat

		Booking booking = bookingCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "cat");
		bookingCtrl.enterCustomerInfo("Andy Anteater", "andy_anteater@gmail.com", booking, "Bob", adminCtrl.getRooms());
		adminCtrl.changeRoomStatus("booked", booking.getRoomNumber());

		assertNotNull(booking);
	}

	@Test
	// Test: enter pet type which does not exist
	public void testPetNotExist() {
		// add room
		for (int i = 1; i < 5; i++) {
			adminCtrl.addRoom("dog", "available", i);
		}
		// create booking
		Booking booking = bookingCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "cat");
		assertNull(booking);
	}

	@Test
	// test: a room is booked with past date
	public void testBookPastDate() {
		adminCtrl.addRoom("dog", "available", 1);
		Booking booking = bookingCtrl.enterDatesOfStay(pastDate, d2, adminCtrl.getRooms(), "dog");

		assertNull(booking);

	}

	@Test
	// test: a room is booked with overlap date.
	public void testDateOverlap() {
		// add room & create full booking
		adminCtrl.addRoom("dog", "available", 1);
		Booking booking = bookingCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "dog");
		bookingCtrl.enterCustomerInfo("Andy Anteater", "andy_anteater@gmail.com", booking, "Bob", adminCtrl.getRooms());
		adminCtrl.changeRoomStatus("booked", booking.getRoomNumber());
		// create booking with overlap date
		Booking booking2 = bookingCtrl.enterDatesOfStay(d3, d4, adminCtrl.getRooms(), "dog");
		assertNull(booking2);
	}

	@Test
	// Test: it is impossible to book a room when the hotel is full booked
	public void testFullBooked() {
		// add a room and a booking
		adminCtrl.addRoom("dog", "available", 1);
		Booking booking = bookingCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "dog");
		bookingCtrl.enterCustomerInfo("Andy Anteater", "andy_anteater@gmail.com", booking, "Bob", adminCtrl.getRooms());
		adminCtrl.changeRoomStatus("booked", booking.getRoomNumber());

		// Create new booking with the same period of stay
		Booking booking2 = bookingCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "dog");
		assertNull(booking2);

	}

	@Test
	// Test: booking contains correct booking ID
	public void testBookingIDExist() {
		// add a room to hotel
		adminCtrl.addRoom("dog", "available", 1);

		// book a room.
		Booking booking = bookingCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "dog");
		bookingCtrl.enterCustomerInfo("Nicole Musco", "nicole_musco@gmail.com", booking, "Elora", adminCtrl.getRooms());

		// test bookingIDExist
		String bookingID = booking.getBookingId();
		assertEquals("nicole_musco@gmail.com1", bookingID);
	}

	@Test
	// test: customer info exists after it's entered
	public void testCustomerInfo() {

		for (int i = 1; i < 2; i++) {
			adminCtrl.addRoom("dog", "available", i);
		}
		// book a room for a dog

		Booking booking = bookingCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "dog");
		bookingCtrl.enterCustomerInfo("Su San", "susan@gmail.com", booking, "Bob", adminCtrl.getRooms());

		String customerName = booking.getCustomerName();
		String customerEmail = booking.getCustomerEmail();
		String petName = booking.getPetName();

		// checking if the hotel get correct customer info
		assertEquals("Su San", customerName);
		assertEquals("susan@gmail.com", customerEmail);
		assertEquals("Bob", petName);
	}

	@Test
	// Test: room status is changed after it is booked
	public void testBookingRoomStatus() {

		adminCtrl.addRoom("dog", "available", 1);

		// book a room for a dog
		Booking booking = bookingCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "dog");
		bookingCtrl.enterCustomerInfo("Su San", "susan@gmail.com", booking, "Bob", adminCtrl.getRooms());

		// get room status and check if the room is booked.
		Room room = adminCtrl.getRooms().get(0);
		if (room.getNumber() == booking.getRoomNumber())
			assertEquals("booked", room.getStatus());
		else
			assertEquals("available", room.getStatus());

	}

	@Test
	// Test: meal info is add successfully
	public void testMealInfo() {

		adminCtrl.addRoom("dog", "available", 1);

		// book a room for a dog

		Booking booking = bookingCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "dog");
		bookingCtrl.enterCustomerInfo("Su San", "susan@gmail.com", booking, "Bob", adminCtrl.getRooms());

		// enter meal for pet
		bookingCtrl.enterMealInfo("vegetarian", "10.00", 400, 30, booking.getBookingId());

		// booking should contain meal
		Meal meal = booking.getMealInfo();
		assertNotNull(meal);

	}

	@Test
	// Test: service is added
	public void testEnterService() {
		// assume that it's drop down list of service in GUI
		// Add room and service
		adminCtrl.addRoom("dog", "available", 1);

		bookingCtrl.addNewService("spa", 300);
		Service spa = bookingCtrl.getServices().get(0);

		// book a room for a dog
		Booking booking = bookingCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "dog");
		bookingCtrl.enterCustomerInfo("Su San", "susan@gmail.com", booking, "Bob", adminCtrl.getRooms());

		// Enter service
		bookingCtrl.enterService(spa, booking.getBookingId());

		assertNotNull(booking.getBookedServices().get(0)); 
	}

	@Test
	// Test: pet is checked in to the hotel
	public void testCheckIn() {
		// room status is changed, isCheckIn = true

		// add rooms
		adminCtrl.addRoom("dog", "available", 1);

		// book a room for a dog
		Booking booking = bookingCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "dog");
		bookingCtrl.enterCustomerInfo("Su San", "susan@gmail.com", booking, "Bob", adminCtrl.getRooms());

		// check Bob in to the hotel
		bookingCtrl.checkIn(booking.getBookingId(), adminCtrl.getRooms());

		// test isCheckIn is true and isCheckOut is false
		assertEquals(true, booking.isCheckedIn());
		assertEquals(false, booking.isCheckedOut());

		// test the room status is changed to occupied
		assertEquals("occupied", adminCtrl.getRooms().get(0).getStatus());
	}

	@Test
	// Test: Pet is checked out from the hotel
	public void testCheckOut() {

		// add rooms
		adminCtrl.addRoom("cat", "available", 1);

		// book a room for a cat
		Booking booking = bookingCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "cat");
		bookingCtrl.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", adminCtrl.getRooms());

		// check Elora in to the hotel
		bookingCtrl.checkIn(booking.getBookingId(), adminCtrl.getRooms());

		// add bill check for the bill is paid
		billCtrl.addTransaction("For Elora room", 5000, booking);
		Bill bill = billCtrl.getBills().get(0); 
			
		// check Elora out from the hotel without paying.
		bookingCtrl.checkOut(booking.getBookingId(), adminCtrl.getRooms(), billCtrl.getBills());

		// test that checkOut failed
		assertEquals(true, booking.isCheckedIn()); 
		
		assertEquals(false, booking.isCheckedOut());

		//test the room status is still occupied
		Room room = adminCtrl.getRooms().get(booking.getRoomNumber() - 1);
		assertEquals("occupied", room.getStatus()); 
		
		//Then pay bill 
		bill.setIsPaid(true);
		//check out again
		bookingCtrl.checkOut(booking.getBookingId(), adminCtrl.getRooms(), billCtrl.getBills());
		// test checkOut succeeded
		assertEquals(false, booking.isCheckedIn());
		assertEquals(true, booking.isCheckedOut());
		// test the room status is changed to dirty
		Room roomDirty = adminCtrl.getRooms().get(booking.getRoomNumber() - 1);
		assertEquals("dirty", roomDirty.getStatus());
	}

	@Test

	public void testCancelBooking() {
		// add a room and a booking
		adminCtrl.addRoom("dog", "available", 1);
		Booking booking = bookingCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "dog");
		bookingCtrl.enterCustomerInfo("Mai Phuong", "mai_phuong@gmail.com", booking, "Abbe", adminCtrl.getRooms());

		// cancel booking
		bookingCtrl.cancelBooking(booking.getBookingId());
		
		assertEquals(bookingCtrl.getBookings().size(), 0);

	}

	@Test
	public void testBookingDifferDate() {

		// add a room and book the room
		adminCtrl.addRoom("dog", "available", 1);
		Booking booking = bookingCtrl.enterDatesOfStay(d1, d3, adminCtrl.getRooms(), "dog");
		bookingCtrl.enterCustomerInfo("Mai Phuong", "mai_phuong@gmail.com", booking, "Abbe", adminCtrl.getRooms());

		// book the room with different date
		Booking booking2 = bookingCtrl.enterDatesOfStay(d2, d4, adminCtrl.getRooms(), "dog");

		assertNotNull(booking2);

	}
}
