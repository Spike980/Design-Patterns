package iteratorPattern;
import java.util.Iterator;

public class DinerMenu implements Menu{
	static final int MAX_ITEMS = 6;
	int numOfItems = 0;
	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("Vegetarian BLT", "", true, 2.99);
		addItem("BLT", "Bacon with lettuce and tomato", false, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
		addItem("HotDog", "A hot dog with onions, topped with cheese", false, 3.05);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem= new MenuItem(name, description, vegetarian, price);
		if (numOfItems >= MAX_ITEMS) {
			System.err.println("The menu is full");
		} else {
			menuItems[numOfItems] = menuItem;
			numOfItems++;
		}
	}

	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}