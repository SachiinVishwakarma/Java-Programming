import java.util.Scanner;
public class check_integer_equal {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int number1,number2;
        System.out.println("Enter number1 to check");
        number1 = myObj.nextInt();
        System.out.println("Enter number2 to check");
        number2 = myObj.nextInt();
        if(number1==number2){
            System.out.println("Number1 and Number2 are equal");
        }
        else{
            System.out.println("Number1 and Number2 are are equal");
        }
    }
}
