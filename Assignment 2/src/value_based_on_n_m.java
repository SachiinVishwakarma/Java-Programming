import java.util.Scanner;
public class value_based_on_n_m {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number to check:");

        int m = myObj.nextInt();
        int n;
        if (m > 0) {
            n = 1;
        } else if (m == 0) {
            n = 0;
        } else {
            n = -1;
        }
        System.out.println("The value of n = " + n);
    }
}
