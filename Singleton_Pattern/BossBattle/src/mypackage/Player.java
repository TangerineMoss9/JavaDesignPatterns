package mypackage;

public class Player {
	private int strikingPower;
	
	public int Strike(Boss boss) {
		boss.setHealth(boss.getHealth() - this.strikingPower);
		return boss.getHealth();
	}
	
	public void setStrikingPower (int nPower) {
		strikingPower = nPower;
	}
	
}
