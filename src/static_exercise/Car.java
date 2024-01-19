package static_exercise;

public class Car extends Vehicle {

	private boolean sunroof;

	public Car() {
		super();
	}

	public Car(String make, String colour, int topSpeed, boolean sunroof) {
		super(make, colour, topSpeed);
		this.sunroof = sunroof;
	}

	@Override
	public int calcBill() {
		return 5 * getTopSpeed();
	}

	public boolean hasSunroof() {
		return sunroof;
	}

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
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
		return "Car [ Make = " + getMake() + ", Colour = " + getColour() + ", Top Speed = " + getTopSpeed() + "mph"
				+ " sunroof = " + sunroof + ", ID = " + getId() + " ]";
	}

}
