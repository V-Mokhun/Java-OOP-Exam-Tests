package algorithm;

import java.util.HashMap;

public class TestMapper {
	public static void main(String[] args) {
		HashMap<String, Person> map = new HashMap<String, Person>();
		map.put("John", new Person("John"));
		map.put("Mary", new Person("Mary"));
		map.put("Bob", new Person("Bob"));

		System.out.println(Mapper.mapToString(map));
	}
}
