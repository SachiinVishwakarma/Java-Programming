import java.util.Scanner;

public class ReplaceCharacters {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter input  : ");
        String input= myObj.nextLine();
        System.out.print("Enter Character who want to replace : ");
        String wantToReplace =myObj.nextLine();
        System.out.print("Enter new Character : ");
        String replace=myObj.nextLine();
        String result = input.replace(wantToReplace,replace);
        System.out.println("Input After replace is : "+ result);
    }
}
