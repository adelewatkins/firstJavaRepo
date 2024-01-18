package arraylists_garage;

import java.util.ArrayList;

public class Garage {

	private String name;
	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public Garage(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void park(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void collect(int i) {
		vehicles.remove(i);
	}

	public void collect(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

	@Override
	public String toString() {
		return "Garage [name=" + name + ", vehicles=" + vehicles + "]";
	}

//	public void print() {
//		for (Vehicle vehicle : vehicles) {
//			System.out.println("Stored at " + name);
//			vehicle.print();
//
//		}
//	}

}
