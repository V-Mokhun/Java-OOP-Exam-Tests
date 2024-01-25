package checking;

public class Checker {
	public static <T> boolean isEqualOrNull(T a, T b) {
		if (a == null) {
			return b == null;
		}
		return a.equals(b);
	}
}
