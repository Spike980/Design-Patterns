package iteratorPattern;
import java.util.Iterator;
import java.util.ArrayList;

public class Waitress {
	ArrayList menus;

	public Waitress(ArrayList menus) {
		this.menus = menus;
	}

	public void printMenu() {
		Iterator menuIterator = menus.iterator();
		while(menuIterator.hasNext()) {
			Menu menu = (Menu)menuIterator.next();
			printMenuItems(menu.createIterator());
		}
	}

	void printMenuItems(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription() + '\n');
		}
	}
}