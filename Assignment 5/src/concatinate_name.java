import java.util.Scanner;
public class concatinate_name {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String fristName,LastName;
        System.out.print("Enter your First Name :");
        fristName = myObj.nextLine();
        System.out.print("Enter your Last Name :");
        LastName=myObj.nextLine();
        System.out.print("Your Full Name is : " + fristName +" "+ LastName);
    }
}
