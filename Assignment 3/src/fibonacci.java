import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number,i=0,second=1,first=0,next;
        System.out.println("Enter number to check");
        number = myObj.nextInt();
        System.out.print(first + " ");
        System.out.print(second + " ");
        while (i<=number){
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
            i++;
        }
    }
}