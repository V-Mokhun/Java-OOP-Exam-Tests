package moto;

public class TestVehicle {
	public static void main(String[] args) {
		Vehicle[] vehicles = {
			new Vehicle("Audi", 220),
			new Vehicle("BMW", 180),
			new Vehicle("Mercedes", 200),
			new Vehicle("Porsche", 280),
			new Vehicle("Volkswagen", 190)
		};

		System.out.println("Max speed: " + MaxFinder.maxValue(vehicles));
	}
}
