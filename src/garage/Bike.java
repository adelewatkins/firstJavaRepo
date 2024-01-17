package garage;

public class Bike extends Vehicle {

	private boolean sidecar;

	public Bike() {
		super();
	}

	public Bike(String type, String make, String colour, int topSpeed, boolean sidecar) {
		super(type, make, colour, topSpeed);
		this.sidecar = sidecar;
	}

	public boolean hasSidecar() {
		return sidecar;
	}

	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Has Sidecar: " + this.sidecar);
		System.out.println("---");
	}

}
