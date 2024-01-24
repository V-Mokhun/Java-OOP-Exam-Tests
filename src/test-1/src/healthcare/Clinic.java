package healthcare;

import java.util.Objects;

public class Clinic extends Hospital {
	private double rating;

	public Clinic(String name, double capacity, double rating) {
		super(name, capacity);
		this.rating = (rating < 0 || rating > 5) ? 3.0 : rating;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		if (rating >= 0 && rating <= 5)
			this.rating = rating;
	}

	@Override
	public String toString() {
		if (getName().isEmpty()) {
			return this.getClass().getSimpleName() + ": Capacity: " + getCapacity() + "." + "\n" +
							"Rating: " + rating + ".";
		}

		return this.getClass().getSimpleName() + ": Name: " + getName() + ". Capacity: " + getCapacity() + "." + "\n" +
						"Rating: " + rating + ".";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		return Double.compare(this.getRating(), rating) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), rating);
	}
}
