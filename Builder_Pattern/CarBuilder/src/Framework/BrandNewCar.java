package Framework;



class BrandNewCar {
	String carName;
	Chassis chassis;
	Body body;
	
	
	
	public String getCarName() {
		return carName;
	}
	
	
	public String getCarSpecs() {
		StringBuffer carSpecs = new StringBuffer();
		carSpecs.append(" Today's car-> ");
		carSpecs.append(" Specifications: ");
		carSpecs.append(this.chassis.getPartID() + ", ");
		carSpecs.append(this.body.getPartID() + ", ");
		return carSpecs.toString();
	}
}
