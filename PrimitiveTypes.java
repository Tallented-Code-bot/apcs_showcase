import java.util.Scanner;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // user input
        // different data types
        // casting
        // expressions, assignments (=), and compound assignments (+=)
        // System.out.println

        // Takes two floats, truncates them, and multiples them.

        Scanner input = new Scanner(System.in);

        System.out.println("This program takes two floating point numbers, truncates them, and prints the product.");

        System.out.println("Enter the first number:");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = input.nextDouble();

        int trunc1 = (int) num1;
        int trunc2 = (int) num2;

        int total = trunc1 * trunc2;

        System.out.println("The product is " + total);


        input.close();

    }
}