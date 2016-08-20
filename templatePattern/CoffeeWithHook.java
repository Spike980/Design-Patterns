package templatePattern;
import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
	public void brew() {
		System.out.println("Dripping coffee through filter");
	}

	public void addCondiments() {
		System.out.println("Adding sugar and milk");
	}

	public boolean customerWantsCondiments() {
		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}	

	private String getUserInput() {
		String answer = null;

		System.out.println("Would you like milk and sugar with your coffee (y/n)?");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO Error trying to read your answer");
		}	

		if (answer == null) {
			return "no";
		}

		return answer;
	}
}