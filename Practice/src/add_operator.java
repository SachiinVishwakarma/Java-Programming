import java.util.Scanner;
public class add_operator {
    public static void main(String[] args) {
        Scanner myObj=new Scanner((System.in));
        System.out.print("Enter any number : ");
        int number=myObj.nextInt();
        number+=5;
        System.out.print("Sum = "+ number);
    }
}
