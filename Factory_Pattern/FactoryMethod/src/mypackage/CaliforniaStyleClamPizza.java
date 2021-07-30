package mypackage;

public class CaliforniaStyleClamPizza extends Pizza{
	public CaliforniaStyleClamPizza() {
		name = "Cali Style Clam Pizza";
		dough = "California Dough";
		sauce = "Organic Sauce";
		
		toppings.add("Vegan Cheese");
	}
	void cut() {
		System.out.println("Cutting to order Specifications");
	}
}
