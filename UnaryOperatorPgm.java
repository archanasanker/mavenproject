// Java Program to implement Uniary Operators


class UnaryOperatorPgm {
	
// main function

	public static void main(String[] args)
	{
		// Integer declared

		int a = 27;
		float b = 77.77f;
		// Printing values of a and b
		
		System.out.println("Value of a : " +a);
		System.out.println("Value of b : " +b);


		// Using unary operators

		System.out.println("Post-increment ie a++ : " + (a++));
		System.out.println("Pre-increment ie. ++a: " + (++a));

		System.out.println("Post-decrement b-- : " + (b--));
		System.out.println("Pre-decrement ie --b : " + (--b));
	}
}
