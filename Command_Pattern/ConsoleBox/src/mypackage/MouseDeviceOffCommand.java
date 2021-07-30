package mypackage;

public class MouseDeviceOffCommand implements Command{
	MouseDevice mouseDevice;
	
	public MouseDeviceOffCommand(MouseDevice mouseDevice) {
		this.mouseDevice = mouseDevice;
	}

	public void execute() {
		mouseDevice.off();
		
	}
	
	
}
