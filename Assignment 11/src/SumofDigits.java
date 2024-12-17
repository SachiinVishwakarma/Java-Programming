import java.util.Scanner;
public class SumofDigits {
    public  static int sum(int n){
        if (n==0){
            return 0;
        }
        else{
            return n%10+sum(n/10);
        }
    };
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.print("Enter  number : ");
        int num=myObj.nextInt();
        int result= sum(num);
        System.out.println("The sum of number ( "+num +" ) is = "+result);
    }
}
