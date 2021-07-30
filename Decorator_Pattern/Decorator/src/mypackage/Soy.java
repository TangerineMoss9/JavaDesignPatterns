package mypackage;

public class Soy extends CondimentDirector{
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
		this.size = beverage.getSize();
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
		
	}
	
	public double cost() {
		if (beverage.getSize() == "Small") {
			return .10 + beverage.cost();
		}
		else if (beverage.getSize() == "Medium") {
			return .15 + beverage.cost();
		}
		else if (beverage.getSize() == "Large") {
			return .20 + beverage.cost();
		}
		else {
			return 0;
		}

	}
}
