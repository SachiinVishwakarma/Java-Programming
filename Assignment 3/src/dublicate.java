import java.util.HashSet;
import java.util.Scanner;
public class dublicate {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        Scanner myObj= new Scanner(System.in);
        int input;
        while (true) {
            System.out.print("Enter a number: ");
            input = myObj.nextInt();
            if (numbers.contains(input)) {
                System.out.println("Duplicate number detected. Exiting...");
                break;
            } else {
                numbers.add(input);
                System.out.println("Number added.");
            }
        }
    }
}
