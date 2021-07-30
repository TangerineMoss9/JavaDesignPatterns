package mypackage;

public class CaliforniaStyleVeggiePizza extends Pizza{
	public CaliforniaStyleVeggiePizza() {
		name = "Cali Style Veggie Pizza";
		dough = "California Dough";
		sauce = "Organic Sauce";
		
		toppings.add("Vegan Cheese");
	}
	void cut() {
		System.out.println("Cutting to order Specifications");
	}
}
