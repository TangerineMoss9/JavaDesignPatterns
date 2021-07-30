package mypackage;

public class Boss {
	private static Boss uniqueInstance;
	private int health = 100;
	
	public static Boss getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Boss();
		}
		return uniqueInstance;
	}
	public void setHealth (int nHealth) {
		health = nHealth;
	}
	public int getHealth() {
		return health;
	}
}
