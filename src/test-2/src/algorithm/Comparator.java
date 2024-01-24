package algorithm;

public class Comparator {
	public static <T> boolean compareThree(T a, T b, T c) {
		return a.equals(b) && b.equals(c);
	}
}
