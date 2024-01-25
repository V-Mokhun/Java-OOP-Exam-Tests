package utilities;

public class Counter {
	public static <T extends Comparable<T>> int countLessOrEqual(T[] array, T element) {
		int count = 0;
		for (T e : array) {
			if (e.compareTo(element) <= 0) {
				count++;
			}
		}
		return count;
	}
}
