package PetHotelTest;

import static org.junit.Assert.*;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
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

	AdminController admin = MdsdAdminFactory.eINSTANCE.createAdminController();
	BookingController booker = MdsdBookingFactory.eINSTANCE.createBookingController();
	AccountController account = MdsdAccountFactory.eINSTANCE.createAccountController();
	BillingController billCtrl = MdsdBillingFactory.eINSTANCE.createBillingController();

	Date d1 = new Date(System.currentTimeMillis() + week);
	Date d2 = new Date(System.currentTimeMillis() + (3 * week));
	Date d3 = new Date(System.currentTimeMillis() + (2 * week));
	Date d4 = new Date(System.currentTimeMillis() + (4 * week));
	Date pastDate = new Date(System.currentTimeMillis() - week);

	@Test
	// test: add rooms with duplicate number
	public void testAddDuplicateRooms() {

		admin.addRoom("horse", "available", 1);
		admin.addRoom("horse", "available", 2);
		Room temp = admin.addRoom("horse", "available", 1);
		assertNull(temp);
	}

	@Test
	// test: book a room when there is at least an available room
	public void testBookRoom() {

		for (int i = 1; i < 5; i++) {
			admin.addRoom("cat", "available", i);
		}
		// book a room for a cat

		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "cat");
		booker.enterCustomerInfo("Andy Anteater", "andy_anteater@gmail.com", booking, "Bob", admin.getRooms());
		admin.changeRoomStatus("booked", booking.getRoomNumber());

		assertNotNull(booking);
	}

	@Test
	// Test: enter pet type which does not exist
	public void testPetNotExist() {
		// add room
		for (int i = 1; i < 5; i++) {
			admin.addRoom("dog", "available", i);
		}
		// create booking
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "cat");
		assertNull(booking);
	}

	@Test
	// test: a room is booked with past date
	public void testBookPastDate() {
		admin.addRoom("dog", "available", 1);
		Booking booking = booker.enterDatesOfStay(pastDate, d2, admin.getRooms(), "dog");

		assertNull(booking);

	}

	@Test
	// test: a room is booked with overlap date.
	public void testDateOverlap() {
		// add room & create full booking
		admin.addRoom("dog", "available", 1);
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Andy Anteater", "andy_anteater@gmail.com", booking, "Bob", admin.getRooms());
		admin.changeRoomStatus("booked", booking.getRoomNumber());
		// create booking with overlap date
		Booking booking2 = booker.enterDatesOfStay(d3, d4, admin.getRooms(), "dog");
		assertNull(booking2);
	}

	@Test
	// Test: it is impossible to book a room when the hotel is full booked
	public void testFullBooked() {
		// add a room and a booking
		admin.addRoom("dog", "available", 1);
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Andy Anteater", "andy_anteater@gmail.com", booking, "Bob", admin.getRooms());
		admin.changeRoomStatus("booked", booking.getRoomNumber());

		// Create new booking with the same period of stay
		Booking booking2 = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		assertNull(booking2);

	}

	@Test
	// Test: booking contains correct booking ID
	public void testBookingIDExist() {
		// add a room to hotel
		admin.addRoom("dog", "available", 1);

		// book a room.
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Nicole Musco", "nicole_musco@gmail.com", booking, "Elora", admin.getRooms());

		// test bookingIDExist
		String bookingID = booking.getBookingId();
		assertEquals("nicole_musco@gmail.com1", bookingID);
	}

	@Test
	// test: customer info exists after it's entered
	public void testCustomerInfo() {

		for (int i = 1; i < 2; i++) {
			admin.addRoom("dog", "available", i);
		}
		// book a room for a dog

		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Su San", "susan@gmail.com", booking, "Bob", admin.getRooms());

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

		admin.addRoom("dog", "available", 1);

		// book a room for a dog
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Su San", "susan@gmail.com", booking, "Bob", admin.getRooms());

		// get room status and check if the room is booked.
		Room room = admin.getRooms().get(0);
		if (room.getNumber() == booking.getRoomNumber())
			assertEquals("booked", room.getStatus());
		else
			assertEquals("available", room.getStatus());

	}

	@Test
	// Test: meal info is add successfully
	public void testMealInfo() {

		admin.addRoom("dog", "available", 1);

		// book a room for a dog

		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Su San", "susan@gmail.com", booking, "Bob", admin.getRooms());

		// enter meal for pet
		booker.enterMealInfo("vegetarian", "10.00", 400, 30, booking.getBookingId());

		// booking should contain meal
		Meal meal = booking.getMealInfo();
		assertNotNull(meal);

	}

	@Test
	// Test: service is added
	public void testEnterService() {
		// assume that it's drop down list of service in GUI
		// Add room and service
		admin.addRoom("dog", "available", 1);

		booker.addNewService("spa", 300);
		Service spa = booker.getServices().get(0);

		// book a room for a dog
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Su San", "susan@gmail.com", booking, "Bob", admin.getRooms());

		// Enter service
		booker.enterService(spa, booking.getBookingId());

		assertNotNull(booking.getBookedServices().get(0)); 
	}

	@Test
	// Test: pet is checked in to the hotel
	public void testCheckIn() {
		// room status is changed, isCheckIn = true

		// add rooms
		admin.addRoom("dog", "available", 1);

		// book a room for a dog
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Su San", "susan@gmail.com", booking, "Bob", admin.getRooms());

		// check Bob in to the hotel
		booker.checkIn(booking.getBookingId(), admin.getRooms());

		// test isCheckIn is true and isCheckOut is false
		assertEquals(true, booking.isCheckedIn());
		assertEquals(false, booking.isCheckedOut());

		// test the room status is changed to occupied
		assertEquals("occupied", admin.getRooms().get(0).getStatus());
	}

	@Test
	// Test: Pet is checked out from the hotel
	public void testCheckOut() {

		// add rooms
		admin.addRoom("cat", "available", 1);

		// book a room for a cat
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "cat");
		booker.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", admin.getRooms());

		// check Elora in to the hotel
		booker.checkIn(booking.getBookingId(), admin.getRooms());

		// add bill check for the bill is paid
		billCtrl.addTransaction("For Elora room", 5000, booking);
		Bill bill = billCtrl.displayBill(booking.getBill_Id()); // There are no bills to check
		
		// check out with bill is not paid yet
		bill.setIsPaid(false);
			
		// check Elora out from the hotel.
		booker.checkOut(booking.getBookingId(), admin.getRooms());

		// test isCheckIn is true and isCheckOut is false
		assertEquals(true, booking.isCheckedIn()); //This fail
		assertEquals(false, booking.isCheckedOut());// This fail

		//test the room status is changed to occupied
		Room room = admin.getRooms().get(booking.getRoomNumber() - 1);
		assertEquals("occupied", room.getStatus()); // This fail
		
		//Then pay bill and check out
		bill.setIsPaid(true);
		//check out again
		booker.checkOut(booking.getBookingId(), admin.getRooms());
		// test isCheckIn is false and isCheckOut is true
		assertEquals(false, booking.isCheckedIn());
		assertEquals(true, booking.isCheckedOut());
		// test the room status is changed to dirty
		Room roomDirty = admin.getRooms().get(booking.getRoomNumber() - 1);
		assertEquals("dirty", roomDirty.getStatus());
		

	}

	@Test

	public void testCancelBooking() {
		// add a room and a booking
		admin.addRoom("dog", "available", 1);
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Mai Phuong", "mai_phuong@gmail.com", booking, "Abbe", admin.getRooms());

		// cancel booking
		booker.cancelBooking(booking.getBookingId());
		
		assertEquals(booker.getBookings().size(), 0);

	}

	@Test
	public void testBookingDifferDate() {

		// add a room and book the room
		admin.addRoom("dog", "available", 1);
		Booking booking = booker.enterDatesOfStay(d1, d3, admin.getRooms(), "dog");
		booker.enterCustomerInfo("Mai Phuong", "mai_phuong@gmail.com", booking, "Abbe", admin.getRooms());

		// book the room with different date
		Booking booking2 = booker.enterDatesOfStay(d2, d4, admin.getRooms(), "dog");

		assertNotNull(booking2);

	}
}
