package framework;

class Director {

	public static void main(String[] args) {
		AlienCreature mars = buildCreature(new MarsAlienCreatureBuilder());
		System.out.println(
				"New Creature Found: "
				+ mars.getAlienName()
				+"."
				+mars.Display());
		
	}

	
	
	
	public static AlienCreature buildCreature(AlienCreatureBuilder alienCreatureBuilder) {
		
		
		alienCreatureBuilder.buildAlienCreature();
		
		alienCreatureBuilder.setCreatureName();
		
		alienCreatureBuilder.buildEyes();
		alienCreatureBuilder.buildHead();
		alienCreatureBuilder.buildNose();
		alienCreatureBuilder.buildEars();
		alienCreatureBuilder.buildMouth();
		alienCreatureBuilder.buildBody();
		alienCreatureBuilder.buildArms();
		alienCreatureBuilder.buildHands();
		alienCreatureBuilder.buildLegs();
		alienCreatureBuilder.buildFeet();
		
		
		return alienCreatureBuilder.getAlienCreature();
	}
	
}
