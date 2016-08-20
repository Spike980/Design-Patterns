package iteratorPattern;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
	MenuItem[] list;
	int position = 0;

	public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}

	public Object next() {
		MenuItem menuItem = list[position];
		position++;
		return menuItem;
	}

	public boolean hasNext() {
		if (position > list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException("You can't remove an item until you have done atleast one next()");
		}

		if (list[position] != null) {
			for (int i=position-1; i < (list.length - 1); i++) {
				list[i] = list[i+1];
			} 
			list[list.length-1] = null;
		}
	}
}