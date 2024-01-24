package sports;

import java.util.Arrays;

public class TestAthlete {
	public static void main(String[] args) {
		Athlete[] athletes = {
						new Athlete("Usain Bolt", "Jamaica", new double[]{9.58, 19.19}),
						new Athlete("Carl Lewis", "USA", new double[]{9.86, 19.75}),
						new Athlete("Maurice Greene", "USA", new double[]{9.74, 19.86}),
						new Athlete("Justin Gatlin", "USA", new double[]{9.74, 19.75}),
						new Athlete("Asafa Powell", "Jamaica", new double[]{9.72, 19.90}),
		};

		System.out.println("Athletes before sorting: " + Arrays.toString(athletes));
		Arrays.sort(athletes, new RecordComparator().thenComparing(new NationalityNameComparator()));
		System.out.println("Athletes after sorting: " + Arrays.toString(athletes));
	}
}
