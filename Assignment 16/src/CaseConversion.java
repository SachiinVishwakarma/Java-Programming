import java.util.Scanner;

public class CaseConversion {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = myObj.nextLine();
        String output = "";

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                output += Character.toUpperCase(c);
            } else {
                output += Character.toLowerCase(c);
            }
        }

        System.out.println(output);
    }
}
