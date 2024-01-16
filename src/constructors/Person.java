package constructors;

public class Person {

	// set the variables to private
	private String name;

	private int age;

	private String job;

	public void intro() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Job: " + job);
		System.out.println("-------");
	}

	// using constructors

	// blank constructor so we can use set name to add the
	// info after in app
	public Person() {

	}

	// can have multiple constructors with the same name
	// as long as the params have different contents
	public Person(String name, int age, String job) {
		// using the setters keeps the validation we wrote
		setName(name);
		setAge(age);
		// auto-generate would look like this:
		this.job = job;
	}

	// getters and setters are public
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// can also add validations
	public void setAge(int age) {
		if (age >= 0 && age < 120) {
			this.age = age;
		} else {
			System.out.println("Please provide an age between 0 and 120");
		}
	}

	public int getAge() {
		return this.age;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getJob() {
		return job;
	}

}
