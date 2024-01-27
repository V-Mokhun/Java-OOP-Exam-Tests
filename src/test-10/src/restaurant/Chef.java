package restaurant;

public class Chef implements Comparable<Chef> {
	private int id;
	private String name;
	private double skillLevel;

	public Chef(int id, String name, double skillLevel) {
		this.id = id;
		this.name = name;
		this.skillLevel = skillLevel;
	}

	@Override
	public String toString() {
		return "Chef{" +
						"id=" + id +
						", name='" + name + '\'' +
						", skillLevel=" + skillLevel +
						'}';
	}

	@Override
	public int compareTo(Chef o) {
		int result = Double.compare(o.skillLevel, skillLevel);
		if (result == 0) {
			result = name.compareTo(o.name);
		}
		return result;
	}
}
