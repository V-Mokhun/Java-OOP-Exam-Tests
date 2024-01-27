package arrayAlg;

public class ArrayAlg {
	public static <T extends Comparable<T>> int findMaxIndex(T[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array is empty");
		}

		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].compareTo(arr[maxIndex]) > 0) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
