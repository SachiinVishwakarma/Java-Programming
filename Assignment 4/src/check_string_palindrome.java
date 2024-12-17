import java.util.Scanner;
public class check_string_palindrome {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String word = myObj.nextLine().toLowerCase();
        String sentence = "";
        int number = word.length();
        System.out.println("Reversed string:");
        for (int i = number - 1; i >= 0; i--) {
            char result = word.charAt(i);
            sentence= sentence + result;
        }
        if(word.equals(sentence)){
            System.out.println("This is palindrome string");
        }
        else{
            System.out.println("This is not palindrome string");
        }
    }
}