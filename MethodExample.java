public class MethodExample{

	int n1=30; // instance or non-static variable / Global variable
	int result;

	public void add(){
	int a=10;
	int b=20;
	int c= a+b;
	System.out.println("c="+c);
	}
	
	public void subtract(int n2){ // non-static methods
	result=n1 - n2;
	System.out.println("Result of Sub (n1-n2) - "+result);
	}
	
	public void multiplication(int n3, int n4){
	result = n3*n4;
	System.out.println("Result Multiplication (n3*n4) - "+result);
	}
	
	public int division(int n5, int n6){
	result = n5/n6;
	System.out.println("Result Division - "+result);
	return result;
	}
	public void callOtherMethods(){ 
	System.out.println("Calling all non-static methods in other non-static method");
	
	add();  
	subtract(1);
         multiplication(10,9);
         division(45,5); /*We can call directly a non-static method in another non-static method*/
	}
	

	public static void main(String args[]){  // static method
	MethodExample me=new MethodExample();
	me.add(); // calling non static methods inside static method main
	me.subtract(15);
	me.multiplication(3, 5);
	me.division(25,5);	
	/* calling non static method in a static method - by creating     
	object instance method belongs to object */
	me.callOtherMethods();
	}
}	

