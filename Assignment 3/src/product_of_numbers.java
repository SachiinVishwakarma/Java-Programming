import java.util.Scanner;
public class product_of_numbers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number, i = 1,mult=1;
        System.out.println("Enter number");
        number = myObj.nextInt();
        while (i<=number) {
            mult=mult*i;
            i++;
        }
        System.out.println( "Product of " +number + " is = " +mult);
    }
}