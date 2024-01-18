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

	@Override
	public int calcBill() {

		return 10 * getTopSpeed();
	}

	public boolean hasPropeller() {
		return propeller;
	}

	public void setPropeller(boolean propeller) {
		this.propeller = propeller;
	}

//	@Override
//	public void print() {
//		super.print();
//		System.out.println("Has propeller: " + this.propeller);
//		System.out.println("---");
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Plane other = (Plane) obj;

		if (!super.equals(obj)) {
			return false;
		}
		if (this.propeller != other.hasPropeller()) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Plane [getType()=" + getType() + ", getMake()=" + getMake() + ", getColour()=" + getColour()
				+ ", getTopSpeed()=" + getTopSpeed() + " propeller=" + propeller + " ]";
	}

}
