package utilities;

public class TestCounter {
	public static void main(String[] args) {
		Person[] people = {
				new Person("John", 20),
				new Person("Mary", 30),
				new Person("Peter", 40),
				new Person("Paul", 24),
				new Person("Alice", 39),
				new Person("Bob", 42),
		};

		System.out.println(Counter.countLessOrEqual(people, new Person("Sally", 35)));
	}
}
