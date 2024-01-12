package first_exercise;

public class App {

	
	public static void main(String[] args) {
		
		
//		variable for each primitive
		
		char ch = 'a';
		char ch2 = '2';
		String greeting = "Hi, my name is ";
		String name = "Adele";
		boolean bool = true;
		byte byt = 10;
		short shorty = 300;
		int in = 1_000_000_000;
		long longgg = 999_000_000_000_000L;
		float floaty = 10.45F;
		double dub = 123.45;
		
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(greeting);
		System.out.println(name);
		System.out.println(bool);
		System.out.println(byt);
		System.out.println(shorty);
		System.out.println(in);
		System.out.println(longgg);
		System.out.println(floaty);
		System.out.println(dub);
		
		System.out.println(greeting + name);
		System.out.println(ch + ch2);
		
		
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
}
