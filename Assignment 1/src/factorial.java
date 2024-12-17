import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int i,fact=1;
        int number;
        System.out.println("Enter number to find factorial");
        number = myObj.nextInt();
        for(i=1;i<=number;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}