import static org.junit.Assert.*;

import org.junit.Test;

import Classes.mdsdAccount.Account;
import Classes.mdsdAccount.AccountController;
import Classes.mdsdAccount.MdsdAccountFactory;
import Classes.mdsdAccount.Pet;
import Classes.mdsdAdmin.AdminController;
import Classes.mdsdAdmin.MdsdAdminFactory;
import Classes.mdsdBooking.BookingController;
import Classes.mdsdBooking.MdsdBookingFactory;

public class TestAccount {



	AdminController admin = MdsdAdminFactory.eINSTANCE.createAdminController();
	BookingController booker = MdsdBookingFactory.eINSTANCE.createBookingController();
	AccountController accountCtrl = MdsdAccountFactory.eINSTANCE.createAccountController();

	
	@Test
	public void testGetAccount() {
		accountCtrl.createAccount("Regine", "regine@gmail.com", "lol");
		Account account = accountCtrl.getAccount("regine@gmail.com");
		assertNotNull(account);
		

		
	}
	@Test
	public void testLogIn(){
	accountCtrl.createAccount("Regine", "regine@gmail.com", "password");
	accountCtrl.login("regine@gmail.com", "password");
	assertTrue(accountCtrl.isUserLoggedIn("regine@gmail.com"));

	}
	
	
	@Test
	public void testCreateAccount() {
		
		//create an account
		Account account = accountCtrl.createAccount("Regine", "regine@gmail.com", "password");
		String accountID = account.getAccountID();
		accountCtrl.addPet("Bob", "Dog", accountID);
		
		
		 Pet pet = account.getPets().get(0);
		// int petInfo = pet.size();
		
		assertEquals("regine@gmail.com", accountID);
		assertNotNull(pet);
		
	}
}