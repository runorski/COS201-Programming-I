import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read three numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        // Calculate the total and the average
        double total = num1 + num2 + num3;
        double average = total / 3;

        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        input.close();
    }
}
