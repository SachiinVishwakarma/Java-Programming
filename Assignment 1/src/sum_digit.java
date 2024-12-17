import java.util.Scanner;
public class sum_digit {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int sum=0,rem;
        System.out.println("Enter digits");
        int num = myObj.nextInt();
        while (num!= 0){
            rem = num % 10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of all digits is : " + sum);
    }
}
