import java.util.Scanner;

public class MethodOverloading {

    public static void main(String args[]) {
        // double amount=1000;
        // int discount=5;

        Scanner applyDiscount = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter Purchase Amount");
        double amount = applyDiscount.nextDouble(); // Read user input
        System.out.println("Enter Discount");
        int discount = applyDiscount.nextInt();

        discountPurchase(amount, discount);
    }

    public static double discountPurchase(double amount, int discount) {
        if (amount >= 5000) {
            //discount=amount*discount/100
            System.out.println("Discount applicable");
            return discount;
        } else {
            System.out.println("Discount NOT applicable");
        }
        
        return discount;
    }

}