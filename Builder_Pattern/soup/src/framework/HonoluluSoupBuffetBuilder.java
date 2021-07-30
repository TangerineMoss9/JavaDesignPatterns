package framework;

class HonoluluSoupBuffetBuilder extends SoupBuffetBuilder{

	public void buildClamChodwer() {soupBuffet.clamChowder = new HonoluluClamChowder();}
	public void buildFishChowder() {soupBuffet.fishChowder = new HonoluluFishChowder();}
	
	public void setSoupBuffetName() {soupBuffet.soupBuffetName = "Honolulu Soup Buffet";}
}
