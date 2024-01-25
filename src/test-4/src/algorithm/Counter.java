package algorithm;

import java.util.HashMap;

public class Counter {
	public static <K, V> int countUniqueKeys(HashMap<K, V> hashmap) {
		int count = 0;
		for (K key : hashmap.keySet()) {
			count++;
		}
		return count;
	}
}
