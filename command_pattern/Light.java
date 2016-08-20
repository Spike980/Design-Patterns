package commandPattern;

public class Light {
	String room;

	public Light(String room) {
		this.room = room;
	}

	public void on() {
		System.out.println(room + " Light Is ON");
	}

	public void off() {
		System.out.println(room + " Light Is OFF");
	}
} 