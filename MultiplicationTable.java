public class MultiplicationTable {
    	public static void main(String[] args) {
        int n = 12; // Define the number up to which you want to generate the table
        
        		// Nested loop to generate the multiplication table

        		 for (int i = 10; i <= n; i++) {
			System.out.println();
		 	System.out.println("Table of :"+i);
	         	System.out.println("***********");
            		
			for (int j = 1; j <= 10; j++) {
             		   System.out.printf("%2d x %2d = %2d   ", i, j, (i * j));
	        		   System.out.println();
            		}
			System.out.println(); // Move to the next line for the next number
        		}
    }
}

