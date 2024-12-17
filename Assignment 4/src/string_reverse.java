import java.util.Scanner;
public class string_reverse {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String word = myObj.nextLine();
        int number = word.length();
        System.out.println("Reversed string:");
        for (int i = number - 1; i >= 0; i--) {
            char result = word.charAt(i);
            System.out.print(result);
        }
    }
}

