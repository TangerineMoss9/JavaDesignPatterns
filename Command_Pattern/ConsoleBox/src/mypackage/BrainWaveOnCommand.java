package mypackage;

public class BrainWaveOnCommand implements Command {
	BrainWave brainWave;
	
	public BrainWaveOnCommand(BrainWave brainWave) {
		this.brainWave = brainWave;
	}

	public void execute() {
		brainWave.on();
		
	}
	
	
}
