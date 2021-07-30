package mypackage;

public class SteamedMilk extends CondimentDirector{
	Beverage beverage;
	
	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.getSize();
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", SteamedMilk";
		
	}
	
	public double cost() {
		if (beverage.getSize() == "Small") {
			return .5 + beverage.cost();
		}
		else if (beverage.getSize() == "Medium") {
			return .10 + beverage.cost();
		}
		else if (beverage.getSize() == "Large") {
			return .15 + beverage.cost();
		}
		else {
			return 0;
		}

	}
}
