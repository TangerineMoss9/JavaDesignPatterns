package mypackage;

public abstract class Beverage {
	String description = "Unknown Beverage";
	String size = "Unknown Size";
	
	public String getDescription(){
		return description;
	}
	
	public void setSize(String s) {
		size = s;
	}
	public String getSize() {
		return size;
	}
	
	public abstract double cost();
}
