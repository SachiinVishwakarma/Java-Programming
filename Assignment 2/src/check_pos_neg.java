import java.util.Scanner;
public class check_pos_neg {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int number;
        System.out.println("Enter number to check");
        number = myObj.nextInt();
        if(number>0){
            System.out.println(number+" is a positive number");
        }
        else if(number< 0){
            System.out.println(number+" is a negative number");
        }
        else{
            System.out.println(number+" is zero");
        }
    }
}
