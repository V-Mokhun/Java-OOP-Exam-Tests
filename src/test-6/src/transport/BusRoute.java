package transport;

public record BusRoute(String routeNumber, String startLocation, String endLocation) {
	public BusRoute {
		if(routeNumber == null || routeNumber.isEmpty())
			throw new IllegalArgumentException("routeNumber cannot be null or blank");
	}

	public boolean isLongRoute() {
		return this.routeNumber.length() > 4;
	}

	public void printDetails() {
		System.out.println("Route Number: " + this.routeNumber + ", Start Location: " + this.startLocation +
						", End Location: " + this.endLocation);
	}
}
