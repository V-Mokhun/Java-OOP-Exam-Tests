package sports;

import java.util.Arrays;

public class Athlete {
	private String name;
	private String nationality;
	private double[] records;

	public Athlete(String name, String nationality, double[] records) {
		this.name = name;
		this.nationality = nationality;
		this.records = records == null ? new double[0] : records;
	}

	public String getName() {
		return name;
	}

	public String getNationality() {
		return nationality;
	}

	public double[] getRecords() {
		return records;
	}

	public double getBestRecord() {
		double best = records[0];
		for (int i = 1; i < records.length; i++) {
			if (records[i] < best) {
				best = records[i];
			}
		}
		return best;
	}

	@Override
	public String toString() {
		return "Athlete{" +
						"name='" + name + '\'' +
						", nationality='" + nationality + '\'' +
						", records=" + Arrays.toString(records) +
						'}';
	}
}
