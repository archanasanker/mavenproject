package java_programs;

public class MethodOverloadingArea11 {

	public static void main(String[] args) { 
		
		System.out.printf("Area - %s",area(10,10));
		System.out.println("");
		System.out.println("Area :  " +area(5));
		}
		public static float area(int a,int b)//method's signature
		{
		System.out.println("Rectangle's area");
		System.out.println("-----------------");
		return a*b;
		}
		public static double area(int r){
		System.out.println("Circle's area");
		System.out.println("-----------------");
		return 3.14*r*r;
		}

}
