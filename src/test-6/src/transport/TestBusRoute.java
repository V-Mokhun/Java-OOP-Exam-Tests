package transport;

public class TestBusRoute {
	public static void main(String[] args) {
		BusRoute route = new BusRoute("123", "A", "B");
		BusRoute route2 = new BusRoute("123456", "C", "D");

		System.out.println(route.isLongRoute());
		route.printDetails();

		System.out.println(route2.isLongRoute());
		route2.printDetails();
	}
}
