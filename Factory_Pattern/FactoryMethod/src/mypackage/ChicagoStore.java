package mypackage;

public class ChicagoStore extends PizzaStore{

	protected Pizza createPizza(String item) {
		if (item.equalsIgnoreCase("Cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (item.equalsIgnoreCase("Veggie")){
			return new ChicagoStyleCheesePizza();
		} else if (item.equalsIgnoreCase("Pepperoni")){
			return new ChicagoStyleCheesePizza();
		} else if (item.equalsIgnoreCase("Clam")){
			return new ChicagoStyleCheesePizza();
		} else return null;
	}
	
}
