import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Ask for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate the sum
        double sum = num1 + num2;

        // Display the sum
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
