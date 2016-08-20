package facadePattern;

public class HomeTheatreFacade {
	public static void main(String[] args) {
		// instantiate  components here 
		 
		HomeTheatreFacade homeTheatre = new HomeTheatreFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
		homeTheatre.watchMovie("Raiders of the Last Ark");
		homeTheatre.endMovie();
	}
}