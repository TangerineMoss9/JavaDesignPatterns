package Framework;

abstract class MidSizeCarBuilder {
	BrandNewCar brandNewCar;
	
	public static BrandNewCar uniqueInstance;
	public static BrandNewCar getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new BrandNewCar();
		}
		return uniqueInstance;
	}
	
	
	
	public BrandNewCar getBrandNewCar() {
		return brandNewCar;
	}
	
	public void buildBrandNewCar() {
		brandNewCar = new BrandNewCar();
		
	}
	
	public abstract void setCarName();
	
	public void buildChassis() {
		brandNewCar.chassis = new Chassis();
	}
	
	public void buildBody() {
		brandNewCar.body = new Body();
	}
}

