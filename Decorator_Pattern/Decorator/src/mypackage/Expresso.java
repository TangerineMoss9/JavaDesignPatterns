package mypackage;

public class Expresso extends Beverage {
	
	public Expresso(String size){
		this.setSize(size);
		description = "Expresso, " + this.getSize();
		
	}
	
	public double cost() {
		return 1.99;
	};
}
