package oop_class;

public class App {

	public static void main(String[] args) {

		Person friend = new Person();
		friend.name = "Adele";
		friend.age = 28;
		friend.job = "LBG";

		Person friend2 = new Person();
		friend2.name = "Luke";
		friend2.age = 34;
		friend2.job = "Carpenter";

		Person friend3 = new Person();
		friend3.name = "Georgia";
		friend3.age = 25;
		friend3.job = "Pharmacy";

		// print the friends
		friend.intro();
		friend2.intro();
		friend3.intro();

		// can also print using an array
		Person[] friends = { friend, friend2, friend3 };
		for (Person people : friends) {
			people.intro();
		}

	}

}
