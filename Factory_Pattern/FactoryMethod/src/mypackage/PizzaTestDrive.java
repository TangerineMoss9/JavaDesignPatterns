package mypackage;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore= new NYPizzaStore();
		PizzaStore ChicagoStore= new ChicagoStore();
		PizzaStore CaliStore= new CaliforniaPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("First customer ordered a " + pizza.getName() + "\n");
		
		pizza = ChicagoStore.orderPizza("cheese");
		System.out.println("Second customer ordered a " + pizza.getName() + "\n");
		
		pizza = CaliStore.orderPizza("cheese");
		System.out.println("Third customer ordered a " + pizza.getName() + "\n");
	}
	
}
