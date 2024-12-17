import java.util.Scanner;
public class string_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine().toLowerCase();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine().toLowerCase();
        boolean areEqual = firstString.equals(secondString);

        if (areEqual) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }
    }
}
