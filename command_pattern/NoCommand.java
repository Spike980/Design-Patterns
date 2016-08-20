package commandPattern;

public class NoCommand implements Command {
	public void execute() {
		System.out.println("Nothing happened");
	}	

	public void undo() {}
}