import java.util.Scanner;

public class SubstringAndIndexing {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter word : ");
        String word= myObj.nextLine();
        System.out.print("Enter index : ");
        int index= myObj.nextInt();

        if (index<word.length()){
            String result = word.substring(index);
            System.out.println("Your SubString is : "+result);
        }else {
            System.out.println("Invalid Index>>>>>>>>>>>>>>>>>>");
        }
    }
}
