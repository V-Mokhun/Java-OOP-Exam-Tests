package algorithm;

import java.util.ArrayList;

public class TestFinder {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(Finder.atIndex(list.iterator(), 1));
		System.out.println(Finder.atIndex(list.iterator(), 4));
	}
}
