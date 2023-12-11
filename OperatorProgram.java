class OperatorProgram{

public static void main(String args[])

{

 //Arithmetic operators

	int num1=50;
	int num2=20;
	int num3=10;
	int a= 100;
	int var;
	var = a;// assign value using =

 //Arithmetic operators

	System.out.println("num1 + num2=" +(num1+num2));
	System.out.println("num1 - num2=" +(num1-num2));
	System.out.println("num1 * num2=" + (num1*num2));
	System.out.println("num1 / num3=" +(num1/num3));
	System.out.println("num1 % num3=" +(num1%num3));

  //Assignment operators

	System.out.println("Value of var is " + var);
	// assign value using =+

    	var += a;
    	System.out.println("Value of var using +=: is " + var);

    	// assign value using =*
    	var *= a;
    	System.out.println("var using *=: " + var);

}



}


