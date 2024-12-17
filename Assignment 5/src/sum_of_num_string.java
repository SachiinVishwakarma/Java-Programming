import java.util.Scanner;
public class sum_of_num_string {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter First number :");
        String first = myObj.nextLine();

        System.out.print("Enter Second number :");
        String second =myObj.nextLine();

        int num1=Integer.parseInt(first);
        int num2=Integer.parseInt(second);
        int total=num1+num2;

        System.out.print("Sum of numbers is : "+ total);
    }
}
