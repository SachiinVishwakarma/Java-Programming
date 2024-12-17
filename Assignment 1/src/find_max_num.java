import java.util.Scanner;
public class find_max_num {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter number 1");
        num1 = myObj.nextInt();
        System.out.println("Enter number 2");
        num2 = myObj.nextInt();
        System.out.println("Enter number 3");
        num3 = myObj.nextInt();
        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println(num1 + " is the maximum of " + num2 + " and " + num3);
            } else {
                System.out.println(num3 + " is the maximum of " + num1 + " and " + num2);
            }
        } else {
            if (num2 >= num3) {
                System.out.println(num2 + " is the maximum of " + num1 + " and " + num3);
            } else {
                System.out.println(num3 + " is the maximum of " + num1 + " and " + num2);
            }
        }
    }
}

