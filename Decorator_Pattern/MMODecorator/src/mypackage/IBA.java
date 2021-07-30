package mypackage;

public class IBA extends CharacterDirector{
	Character character;
	
	public IBA(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + ", Icy Blast Amulet";
	}

}
