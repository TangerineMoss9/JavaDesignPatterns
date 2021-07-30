package mypackage;

public class MouseDeviceOnCommand implements Command{
	MouseDevice mouseDevice;
	
	public MouseDeviceOnCommand(MouseDevice mouseDevice) {
		this.mouseDevice = mouseDevice;
	}

	public void execute() {
		mouseDevice.on();
		
	}
	
	
}
