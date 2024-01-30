package lab1;

public class UnaryOperators {

	public static void main(String[] args)
	{
	
	// pre-increment
	int a = 6;
	int x = ++a;
	System.out.println("Pre-Increment of a:"+ x);
	
	// post-increment
	int b = 8;
	System.out.println(b++);
	System.out.println(b);
	
	// pre-decrement
		int c = 6;
		int y = --c;
		System.out.println("Pre-decrement of c:"+ y);
		
		// post-decrement
		int d = 8;
		System.out.println(d--);
		System.out.println(d);
	}
}
