package mypackage;

public class Driver {

	public static void main(String args[]) {
		Character character = new Mage();
		System.out.println(character.getDescription());
		
		Character character2 = new Priest();
		character2 = new VBH( character2 );
		character2 = new MMS( character2 );
		character2 = new IBA( character2 );
		character2 = new NAS( character2 );
		character2 = new DGPT( character2 );
		System.out.println(character2.getDescription());
		
		
	}
}