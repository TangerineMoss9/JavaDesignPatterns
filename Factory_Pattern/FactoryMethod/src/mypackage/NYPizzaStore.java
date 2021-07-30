package mypackage;

public class NYPizzaStore extends PizzaStore{

	protected Pizza createPizza(String item) {
		if (item.equalsIgnoreCase("Cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equalsIgnoreCase("Veggie")){
			return new NYStyleCheesePizza();
		} else if (item.equalsIgnoreCase("Pepperoni")){
			return new NYStyleCheesePizza();
		} else if (item.equalsIgnoreCase("Clam")){
			return new NYStyleCheesePizza();
		} else return null;
	}
	
}
