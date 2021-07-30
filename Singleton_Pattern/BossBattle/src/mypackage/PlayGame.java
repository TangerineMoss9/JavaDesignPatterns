package mypackage;

public class PlayGame {
	public static void main(String[] args) {
		
		Boss boss = Boss.getInstance();
		
		Player p1 = new Player();
		p1.setStrikingPower(10);
		Player p2 = new Player();
		p2.setStrikingPower(15);
		Player p3 = new Player();
		p3.setStrikingPower(20);
		
		System.out.println("Boss Health: " + boss.getHealth());
		
		p1.Strike(boss);
		System.out.println("Player p1 strikes the boss, "
				+ "Boss Health: " + boss.getHealth());
		p2.Strike(boss);
		System.out.println("Player p2 strikes the boss, "
				+ "Boss Health: " + boss.getHealth());
		p3.Strike(boss);
		System.out.println("Player p3 strikes the boss, "
				+ "Boss Health: " + boss.getHealth());
		p1.Strike(boss);
		System.out.println("Player p1 strikes the boss, "
				+ "Boss Health: " + boss.getHealth());
		p2.Strike(boss);
		System.out.println("Player p2 strikes the boss, "
				+ "Boss Health: " + boss.getHealth());
		p3.Strike(boss);
		System.out.println("Player p3 strikes the boss, "
				+ "Boss Health: " + boss.getHealth());
		p1.Strike(boss);
		System.out.println("Player p1 strikes the boss, "
				+ "Boss Health: " + boss.getHealth());
		
		System.out.println("Game Over!");
		
	}
}
