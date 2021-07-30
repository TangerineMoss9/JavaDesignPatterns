package mypackage;

public class Light {
	String room;
	public Light(String room) {
		this.room = room;
	}
	
	public void on() {
		System.out.println("Light is on");
	}
	
	public void dim() {
		System.out.println("Light is dimmed");
	}
	
	public void off() {
		System.out.println("Light is off");
	}
}
