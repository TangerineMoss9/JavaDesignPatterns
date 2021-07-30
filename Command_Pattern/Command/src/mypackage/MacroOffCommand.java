package mypackage;

public class MacroOffCommand implements Command {
	HotTub hotTub;
	Stereo stereo;
	Light light;
	
	public MacroOffCommand(HotTub hotTub, Stereo stereo, Light light) {
		this.hotTub = hotTub;
		this.stereo = stereo;
		this.light = light;
	}

	public void execute() {
		hotTub.off();
		stereo.off();
		light.on();
		
	}
	public void undo() {
		hotTub.on();
		stereo.setDVD();
		light.dim();
	}
}
