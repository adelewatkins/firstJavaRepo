package constructors;

public class App {

	public static void main(String[] args) {

		//this one uses the constructor with info in the params
		Person friend = new Person("Adele", 28, "LBG");

		//this one uses the blank constructor
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
		
		Person friend4 = new Person("Archie", 2, "");
		friend4.intro();

	}

}
