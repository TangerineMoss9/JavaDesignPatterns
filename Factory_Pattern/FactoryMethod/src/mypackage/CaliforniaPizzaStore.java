package mypackage;

public class CaliforniaPizzaStore extends PizzaStore{

	protected Pizza createPizza(String item) {
		if (item.equalsIgnoreCase("Cheese")) {
			return new CaliforniaStyleCheesePizza();
		} else if (item.equalsIgnoreCase("Veggie")){
			return new CaliforniaStyleCheesePizza();
		} else if (item.equalsIgnoreCase("Pepperoni")){
			return new CaliforniaStyleCheesePizza();
		} else if (item.equalsIgnoreCase("Clam")){
			return new CaliforniaStyleCheesePizza();
		} else return null;
	}
	
}
