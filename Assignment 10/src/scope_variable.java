import java.util.Scanner;
public class scope_variable {
    public static int sum( int num1,int num2){
        return num1+num2;
    }
    public static int multiply( int num1,int num2){
        return num1*num2;
    }
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Enter number 1 :") ;
        int num1 = myObj.nextInt();
        System.out.print("Enter number 2 :") ;
        int num2 = myObj.nextInt();
        int sum = sum(num1,num2);
        System.out.println("Sum = "+ sum) ;
        int product = multiply(num1,num2);
        System.out.println("Multiply = "+ product) ;
    }
}
