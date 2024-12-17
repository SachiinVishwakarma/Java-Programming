import java.util.Scanner;
public class palindrome_num {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int reverse=0,rem;
        System.out.println("Enter number");
        int number = myObj.nextInt();
        int temp=number;
        while (number!=0){
            rem=number % 10;
            reverse= reverse * 10 + rem;
            number=number/10;
        }
        if(temp== reverse){
            System.out.println("Given number is palindrome number ");
        }
        else{
            System.out.println("Given number is not palindrome number");
        }
    }
}
