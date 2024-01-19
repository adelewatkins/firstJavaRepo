package static_exercise;

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

//	public void collect(Vehicle vehicle) {
//		vehicles.remove(vehicle);
//	}

	public boolean collect(int id) {
		for (Vehicle vehicle : this.vehicles) {
			if (id == vehicle.getId()) {
				return this.vehicles.remove(vehicle);
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Garage [Garage name = " + name + ", vehicles = " + vehicles + "]";
	}

	public int fix() {
		int totalBill = 0;

		for (Vehicle vehicle : vehicles) {
			totalBill = totalBill + vehicle.calcBill();
			// System.out.println("Running total for " + name + " £" + totalBill);
		}
		System.out.println("Total bill for " + name + " £" + totalBill);
		return totalBill;
	}

}
