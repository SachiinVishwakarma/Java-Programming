import java.util.Scanner;
public class Add_two_num {
    public  static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter number 1");
        num1 = myObj.nextInt();
        System.out.println("Enter number 2");
        num2 = myObj.nextInt();

        int total=num1+num2;
        System.out.println("Total NUmber: " + total);
    }
}


