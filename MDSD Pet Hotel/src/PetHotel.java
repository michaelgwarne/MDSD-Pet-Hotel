import Classes.mdsdAdmin.AdminController;
import Classes.mdsdAdmin.MdsdAdminFactory;

public class PetHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminController admin = MdsdAdminFactory.eINSTANCE.createAdminController();
		admin.addRoom("dog", "available", 1);
		admin.addRoom("cat", "available", 2);
		admin.displayRooms();
	}

}
