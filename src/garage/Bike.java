package garage;

public class Bike extends Vehicle {

	private boolean sidecar;

	public Bike() {

	}

	public Bike(String type, String make, String colour, int topSpeed, boolean sidecar) {
		setType(type);
		setMake(make);
		setColour(colour);
		setTopSpeed(topSpeed);
		this.sidecar = sidecar;
	}

	public boolean hasSidecar() {
		return sidecar;
	}

	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}

}
