package mypackage;

public class DGPT extends CharacterDirector{
	Character character;
	
	public DGPT(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + ", Deadly Gladiator's Pendent of Triumph";
	}

}
