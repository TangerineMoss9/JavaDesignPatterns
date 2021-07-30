package mypackage;

public class ConsoleBoxTest {
public static void main(String[] args) {
		
		ConsoleBox consoleBox = new ConsoleBox();
			
		BrainWave brainWave = new BrainWave();
		FitnessDevice fitnessDevice = new FitnessDevice();
		MouseDevice mouseDevice = new MouseDevice();
		
		BrainWaveOffCommand brainWaveOff = new BrainWaveOffCommand(brainWave);
		BrainWaveOnCommand brainWaveOn = new BrainWaveOnCommand(brainWave);
		
		FitnessDeviceOffCommand fitnessDeviceOff = new FitnessDeviceOffCommand(fitnessDevice);
		FitnessDeviceOnCommand fitnessDeviceOn = new FitnessDeviceOnCommand(fitnessDevice);
		
		MouseDeviceOffCommand mouseDeviceOff = new MouseDeviceOffCommand(mouseDevice);
		MouseDeviceOnCommand mouseDeviceOn = new MouseDeviceOnCommand(mouseDevice);
		
		
		consoleBox.setCommand(0, brainWaveOn, brainWaveOff);
		consoleBox.setCommand(1, fitnessDeviceOn, fitnessDeviceOff);
		consoleBox.setCommand(2, mouseDeviceOn, mouseDeviceOff);
		
		
		
		System.out.println(consoleBox);
		consoleBox.onButtonWasPushed(0);
		consoleBox.offButtonWasPushed(0);
		consoleBox.onButtonWasPushed(1);
		consoleBox.offButtonWasPushed(1);
		consoleBox.onButtonWasPushed(2);
		consoleBox.offButtonWasPushed(2);
		
		
	}
}
