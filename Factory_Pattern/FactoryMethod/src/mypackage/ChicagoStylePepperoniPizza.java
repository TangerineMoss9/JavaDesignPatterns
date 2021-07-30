package mypackage;

public class ChicagoStylePepperoniPizza extends Pizza{
	public ChicagoStylePepperoniPizza() {
		name = "Chicago Style Deep Dish Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Pure Tomato Sauce";
		
		toppings.add("Shredded Mozzerella Cheese");
	}
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
