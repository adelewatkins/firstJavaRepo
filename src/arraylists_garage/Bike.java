package arraylists_garage;

public class Bike extends Vehicle {

	private boolean sidecar;

	public Bike() {
		super();
	}

	public Bike(String type, String make, String colour, int topSpeed, boolean sidecar) {
		super(type, make, colour, topSpeed);
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

//	@Override
//	public void print() {
//		super.print();
//		System.out.println("Has Sidecar: " + this.sidecar);
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
		return "Bike [getType()=" + getType() + ", getMake()=" + getMake() + ", getColour()=" + getColour()
				+ ", getTopSpeed()=" + getTopSpeed() + " sidecar=" + sidecar + " ]";
	}

}
