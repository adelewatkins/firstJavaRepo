package arrays_exercise;

public class App {

	public static void main(String[] args) {
		// Create an array that will hold 10 integer values, populate the array with
		// values then call and output each element
		int[] nums = { 1, 5, 9, 33, 56, 80, 521, 99, 14, 2 };
		for (int i = 0; i < nums.length; i++) {
			System.out.println("I: " + i + " NUMBER: " + nums[i]);
		}

		// Create a for loop that populates an integer array with values,
		// outputting them at each iteration.
		
		//Then create another loop that iterates through the array, 
		//changing the values at each point to equal itself times 10, 
		//outputting them at each iteration.

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			System.out.println("I: " + i + " NUMBER: " + numbers[i]);
			numbers[i] = numbers[i] * 10;
			System.out.println("I: " + i + " previous NUMBER times 10: " + numbers[i]);
		}
		
		
		
		
		
	}

}
