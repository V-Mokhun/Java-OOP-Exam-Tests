package comparisons;

public class Comparator {
	public static <T extends Comparable<T>> boolean isFirstLargest(T a, T b, T c) {
		return a.compareTo(b) > 0 && a.compareTo(c) > 0;
	}
}
