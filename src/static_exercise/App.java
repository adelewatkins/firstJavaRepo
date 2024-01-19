package static_exercise;

public class App {

	public static void main(String[] args) {

		Garage bigGarage = new Garage("The Big Garage");
		bigGarage.park(new Plane("Boeing", "Blue + Yellow", 550, false));
		bigGarage.park(new Plane("Air Bus", "White + Red", 500, false));

		Garage bikeGarage = new Garage("The Bike Garage");
		bikeGarage.park(new Bike("Bicycle", "Green", 40, true));
		bikeGarage.park(new Bike("Honda", "Red", 140, false));

		Garage myGarage = new Garage("My Own Garage");
		myGarage.park(new Car("VW", "White", 120, false));
		myGarage.park(new Car("Audi", "Black", 130, false));

//		myGarage.collect(1);
//		bigGarage.collect(0);
//		bikeGarage.collect(1);

		System.out.println(bigGarage);
		System.out.println(bikeGarage);
		System.out.println(myGarage);

		// System.out.println(plane20.calcBill());

		bigGarage.fix();
		bikeGarage.fix();
		myGarage.fix();

		myGarage.collect(5);
		System.out.println(myGarage);

	}
}
