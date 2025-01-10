import java.util.Scanner;
public class FindCharcaterInString {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter input : ");
        String input= myObj.nextLine();
        System.out.println("Enter Character to search : ");
        String check =myObj.nextLine();
        int result = input.indexOf(check);
        System.out.print("Index of "+check+ " is : "+result);
    }
}
