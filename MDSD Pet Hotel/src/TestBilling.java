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
import Classes.mdsdBilling.*;


public class TestBilling {
	
	long week = 604800000;

	AdminController admin = MdsdAdminFactory.eINSTANCE.createAdminController();
	BookingController booker = MdsdBookingFactory.eINSTANCE.createBookingController();
	AccountController account = MdsdAccountFactory.eINSTANCE.createAccountController(); 
	BillingController billCtrl = MdsdBillingFactory.eINSTANCE.createBillingController();
	
	Date d1 = new Date(System.currentTimeMillis() + week);
	Date d2 = new Date(System.currentTimeMillis() + (3*week));
	Date d3 = new Date(System.currentTimeMillis() + (2*week));
	Date d4 = new Date(System.currentTimeMillis() + (4*week));
	
	@Test
	public void TestAddNewTransaction(){
		
		//add rooms
		for(int i = 1; i < 2; i++){
			admin.addRoom("cat", "available", i);
		}

		//book a room for a cat
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "cat");
		booker.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", admin.getRooms());

		//No bill exists, bill ID is bull
		assertTrue(booking.getBill_Id() == null);
	
		billCtrl.addTransaction("For Elora", 5000, booking);
		
		//Now bill exists, should not be none
		assertFalse(booking.getBill_Id() == null);
		
		EList<Bill> bills = billCtrl.getBills();
		for(Bill bill:bills){
			if (bill.getID() == booking.getBill_Id()){
				//Amount should be 5000
				assertEquals((double)5000, (double)bill.getTotalAmount(),0.1);
			}
		}
		
	}
	
	
	@Test
	public void TestAddIntoExistedTransaction(){
		
		//add rooms
		for(int i = 1; i < 2; i++){
			admin.addRoom("cat", "available", i);
		}

		//book a room for a cat
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "cat");
		booker.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", admin.getRooms());

		//No bill exists, bill ID is bull
		assertTrue(booking.getBill_Id() == null);
	
		billCtrl.addTransaction("For Elora room", 5000, booking);
		billCtrl.addTransaction("For Elora service", 1000, booking);
		
		EList<Bill> bills = billCtrl.getBills();
		for(Bill bill:bills){
			if (bill.getID() == booking.getBill_Id()){
				//1000 should be added to bill make it total 6000
				assertEquals((double)6000, (double)bill.getTotalAmount(),0.1);
			}
		}

	}
	
	@Test
	public void TestPaid(){
		//add rooms
		for(int i = 1; i < 2; i++){
			admin.addRoom("cat", "available", i);
		}

		//book a room for a cat
		Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "cat");
		booker.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", admin.getRooms());
	
		billCtrl.addTransaction("For Elora room", 5000, booking);
		
		EList<Bill> bills = billCtrl.getBills();
		for(Bill bill:bills){
			if (bill.getID() == booking.getBill_Id()){
				//bill is not paid yet
				assertFalse(bill.isPaid());
				bill.setIsPaid(true);
				//bill is paid
				assertTrue(bill.isPaid());
			}
		}
		
	}
	
	@Test
	public void TestRefund(){
		
		//add rooms
				for(int i = 1; i < 2; i++){
					admin.addRoom("cat", "available", i);
				}

				//book a room for a cat
				Booking booking = booker.enterDatesOfStay(d1, d2, admin.getRooms(), "cat");
				booker.enterCustomerInfo("Nicole Musco", "nicole_Musco@gmail.com", booking, "Elora", admin.getRooms());
			
				billCtrl.addTransaction("For Elora room", 5000, booking);
				EList<Bill> bills = billCtrl.getBills();
				for(Bill bill:bills){
					billCtrl.giveRefund("Refund Elora", bill.getID());
					assertEquals((double)0, (double)bill.getTotalAmount(),0.1);
					
				}
	}
	
}
