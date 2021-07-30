package mypackage;

public class RemoteLoader {
	public static void main(String[] args) {
		
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Deck");	
		Stereo stereo = new Stereo("Deck");
		HotTub hotTub = new HotTub();
		
		MacroOnCommand macroOn = new MacroOnCommand(hotTub,stereo,livingRoomLight);
		MacroOffCommand macroOff = new MacroOffCommand(hotTub,stereo,livingRoomLight);
		
		
		
		remoteControl.setCommand(0, macroOn, macroOff);
		
		
		
		System.out.println(remoteControl);
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		
	}
}
