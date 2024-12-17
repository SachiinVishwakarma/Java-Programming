import java.util.Scanner;
public class sum_of_cube_of_even {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number,i=2,sum=0,cube;
        System.out.println("Enter number to check");
        number = myObj.nextInt();
        while(i<=number){
            cube=i*i*i;
            sum=sum+cube;
            i=i+2;
        }
        System.out.println(sum);
    }
}