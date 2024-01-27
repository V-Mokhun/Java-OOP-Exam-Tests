package restaurant;

import java.util.Arrays;

public class TestChef {
	public static void main(String[] args) {
		Chef[] chefs = {
						new Chef(1, "Gordon Ramsay", 3.5),
						new Chef(2, "Jamie Oliver", 4.5),
						new Chef(3, "Heston Blumenthal", 3.5),
						new Chef(4, "Marco Pierre White", 3.0),
						new Chef(5, "Nigella Lawson", 3.25),
		};

		System.out.println(Arrays.toString(chefs));
		Arrays.sort(chefs);
		System.out.println(Arrays.toString(chefs));
	}
}
