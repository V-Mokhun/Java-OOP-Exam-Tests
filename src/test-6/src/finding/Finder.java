package finding;

import java.util.HashMap;

public class Finder {
	public static <K, V> V findValueByKey(HashMap<K, V> map, K key) {
		if(map == null || key == null)
			throw new IllegalArgumentException("map and key cannot be null");

		return map.get(key);
	}
}
