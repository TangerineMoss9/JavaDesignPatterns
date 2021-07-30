package mypackage;

public class Decaf extends Beverage {
	
	public Decaf(String size){
		this.setSize(size);
		description = "Decaf Coffee, " + this.getSize();
		
	}
	
	public double cost() {
		return 1.05;
	};
}
