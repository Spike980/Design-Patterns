package facadePattern;

public class HomeTheatreFacade {
	Amplifier ampl;
	Tuner tuner;
	DVDPlayer dvd;
	CDPlayer cd;
	Projector projector;
	TheatreLights lights;
	Screen screen;
	PopcornPopper popper;

	public HomeTheatreFacade(Amplifier amp,
							Tuner tuner,
							DVDPlayer dvd,
							CDPlayer cd,
							Projector projector,
							TheatreLights lights,
							Screen screen,
							PopcornPopper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;	
	}

	public void watchMovie() {
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play();	
	}

	public void endMovie() {
		System.out.println("Shutting movie theatre down...");
		popper.off();
		light.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();	
	}
}