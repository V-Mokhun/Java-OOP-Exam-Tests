package moto;

public class MaxFinder {
	public static <T extends Comparable<T>> T maxValue(T[] array) {
		if(array == null || array.length == 0) {
			throw new IllegalArgumentException("Array is empty or null");
		}

		T max = array[0];

		for(int i = 1; i < array.length; i++) {
			if(array[i].compareTo(max) > 0) {
				max = array[i];
			}
		}

		return max;
	}
}
