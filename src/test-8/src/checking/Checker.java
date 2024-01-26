package checking;

public class Checker {
	public static <T> boolean containsDuplicates(T a, T b, T c) {
		return a.equals(b) || a.equals(c) || b.equals(c);
	}
}
