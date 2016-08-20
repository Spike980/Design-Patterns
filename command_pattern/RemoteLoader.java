package commandPattern;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");

		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo();	

		CeilingFan ceilingFan = new CeilingFan("living room");

		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, garageDoorOpen, garageDoorClose);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOffWithCD);
		remoteControl.setCommand(4, ceilingFanHigh, ceilingFanOff);
		remoteControl.setCommand(5, ceilingFanMedium, ceilingFanOff);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		remoteControl.onButtonWasPushed(5);
		remoteControl.offButtonWasPushed(5);
		remoteControl.undoButtonWasPushed();




		Command[] partyOnCommands = {livingRoomLightOn, stereoOnWithCD, ceilingFanHigh};
		Command[] partyOffCommands = {livingRoomLightOff, stereoOffWithCD, ceilingFanOff};

		MacroCommand partyOn = new MacroCommand(partyOnCommands);
		MacroCommand partyOff = new MacroCommand(partyOffCommands);

		remoteControl.setCommand(6, partyOn, partyOff);
		remoteControl.onButtonWasPushed(6);
		remoteControl.offButtonWasPushed(6);


	}
}