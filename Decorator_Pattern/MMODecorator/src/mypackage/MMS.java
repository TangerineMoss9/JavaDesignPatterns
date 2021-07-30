package mypackage;

public class MMS extends CharacterDirector{
	Character character;
	
	public MMS(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + ", Malefic Mask of the Shadows";
	}

}
