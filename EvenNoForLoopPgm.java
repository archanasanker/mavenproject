public class EvenNoForLoopPgm {
	public static void main(String args[]) {
        		System.out.println("Even Numbers From 1 to 500");
		System.out.println("**************************");
        		for (int i = 300; i <= 500; i++) {
           	 	if (i % 2 == 0) {
               		 System.out.print(i + " ");
            		}
        		}
		
		System.out.println("");
		System.out.println("Odd Numbers From 300 to 500");
		System.out.println("**************************");
        		

		int number=500;  
		System.out.print("List of odd numbers from 1 to "+number+": ");  
		for (int i=301; i<=number; i++) {		  
		//logic to check if the number is odd or not  
		//if i%2 is not equal to zero, the number is odd  
			if (i%2!=0){  
			System.out.print(i + " ");  
			}  
		}  
         }
}

                                      
	

