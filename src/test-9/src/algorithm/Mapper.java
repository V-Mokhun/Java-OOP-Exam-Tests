package algorithm;

import java.util.TreeMap;

public class Mapper {
	public static <K, V> String mapToString(TreeMap<K, V> map) {
		StringBuilder sb = new StringBuilder();
		for (K key : map.keySet()) {
			sb.append(key).append(": ").append(map.get(key)).append(", ");
		}
		return sb.toString();
	}
}
