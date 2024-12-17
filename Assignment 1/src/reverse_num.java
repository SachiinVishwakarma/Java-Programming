import java.util.Scanner;
public class reverse_num {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int rev=0,rem;
        int number;
        System.out.println("Enter number to reverse");
        number = myObj.nextInt();
        while (number!=0){
            rem=number % 10;
            rev = rev * 10 + rem;
            number=number/10;
        }
        System.out.println("Reverse of given number is: " + rev);
    }
}