package algorithm;

import java.util.ArrayList;

public class TestClearer {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		Clearer.clearIfContains(list, "Hello");
		System.out.println(list);
	}
}
