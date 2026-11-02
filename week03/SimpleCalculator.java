import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read two numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Calculate the results
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        // Avoid dividing by zero
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Quotient: Cannot divide by zero");
        }

        input.close();
    }
}
