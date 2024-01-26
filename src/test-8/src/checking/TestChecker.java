package checking;

public class TestChecker {
	public static void main(String[] args) {
		System.out.println(Checker.containsDuplicates(1, 2, 3));
		System.out.println(Checker.containsDuplicates(1, 2, 1));
		System.out.println(Checker.containsDuplicates(1, 1, 1));
		System.out.println(Checker.containsDuplicates("a", "b", "c"));
		System.out.println(Checker.containsDuplicates("a", "b", "a"));
		System.out.println(Checker.containsDuplicates("a", "a", "a"));
	}
}
