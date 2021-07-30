package mypackage;

public class NAS extends CharacterDirector{
	Character character;
	
	public NAS(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + ", Necklace of Arcane Spheres";
	}

}
