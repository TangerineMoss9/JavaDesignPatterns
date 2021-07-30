package mypackage;

public class CaliforniaStylePepperoniPizza extends Pizza{
	public CaliforniaStylePepperoniPizza() {
		name = "Cali Style Pepperoni Pizza";
		dough = "California Dough";
		sauce = "Organic Sauce";
		
		toppings.add("Vegan Cheese");
	}
	void cut() {
		System.out.println("Cutting to order Specifications");
	}
}
