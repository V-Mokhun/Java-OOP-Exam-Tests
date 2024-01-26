package finding;

public class Finder {
	public static <T> T findFirstNonNull(T[] arr) {
		for (T t : arr) {
			if (t != null) {
				return t;
			}
		}
		return null;
	}
}
