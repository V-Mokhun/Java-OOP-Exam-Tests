package algorithm;

import java.util.Iterator;

public class Finder {
	public static <T> T atIndex(Iterator<T> iterator, int index) {
		int i = 0;
		while (iterator.hasNext()) {
			T item = iterator.next();
			if (i == index)
				return item;

			i++;
		}

		return null;
	}
}
