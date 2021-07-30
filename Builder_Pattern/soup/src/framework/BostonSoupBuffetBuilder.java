package framework;

class BostonSoupBuffetBuilder extends SoupBuffetBuilder{

	public void buildClamChodwer() {soupBuffet.clamChowder = new BostonClamChowder();}
	public void buildFishChowder() {soupBuffet.fishChowder = new BostonFishChowder();}
	
	public void setSoupBuffetName() {soupBuffet.soupBuffetName = "Boston Soup Buffet";}
}
