package mypackage;

public class FitnessDeviceOffCommand implements Command {
	FitnessDevice fitnessDevice;
	
	public FitnessDeviceOffCommand(FitnessDevice fitnessDevice) {
		this.fitnessDevice = fitnessDevice;
	}

	public void execute() {
		fitnessDevice.off();
		
	}
	
	
}
