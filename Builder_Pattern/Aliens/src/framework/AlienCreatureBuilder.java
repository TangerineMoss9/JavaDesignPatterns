package framework;

abstract class AlienCreatureBuilder {
	AlienCreature alienCreature;
	
	public AlienCreature getAlienCreature() {
		return alienCreature;
	}
	
	public void buildAlienCreature() {
		alienCreature = new AlienCreature();
		
	}
	
	public abstract void setCreatureName();
	
	
	public void buildEyes() {
		alienCreature.eyes = new Eyes();
	}
	public void buildHead() {
		alienCreature.head = new Head();
	}
	public void buildNose() {
		alienCreature.nose = new Nose();
	}
	public void buildEars() {
		alienCreature.ears = new Ears();
	}
	public void buildMouth() {
		alienCreature.mouth = new Mouth();
	}
	public void buildBody() {
		alienCreature.body = new Body();
	}
	public void buildArms() {
		alienCreature.arms = new Arms();
	}
	public void buildHands() {
		alienCreature.hands = new Hands();
	}
	public void buildLegs() {
		alienCreature.legs = new Legs();
	}
	public void buildFeet() {
		alienCreature.feet = new Feet();
	}
}
