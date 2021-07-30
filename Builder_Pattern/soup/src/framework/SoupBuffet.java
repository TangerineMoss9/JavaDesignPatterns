package framework;

public class SoupBuffet {
	String soupBuffetName;
	
	ChickenSoup chickenSoup;
	ClamChowder clamChowder;
	FishChowder fishChowder;
	Minnestrone minnestrone;
	Pastafazul pastafazul;
	TofuSoup tofuSoup;
	VegetableSoup vegetableSoup;
	
	public String getSoupBuffetName() 
	{
		return soupBuffetName;
	}
	
	public String getTodaysSoups()
	{
		StringBuffer stringOfSoups = new StringBuffer();
		stringOfSoups.append(" Tday's Soups!  ");
		stringOfSoups.append(" Chicken Soup: ");
		stringOfSoups.append(this.chickenSoup.getSoupName());
		stringOfSoups.append(" Clam Chowder: ");
		stringOfSoups.append(this.clamChowder.getSoupName());
		stringOfSoups.append(" Fish Chowder: ");
		stringOfSoups.append(this.fishChowder.getSoupName());
		stringOfSoups.append(" Minnestrone: ");
		stringOfSoups.append(this.minnestrone.getSoupName());
		stringOfSoups.append(" Pasta fazul: ");
		stringOfSoups.append(this.pastafazul.getSoupName());
		stringOfSoups.append(" Tofu Soup: ");
		stringOfSoups.append(this.tofuSoup.getSoupName());
		stringOfSoups.append(" Vegetable Soup: ");
		stringOfSoups.append(this.vegetableSoup.getSoupName());
		return stringOfSoups.toString();
	}
}

