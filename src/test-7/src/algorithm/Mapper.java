package algorithm;

import java.util.HashMap;

public class Mapper {
	public static <K, V> String mapToString(HashMap<K, V> map) {
		StringBuilder sb = new StringBuilder();
		for (K key : map.keySet()) {
			sb.append(key.toString()).append(": ").append(map.get(key).toString()).append(", ");
		}
		return sb.toString();
	}
}
