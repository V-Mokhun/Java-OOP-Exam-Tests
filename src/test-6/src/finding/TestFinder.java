package finding;

import java.util.HashMap;

public class TestFinder {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "A");
		map.put("2", "B");
		map.put("3", "C");

		System.out.println(Finder.findValueByKey(map, "1"));
		System.out.println(Finder.findValueByKey(map, "2"));
		System.out.println(Finder.findValueByKey(map, "3"));
		System.out.println(Finder.findValueByKey(map, "4"));
	}
}
