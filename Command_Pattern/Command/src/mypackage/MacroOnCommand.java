package mypackage;

public class MacroOnCommand implements Command {
	HotTub hotTub;
	Stereo stereo;
	Light light;
	
	public MacroOnCommand(HotTub hotTub, Stereo stereo, Light light) {
		this.hotTub = hotTub;
		this.stereo = stereo;
		this.light = light;
	}

	public void execute() {		
		hotTub.on();
		stereo.setDVD();
		light.dim();
	}
	public void undo() {
		
		hotTub.off();
		stereo.off();
		light.on();
	}
}
