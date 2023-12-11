// Java code to illustrate
// logical AND operator



class LogicalOperatorPgm {
	public static void main(String[] args)
	{
		// initialising variables

		int a = 10, b = 20;
		float c = 20.1f;
		float d = 0;

		// Displaying a, b, c
		
		System.out.println("Var1 = " + a);
		System.out.println("Var2 = " + b);
		System.out.println("Var3 = " + c);


		// two constraints

		if  (b == c)
		{
			d = a + b + c;
			System.out.println("b=c and the sum is: " + d);
		}
		
		// using logical AND to verify

		else if((a < b) && (b != c)) 

		
		{
			d = b-a;
			System.out.println("b !=c and the sum is: " + d);
		}
		else
			System.out.println("False conditions");
	}
}
