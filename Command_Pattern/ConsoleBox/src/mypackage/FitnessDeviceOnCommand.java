package mypackage;

public class FitnessDeviceOnCommand implements Command{
	FitnessDevice fitnessDevice;
	
	public FitnessDeviceOnCommand(FitnessDevice fitnessDevice) {
		this.fitnessDevice = fitnessDevice;
	}

	public void execute() {
		fitnessDevice.on();
		
	}
	
	
}
