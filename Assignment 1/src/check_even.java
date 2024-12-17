import java.util.Scanner;
public class check_even {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int number;
        System.out.println("Enter number to check");
        number = myObj.nextInt();
        if(number % 2==0){
            System.out.println("Given number is Even number");
        }
        else{
            System.out.println("Given number is odd number");
        }
    }
}
