package arrays;

public class App {

	public static void main(String[] args) {
		int num = 0;
		//creates a blank array 10 long
		int[] nums = new int[10];
		
		//this prints the number at that place in the array
		System.out.println("9: " + nums[9]);
		
		//this sets object at 3 as 17		
		nums[3] = 17;
		
		//can't really print out full array directly so do it as a loop
		for(int i = 0; i < nums.length; i++) {
			System.out.println("I: " + i + " NUM: " + nums[i]);
		}
		
		String[] words = { "Adele", "Luke", "Sasha", "Archie" };
		for(int i = 0; i < words.length; i++) {
			System.out.println("I: " + i + " WORD: " + words[i]);
			}
	}
}
