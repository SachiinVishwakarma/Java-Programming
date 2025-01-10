import java.util.Scanner;

public class TrimmingWhitespace {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter input to trim whitesapces : ");
        String input= myObj.nextLine();
        String result = input.trim();
        System.out.println("After trim whitespace : "+ result);
    }
}
