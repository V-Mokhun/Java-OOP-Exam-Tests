package healthcare;

import java.util.Objects;

public class Hospital {
	private String name;
	private double capacity;

	public Hospital(String name, double capacity) {
		this.name = name == null ? "" : name;
		this.capacity = capacity < 0 ? 50 : capacity;
	}

	public double getCapacity() {
		return capacity;
	}

	public String getName() {
		return name;
	}

	public void setCapacity(double capacity) {
		if (capacity >= 0)
			this.capacity = capacity;
	}

	public void setName(String name) {
		if (name != null)
			this.name = name;
	}

	@Override
	public String toString() {
		if (name.isEmpty()) {
			return this.getClass().getSimpleName() + ": Capacity: " + capacity + ".";
		}
		return this.getClass().getSimpleName() + ": Name: " + name + ". Capacity: " + capacity + ".";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Hospital hospital = (Hospital) o;
		return Double.compare(capacity, hospital.capacity) == 0 && Objects.equals(name, hospital.name);
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, capacity);
	}
}
