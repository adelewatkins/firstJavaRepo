package garage;

public class Car extends Vehicle {

	private boolean sunroof;

	public Car() {

	}

	public Car(String type, String make, String colour, int topSpeed, boolean sunroof) {
		setType(type);
		setMake(make);
		setColour(colour);
		setTopSpeed(topSpeed);
		this.sunroof = sunroof;
	}

	public boolean hasSunroof() {
		return sunroof;
	}

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}

}
