package static_exercise;

public class Bike extends Vehicle {

	private boolean sidecar;

	public Bike() {
		super();
	}

	public Bike(String make, String colour, int topSpeed, boolean sidecar) {
		super(make, colour, topSpeed);
		this.sidecar = sidecar;
	}

	@Override
	public int calcBill() {
		return 2 * getTopSpeed();
	}

	public boolean hasSidecar() {
		return sidecar;
	}

	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
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
		Bike other = (Bike) obj;

		if (!super.equals(obj)) {
			return false;
		}
		if (this.sidecar != other.hasSidecar()) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Bike [Make = " + getMake() + ", Colour = " + getColour() + ", Top Speed = " + getTopSpeed() + "mph"
				+ " Sidecar = " + sidecar + ", Id = " + getId() + " ]";
	}

}
