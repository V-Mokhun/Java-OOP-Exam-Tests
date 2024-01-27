package comparisons;

public class TestComparator {
	public static void main(String[] args) {
		System.out.println(Comparator.isFirstLargest(1, 2, 3));
		System.out.println(Comparator.isFirstLargest(2, 1, 3));
		System.out.println(Comparator.isFirstLargest(3, 2, 1));
		System.out.println(Comparator.isFirstLargest("a", "b", "c"));
		System.out.println(Comparator.isFirstLargest("b", "a", "c"));
		System.out.println(Comparator.isFirstLargest("c", "b", "a"));
	}
}
