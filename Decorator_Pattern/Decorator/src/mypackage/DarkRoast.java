package mypackage;

public class DarkRoast extends Beverage {
	
	public DarkRoast(String size){
		this.setSize(size);
		description = "Dark Roast Coffee, " + this.getSize();
		
	}
	
	public double cost() {
		return .99;
	};
}
 