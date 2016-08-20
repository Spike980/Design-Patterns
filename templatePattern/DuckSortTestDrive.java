package templatePattern;

public class DuckSortTestDrive {
	public static void main(String[] args) {
		Duck[] ducks = {
					new Duck("D", 38),
					new Duck("A", 4),
					new Duck("C", 34),
					new Duck("B", 8),
					new Duck("E", 83)
					};

		System.out.println("Before Sorting:");
		display(ducks);	

		Array.sort(ducks);

		System.out.println("After Sorting");
		display(ducks);
	}

	public static void display(Duck[] ducks) {
		for (int i=0; i<ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}	
}