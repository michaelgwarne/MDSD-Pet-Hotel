package PetHotelTest;
import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;
import Classes.mdsdAdmin.AdminController;
import Classes.mdsdAdmin.MdsdAdminFactory;
import Classes.mdsdBooking.Booking;
import Classes.mdsdBooking.BookingController;
import Classes.mdsdBooking.MdsdBookingFactory;
import Classes.mdsdBilling.*;


public class TestBilling {

	long week = 604800000;

	AdminController adminCtrl = MdsdAdminFactory.eINSTANCE.createAdminController();
	BookingController bookerCtrl = MdsdBookingFactory.eINSTANCE.createBookingController();
	BillingController billCtrl = MdsdBillingFactory.eINSTANCE.createBillingController();

	Date d1 = new Date(System.currentTimeMillis() + week);
	Date d2 = new Date(System.currentTimeMillis() + (3*week));
	

	@Test
	public void TestAddNewTransaction(){

		//add rooms
		adminCtrl.addRoom("cat", "available", 1);

		//book a room for a cat
		Booking booking = bookerCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "cat");
		bookerCtrl.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", adminCtrl.getRooms());

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
		adminCtrl.addRoom("cat", "available", 1);

		//book a room for a cat
		Booking booking = bookerCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "cat");
		bookerCtrl.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", adminCtrl.getRooms());

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
		adminCtrl.addRoom("cat", "available", 1);

		//book a room for a cat
		Booking booking = bookerCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "cat");
		bookerCtrl.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", adminCtrl.getRooms());

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
		adminCtrl.addRoom("cat", "available", 1);

		//book a room for a cat
		Booking booking = bookerCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "cat");
		bookerCtrl.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", adminCtrl.getRooms());

		billCtrl.addTransaction("For Elora room", 5000, booking);
		Bill bill = billCtrl.getBills().get(0);

		billCtrl.giveRefund("For Elora room", bill.getID());
		assertEquals((double)0, (double)bill.getTotalAmount(),0);


	}
	
	
	@Test
	public void TestModifyBill(){

		//add rooms
		adminCtrl.addRoom("cat", "available", 1);

		//book a room for a cat
		Booking booking = bookerCtrl.enterDatesOfStay(d1, d2, adminCtrl.getRooms(), "cat");
		bookerCtrl.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", adminCtrl.getRooms());

		billCtrl.addTransaction("For Elora room", 5000, booking);
	
		billCtrl.modifyBill("For Elora room", booking.getBill_Id(), 2500);
		Bill bill = billCtrl.getBills().get(0);
		assertEquals((double)2500, (double)bill.getTransactions().get(0).getPrice(), 0);


	}
	

}
