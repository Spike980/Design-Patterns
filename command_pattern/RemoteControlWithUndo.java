package commandPattern;

class RemoteControlWithUndo {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControlWithUndo() {
		offCommands = new Command[7];
		onCommands = new Command[7];

		Command noCommand = new NoCommand();
		for(int i=0;i<7;i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onComand, Command offCommand) {
		onCommands[slot] = onComand;
		offCommands[slot] = offCommand;	
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}

	public void undoButtonWasPushed() {
		undoCommand.undo();
	}

	public String toString() {
		StringBuffer stringBuf = new StringBuffer();
		stringBuf.append("\n------Remote Control------\n");
		for (int i=0; i < onCommands.length; i++) {
			stringBuf.append("[slot "+ i +"] "+ onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
		}	
		return stringBuf.toString();
	}
}