package mypackage;

public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Pure Tomato Sauce";
		
		toppings.add("Shredded Mozzerella Cheese");
	}
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
