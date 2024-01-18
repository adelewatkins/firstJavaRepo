package arraylists_garage;

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

//	@Override
//	public void print() {
//		super.print();
//		System.out.println("Has Sunroof: " + this.sunroof);
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
		Car other = (Car) obj;

		if (!super.equals(obj)) {
			return false;
		}
		if (this.sunroof != other.hasSunroof()) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Car [getType()=" + getType() + ", getMake()=" + getMake() + ", getColour()=" + getColour()
				+ ", getTopSpeed()=" + getTopSpeed() + " sunroof=" + sunroof + " ]";
	}

}
