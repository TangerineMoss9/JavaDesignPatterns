package mypackage;

public class MenuTestDrive {
	public static void main(String args[]) {
		DinerMenu2 dinerMenu = new DinerMenu2();
		PancakeHouseMenu2 pancakeHouseMenu = new PancakeHouseMenu2();
		
		Waitress2 alice = new Waitress2 (pancakeHouseMenu, dinerMenu);
		
		alice.printMenu();
	}
}
