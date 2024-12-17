import java.util.Scanner;
public class concatinate_num_as_string {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your First Name :");
         int num1 = myObj.nextInt();
        System.out.print("Enter your Last Name :");
       int  num2 =myObj.nextInt();
        System.out.print(num1 + ""+num2);
    }
}
