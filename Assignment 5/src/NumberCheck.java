import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isGreaterThan100 = number > 100;
        if(isGreaterThan100 == true){
            System.out.println("Number is  greater than 100");
        }
        else{
            System.out.println("Number is not greater than 100");
        }
    }
}
