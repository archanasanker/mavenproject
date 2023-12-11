public class MultiplicationTableFn {
    public static void main(String[] args) {
        
        int n = 5; // Define the number up to which you want to generate the table
        
        // Create a 2D array to store the multiplication table
        int[][] table = new int[n][n];
        
        // Populate the multiplication table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                table[i][j] = i*j;
            }
        }
        
        // To Display the multiplication table

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%2d x %2d = %2d   ",i,j,table[i][j]);
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}