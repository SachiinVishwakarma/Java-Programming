import java.util.Scanner;
public class create_sentence {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String frist,Last,second;
        System.out.print("Enter  First word :");
        frist = myObj.nextLine();
        System.out.print("Enter  second word:");
        second=myObj.nextLine();
        System.out.print("Enter your Last Name :");
        Last=myObj.nextLine();
        System.out.print("Your Sentence is : " + frist +" "+ second + " "+ Last);
    }
}