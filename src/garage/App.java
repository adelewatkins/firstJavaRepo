package garage;

public class App {

	public static void main(String[] args) {

//		Vehicle car1 = new Vehicle();
//		car1.setType("Car");
//		car1.setMake("VW");
//		car1.setColour("White");
//		car1.setTopSpeed(150);
//
//		Vehicle plane1 = new Vehicle("Plane", "Boeing", "Orange", 500);
//
//		car1.print();
//		plane1.print();

		Bike bike1 = new Bike("Bike", "Yamaha", "Red", 160, false);
		Bike bike2 = new Bike();
		bike2.setType("Bike");
		bike2.setMake("Honda");
		bike2.setColour("White");
		bike2.setTopSpeed(100);
		bike2.setSidecar(true);

		bike1.print();
		bike2.print();

		Plane plane2 = new Plane("Plane", "Boeing", "Blue", 500, false);
		Plane plane3 = new Plane();
		plane3.setType("Plane");
		plane3.setMake("Glider");
		plane3.setColour("Pink");
		plane3.setTopSpeed(45);
		plane3.setPropeller(true);

		plane2.print();
		plane3.print();

		Car car2 = new Car("Car", "Audi", "Grey", 155, true);
		car2.print();

		// can put them in an array
		Vehicle[] vehicles = { car2, plane2, bike2 };
		// then use the array to print all of them only needing
		// to call it once
		for (Vehicle vehicle : vehicles) {
			vehicle.print();
		}

	}

}
