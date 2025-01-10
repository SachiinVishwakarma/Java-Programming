import java.util.Scanner;

public class CharacterExtraction {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter input : ");
        String word= myObj.nextLine();
        String result ="";
        for(int i=0;i<word.length();i=i+2){
            result = result + word.charAt(i);
        }
        System.out.print("Extracted word is : "+result);
    }
}
