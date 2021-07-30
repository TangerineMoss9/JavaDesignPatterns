package mypackage;

public class Mocha extends CondimentDirector{
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.getSize();
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	public double cost() {
		if (beverage.getSize() == "Small") {
			return .15 + beverage.cost();
		}
		else if (beverage.getSize() == "Medium") {
			return .20 + beverage.cost();
		}
		else if (beverage.getSize() == "Large") {
			return .25 + beverage.cost();
		}
		else {
			return 0;
		}

	}
}
