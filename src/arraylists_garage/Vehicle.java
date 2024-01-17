package arraylists_garage;

public class Vehicle {

	private String type;

	private String make;

	private String colour;

	private int topSpeed;

	public Vehicle() {
		// default (blank) constructor
		super();
	}

	public Vehicle(String type, String make, String colour, int topSpeed) {
		this.type = type;
		this.make = make;
		this.colour = colour;
		this.topSpeed = topSpeed;
	}

	public void print() {
		System.out.println("Vehicle Type: " + this.type);
		System.out.println("Make: " + this.make);
		System.out.println("Colour: " + this.colour);
		System.out.println("Top Speed: " + this.topSpeed + "mph");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

}
