package mypackage;

public class BrainWaveOffCommand implements Command{
	BrainWave brainWave;
	
	public BrainWaveOffCommand(BrainWave brainWave) {
		this.brainWave = brainWave;
	}

	public void execute() {
		brainWave.off();
		
	}
	
	
}
