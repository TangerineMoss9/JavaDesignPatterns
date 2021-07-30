package mypackage;

public class CaliforniaStyleCheesePizza extends Pizza{
	public CaliforniaStyleCheesePizza() {
		name = "Cali Style Cheese Pizza";
		dough = "California Dough";
		sauce = "Organic Sauce";
		
		toppings.add("Vegan Cheese");
	}
	void cut() {
		System.out.println("Cutting to order Specifications");
	}
}
