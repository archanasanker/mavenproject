package obsqura.mavenProject;
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 2);
            System.out.println("Result: " + result);

            // Attempting to divide by zero to generate an exception
            result = divide(10, 0);
            System.out.println("Result: " + result); // This line won't be executed
        } catch (ArithmeticException e) {
            // Code to handle the exception
            System.err.println("Error: Division by zero is not allowed");
            // Optionally, you can print more details about the exception
            e.printStackTrace();
        } finally {
            // The 'finally' block is optional and is executed regardless of whether an exception occurred or not
            System.out.println("This block is always executed as it is given in finally");
        }

        // The program continues here after handling the exception
        System.out.println("Program continues...");
    }

    // A method that may throw an exception
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}

