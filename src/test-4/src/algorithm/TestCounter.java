package algorithm;

import java.util.HashMap;

public class TestCounter {
	public static void main(String[] args) {
		HashMap<String, Person> hashmap = new HashMap<>();
		hashmap.put("John", new Person("John", 20));
		hashmap.put("Mary", new Person("Mary", 21));
		hashmap.put("Peter", new Person("Peter", 22));
		hashmap.put("John", new Person("John", 39));

		System.out.println(Counter.countUniqueKeys(hashmap));
	}
}
