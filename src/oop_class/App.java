package oop_class;

public class App {

	public static void main(String[] args) {

		Person friend = new Person();
		friend.setName("Adele");
		friend.setAge(28);
		friend.setJob("LBG");

		Person friend2 = new Person();
		friend2.setName("Luke");
		friend2.setAge(34);
		friend2.setJob("Carpenter");

		Person friend3 = new Person();
		friend3.setName("Georgia");
		friend3.setAge(25);
		friend3.setJob("Pharmacy");

		// print the friends
		friend.intro();
		friend2.intro();
		friend3.intro();

		// can also print using an array
		Person[] friends = { friend, friend2, friend3 };
		for (Person people : friends) {
			people.intro();
		}

		// setting friend2 a new age by getting their current
		// one, adding one, setting it, then doing the intro
		// method to see the updated age

		friend2.setAge(friend2.getAge() + 1);
		friend2.intro();

	}

}
