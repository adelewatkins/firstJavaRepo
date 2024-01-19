package static_exercise;

public class Plane extends Vehicle {

	private boolean propeller;

	public Plane() {
		super();

	}

	public Plane(String make, String colour, int topSpeed, boolean propeller) {
		super(make, colour, topSpeed);
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
		return "Plane [Make = " + getMake() + ", Colour = " + getColour() + ", Top Speed = " + getTopSpeed() + "mph"
				+ " propeller = " + propeller + ", ID = " + getId() + " ]";
	}

}
