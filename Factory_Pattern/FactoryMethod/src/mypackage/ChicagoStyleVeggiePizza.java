package mypackage;

public class ChicagoStyleVeggiePizza extends Pizza{
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Style Deep Dish Veggie Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Pure Tomato Sauce";
		
		toppings.add("Shredded Mozzerella Cheese");
	}
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
