package static_exercise;

import java.util.Objects;

public abstract class Vehicle implements Comparable<Vehicle> {

	private static int count;

	private int id;

//	private int id = ++count; -could also do it this way 

	private String make;

	private String colour;

	private int topSpeed;

	public Vehicle() {
		super();
		this.id = ++count;
	}

	public Vehicle(String make, String colour, int topSpeed) {
		this.id = ++count;
		this.make = make;
		this.colour = colour;
		this.topSpeed = topSpeed;
	}

	public abstract int calcBill();

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

		Vehicle other = (Vehicle) obj;
		return id == other.id && Objects.equals(make, other.make) && Objects.equals(colour, other.colour)
				&& Objects.equals(topSpeed, other.topSpeed);
	}

	@Override
	public String toString() {
		return "Vehicle [id = " + id + ", make = " + make + ", colour = " + colour + ", topSpeed = " + topSpeed + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	// this orders based on ID
//	@Override
//	public int compareTo(Vehicle o) {
//		if (id < o.getId()) {
//			return -1;
//		} else if (id > o.getId()) {
//			return +1;
//		} else {
//			return 0;
//		}

	// this orders alphabetical on make
	@Override
	public int compareTo(Vehicle o) {
		return this.make.compareTo(o.make);
	}

}
