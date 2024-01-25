package algorithm;

import java.util.ArrayList;

public class Clearer {
	public static <T> void clearIfContains(ArrayList<T> list, T element) {
		if(list == null) {
			throw new IllegalArgumentException("list is null");
		}

		if (list.contains(element)) {
			list.clear();
		}
	}
}
