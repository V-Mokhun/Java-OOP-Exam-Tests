package checking;

public class TestChecker {
	public static void main(String[] args) {
		System.out.println(Checker.isEqualOrNull("a", "a"));
		System.out.println(Checker.isEqualOrNull("a", "b"));
		System.out.println(Checker.isEqualOrNull(null, null));
		System.out.println(Checker.isEqualOrNull(null, "a"));
		System.out.println(Checker.isEqualOrNull("a", null));
	}
}
