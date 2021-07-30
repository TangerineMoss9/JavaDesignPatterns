package mypackage;

public class CeilingFan {
	String room;
	public CeilingFan(String room) {
		this.room = room;
	}
	public void high() {
		System.out.println(room + "ceiling ran is on high");
	}
	public void off() {
		System.out.println(room + "ceiling ran is on off");
	}
}
