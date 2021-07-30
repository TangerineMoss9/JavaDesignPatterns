package mypackage;

public class VBH extends CharacterDirector{
	Character character;
	
	public VBH(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + ", Valorous Bonescythe Helmet";
	}

}
