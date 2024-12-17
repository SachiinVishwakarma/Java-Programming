import java.util.Scanner;
public class fibonacci_using_recursion {
    public  static int fibonacii(int n){
        if (n==0){
            return 0;
        }
        else if (n==1) {
            return  1;
        }
        else{
            return fibonacii(n - 1) + fibonacii(n - 2);
        }
    };
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.print("Enter  number : ");
        int num=myObj.nextInt();
        int result=fibonacii(num);
        System.out.println("Fibonacii series "+num +" is = "+result);
    }
}
