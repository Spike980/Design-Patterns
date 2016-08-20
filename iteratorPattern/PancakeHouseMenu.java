package iteratorPattern;
import java.util.Iterator;
import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("K & B's Pancake", "Pancakes with scrambled eggs, and toasts", true, 2.99);
		addItem("Regular Pancake", "Pancakes with fried eggs, and sausage", false, 2.99);
		addItem("Blueberry Pancake", "Pancakes with fresh blueberries", true, 3.49);
		addItem("Waffles", "Waffles with blueberries and strawberries", true, 3.79);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem= new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	public Iterator createIterator() {
		return menuItems.iterator();
	}

}