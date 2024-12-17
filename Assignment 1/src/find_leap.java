import java.util.Scanner;
public class find_leap {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int year;
        System.out.println("Enter number to check");
        year = myObj.nextInt();
        if(year % 400 == 0||(year % 4 == 0 )){
            if ((year >= 400 || year % 100 != 0)){
                System.out.println("Given year is a leap year");
            }
            else {
                System.out.println("Given year is not a leap year");
            }
        }
         else {
            System.out.println("Given year is not a leap year");
        }
    }
}

