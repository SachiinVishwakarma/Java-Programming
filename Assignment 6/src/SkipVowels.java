import java.util.Scanner;
public class SkipVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String input = scanner.nextLine();
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (vowels.indexOf(currentChar) != -1) {
                continue;
            }
            System.out.print(currentChar);
        }
    }
}
