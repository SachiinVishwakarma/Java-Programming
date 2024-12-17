import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter number");
        int num = myObj.nextInt();
        for( int i=1 ;i<=10;i++){
            System.out.println(num + " x " + i + " = "+  num*i);
        }
    }
}
