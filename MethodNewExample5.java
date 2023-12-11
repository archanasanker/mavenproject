public class MethodNewExample5{

   public static void main(String args[])
   { 
	//int a=5;
	//int b=10;
	//int a;
	int b;
	System.out.printf("Result %s",area(10,10));
	System.out.printf("Circles area :  ",area(5));
	}
	public static float area(int a,int b)//method's signature
	{
	System.out.println("Rectangle's area");
	return a*b;
	}
	public static double area(int r){
	System.out.println("Circle's area");
	return 3.14*r*r;
	}
}	



