package finding;

public class TestFinder {
	public static void main(String[] args) {
		String[] arr = { null, "a", "b", "c" };
		String s = Finder.findFirstNonNull(arr);
		System.out.println(s);
	}
}
