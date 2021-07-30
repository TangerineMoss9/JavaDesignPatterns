package framework;

public class AlienCreature {
	String alienName;
	Eyes eyes;
	Head head;
	Nose nose;
	Ears ears;
	Mouth mouth;
	Body body;
	Arms arms;
	Hands hands;
	Legs legs;
	Feet feet;
	
	
	
	public String getAlienName() {
		return alienName;
	}
	
	public String Display() {
		StringBuffer alienSpecs = new StringBuffer();
		alienSpecs.append(" This Creature has: ");
		alienSpecs.append(this.eyes.getPartID() + ", ");
		alienSpecs.append(this.head.getPartID() + ", ");
		alienSpecs.append(this.nose.getPartID() + ", ");
		alienSpecs.append(this.ears.getPartID() + ", ");
		alienSpecs.append(this.mouth.getPartID() + ", ");
		alienSpecs.append(this.body.getPartID() + ", ");
		alienSpecs.append(this.arms.getPartID() + ", ");
		alienSpecs.append(this.hands.getPartID() + ", ");
		alienSpecs.append(this.legs.getPartID() + ", ");
		alienSpecs.append(this.feet.getPartID());
		return alienSpecs.toString();
		
	}
}
