import java.util.Scanner;
public class check_vote_eligibility {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter gae to check");
        int age = myObj.nextInt();
        if(age>=18){
            System.out.println("Congratulation! You are eligible for casting your vote.");
        }
        else{
            System.out.println("Sorry! You are not eligible for casting your vote.");
        }
    }
}
