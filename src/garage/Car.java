package garage;

public class Car extends Vehicle {

	private boolean sunroof;

	public Car() {
		super();
	}

	public Car(String type, String make, String colour, int topSpeed, boolean sunroof) {
		super(type, make, colour, topSpeed);
		// super is the parent, needs to be first line of constructor
		this.sunroof = sunroof;
	}

	public boolean hasSunroof() {
		return sunroof;
	}

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}

	public void carInfo() {
		System.out.println("Has Sunroof: " + this.sunroof);
		System.out.println("---");
	}

}
