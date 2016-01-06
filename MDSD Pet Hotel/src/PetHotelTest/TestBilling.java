package PetHotelTest;
import static org.junit.Assert.*;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;
import Classes.mdsdAdmin.AdminController;
import Classes.mdsdAdmin.MdsdAdminFactory;
import Classes.mdsdBooking.Booking;
import Classes.mdsdBooking.BookingController;
import Classes.mdsdBooking.MdsdBookingFactory;
import Classes.mdsdBilling.*;


public class TestBilling {

	long week = 604800000;

	AdminController admin = MdsdAdminFactory.eINSTANCE.createAdminController();
	BookingController booker = MdsdBookingFactory.eINSTANCE.createBookingController();
	BillingController billCtrl = MdsdBillingFactory.eINSTANCE.createBillingController();

	Date d1 = new Date(System.currentTimeMillis() + week);
	Date d2 = new Date(System.currentTimeMillis() + (3*week));
	

	@Test
	public void TestAddNewTransaction(){

		//add rooms
		admin.addRoom("cat", "available", 1);

		//book a room for a cat
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "cat");
		booker.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", admin.getRooms());

		//No bill exists, bill ID is null
		assertNull(booking.getBill_Id());

		billCtrl.addTransaction("For Elora", 5000, booking);

		//Now bill exists, should not be none
		assertNotNull(booking.getBill_Id());

		Bill bill = billCtrl.getBills().get(0);
		//Amount should be 5000
		assertEquals((double)5000, (double)bill.getTotalAmount(),0.1);
	}


	@Test
	public void TestAddIntoExistingTransaction(){

		//add rooms
		admin.addRoom("cat", "available", 1);

		//book a room for a cat
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "cat");
		booker.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", admin.getRooms());

		//No bill exists, bill ID is null
		assertNull(booking.getBill_Id());

		billCtrl.addTransaction("For Elora room", 5000, booking);
		billCtrl.addTransaction("For Elora service", 1000, booking);

		Bill bill = billCtrl.getBills().get(0);

		assertEquals((double)6000, (double)bill.getTotalAmount(),0.1);

	}

	@Test
	public void TestPaid(){
		//add rooms
		admin.addRoom("cat", "available", 1);

		//book a room for a cat
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "cat");
		booker.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", admin.getRooms());

		billCtrl.addTransaction("For Elora room", 5000, booking);

		Bill bill = billCtrl.getBills().get(0);

		//bill is not paid yet
		assertFalse(bill.isPaid());
		bill.setIsPaid(true);
		//bill is paid
		assertTrue(bill.isPaid());
	}

	@Test
	public void TestRefund(){

		//add rooms
		admin.addRoom("cat", "available", 1);

		//book a room for a cat
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "cat");
		booker.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", admin.getRooms());

		billCtrl.addTransaction("For Elora room", 5000, booking);
		Bill bill = billCtrl.getBills().get(0);

		billCtrl.giveRefund("For Elora room", bill.getID());
		assertEquals((double)0, (double)bill.getTotalAmount(),0);


	}

	@Test
	public void TestDisplayBilling(){

		//add rooms
		admin.addRoom("cat", "available", 1);

		//book a room for a cat
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "cat");
		booker.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", admin.getRooms());
		// create bill
		billCtrl.addTransaction("For Elora", 5000, booking);
		// test with a fake ID
		assertNull(billCtrl.displayBill("fail"));
		// test with real ID
		assertNotNull(billCtrl.displayBill(booking.getBill_Id()));

	}

}
