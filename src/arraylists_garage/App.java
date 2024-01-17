package arraylists_garage;

public class App {

	public static void main(String[] args) {

//		ArrayList<Vehicle> vehicles = new ArrayList<>();
//
//		vehicles.add(new Car("Car", "Ford", "Blue", 90, true));
//		vehicles.add(new Bike("Bike", "Bicycle", "Black", 35, false));
//		vehicles.add(new Plane("Plane", "Boeing", "White + Orange", 550, false));
//		vehicles.add(new Plane("Plane", "Boeing", "White ", 300, true));
//
//		for (Vehicle vehicle : vehicles) {
//			vehicle.print();
//		}
//
//		vehicles.remove(3);
//
//		for (Vehicle vehicle : vehicles) {
//			vehicle.print();
//		}

		Garage bigGarage = new Garage("The Big Garage");
		bigGarage.park(new Plane("Plane", "Boeing", "Blue + Yellow", 550, false));
		bigGarage.park(new Plane("Plane", "Air Bus", "White + Red", 500, false));

		Garage bikeGarage = new Garage("The Bike Garage");
		bikeGarage.park(new Bike("Bike", "Bicycle", "Green", 40, true));
		bikeGarage.park(new Bike("Bike", "Honda", "Red", 140, false));

		Garage myGarage = new Garage("My Own Garage");
		myGarage.park(new Car("Car", "VW", "White", 120, false));
		myGarage.park(new Car("Car", "Audi", "Black", 130, false));

		bigGarage.print();
		bikeGarage.print();
		myGarage.print();

		myGarage.collect(1);
		bigGarage.collect(0);
		bikeGarage.collect(1);

		bigGarage.print();
		bikeGarage.print();
		myGarage.print();

	}
}
