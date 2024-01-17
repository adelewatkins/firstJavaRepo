package arraylists_garage;

public class Plane extends Vehicle {

	private boolean propeller;

	public Plane() {
		super();
	}

	public Plane(String type, String make, String colour, int topSpeed, boolean propeller) {
		super(type, make, colour, topSpeed);
		this.propeller = propeller;
	}

	public boolean hasPropeller() {
		return propeller;
	}

	public void setPropeller(boolean propeller) {
		this.propeller = propeller;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Has propeller: " + this.propeller);
		System.out.println("---");
	}

}
