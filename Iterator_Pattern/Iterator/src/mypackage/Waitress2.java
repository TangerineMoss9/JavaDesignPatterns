package mypackage;
import java.util.ArrayList;

public class Waitress2 {
	PancakeHouseMenu2 pancakeHouseMenu;
	DinerMenu2 dinerMenu;
	
	public Waitress2(PancakeHouseMenu2 pancakeHouseMenu,
					DinerMenu2 dinerMenu) 
	{
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		
		Iterator pancakeIterator = pancakeHouseMenu.createItorator();
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		
		Iterator dinerIterator = dinerMenu.createItorator();
		System.out.println("LUNCH");
		printMenu(dinerIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
	
}
