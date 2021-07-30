package mypackage;

public class HouseBlend extends Beverage {
	
	public HouseBlend(String size){
		this.setSize(size);
		description = "House Blend Coffee, " + this.getSize();
		
	}
	
	public double cost() {
		return .89;
	};
}
