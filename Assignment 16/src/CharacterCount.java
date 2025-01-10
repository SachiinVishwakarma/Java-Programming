import java.util.Scanner;
public class CharacterCount {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = myObj.nextLine();

        System.out.println("Enter the character to count: ");
        char ch = myObj.next().charAt(0);

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("The character is appears " + count + " times.");
    }
}
