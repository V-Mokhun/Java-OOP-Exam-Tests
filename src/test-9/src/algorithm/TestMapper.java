package algorithm;

import java.util.TreeMap;

public class TestMapper {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		System.out.println(Mapper.mapToString(map));
	}
}
