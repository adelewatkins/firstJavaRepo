package garage;

public class Plane extends Vehicle {

	private boolean propeller;

	public Plane() {

	}

	public Plane(String type, String make, String colour, int topSpeed, boolean propeller) {
		setType(type);
		setMake(make);
		setColour(colour);
		setTopSpeed(topSpeed);
		this.propeller = propeller;
	}

	public boolean hasPropeller() {
		return propeller;
	}

	public void setPropeller(boolean propeller) {
		this.propeller = propeller;
	}

}
