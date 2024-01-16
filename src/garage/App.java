package garage;

public class App {

	public static void main(String[] args) {

		Vehicle car1 = new Vehicle();
		car1.setType("Car");
		car1.setMake("VW");
		car1.setColour("White");
		car1.setTopSpeed(150);

		Vehicle plane1 = new Vehicle("Plane", "Boeing", "Orange", 500);

		car1.print();
		plane1.print();

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
		plane2.print();
	}

}
