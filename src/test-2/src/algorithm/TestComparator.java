package algorithm;

public class TestComparator {
	public static void main(String[] args) {
		Student s1 = new Student("John", 3.5f);
		Student s2 = new Student("John", 3.5f);
		Student s3 = new Student("John", 3.5f);
		Student s4 = new Student("Ann", 3.5f);

		System.out.println(Comparator.compareThree(s1, s2, s3));
		System.out.println(Comparator.compareThree(s1, s2, s4));
	}
}
