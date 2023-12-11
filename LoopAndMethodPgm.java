public class LoopAndMethodPgm{

	//int n1=30; // instance or non-static variable / Global variable
	//int result;

	
	public void subtract(int n2){ // non-static methods
	result=n1 - n2;
	System.out.println("Result of Sub (n1-n2) - "+result);
	}
	
	
	public void callOtherMethods(){ 
	System.out.println("Calling all non-static methods in other non-static method");
	
	add();  
	subtract(1);
         multiplication(10,9);
         division(45,5); /*We can call directly a non-static method in another non-static method*/
	}
	

	public static void main(String args[]){  // static method

/* 	1.	Odd number from 300 to 500(for, while, do while)
	2.	Even number from 500 to 600(for, while, do while)
	3.	Sum of first 20 natural numbers (for, while, do while)
	4.	Write a program to print multiplication of 5 from 20 to 150 (for, while, do while)
*/
	LoopAndMethodPgm lm=new LoopAndMethodPgm();
	
	lm.subtract(15);
	lm.callOtherMethods();
	}
}	

