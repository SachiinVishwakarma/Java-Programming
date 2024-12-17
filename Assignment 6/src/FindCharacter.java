import java.util.Scanner;
public class FindCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                System.out.println("The character '" + searchChar + "' is found at index: " + i);
                break;
            }
        }
        System.out.println("The character '" + searchChar + "' was not found in the string.");
    }
}