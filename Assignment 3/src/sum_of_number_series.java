import java.util.Scanner;
public class sum_of_number_series {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number, choice, sum = 0;
        while (true) {
            System.out.println("Enter number for Sum:");
            number = myObj.nextInt();
            System.out.println("Enter your choice\n1 for sum . \n0 to exit.");
            choice = myObj.nextInt();
            switch (choice) {
                case 1:
                    if (number > 0) {
                        sum += number;
                        System.out.println("Sum of numbers from 1 to " + number + " is: " + sum);
                    } else {
                        System.out.println("Please enter a positive number.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 0.");
            }
        }
    }
}