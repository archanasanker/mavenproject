class AssignmentOperatorPgm
	 {
  		public static void main(String[] args) {
    
  		 // declaring variables

  		 double a = 10.23;
   		 double b;

		 float c=100.8f;
		 float d=10.2f;
		 

   		 // assigning value using =
    		b = a;
			System.out.println("Value of a is "+a);
                 	System.out.println("Value of b is "+b);
			System.out.println("Value of c is "+c);
                  	System.out.println("Value of d is "+d);


  		 // assign value using =+

   		 b += a; // a+=b means a=a+b here 10+10
   		 System.out.println("Value of b when b+=a: " + b);

   		 // assign value using =*
   		 b *= a;
   		 System.out.println("Value of b when b*=a: " + b);

		// assign value using /=
   		 c /= d;
   		 System.out.println("value of c when c/=d: " + c);
  }
}
