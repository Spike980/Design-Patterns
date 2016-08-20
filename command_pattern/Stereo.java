package commandPattern;

public class Stereo {
	public Stereo() {}

	public void on() {
		System.out.println("Stereo is ON");
	}

	public void setCD() {
		System.out.println("CD is set");
	}

	public void volume(int level) {
		System.out.println("Volume is at level "+level);
	}

	public void off() {
		System.out.println("Stereo is OFF");
	}
}