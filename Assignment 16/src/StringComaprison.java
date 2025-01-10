import java.util.Scanner;
public class StringComaprison {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter First word to Compare : ");
        String word1= myObj.nextLine();
        System.out.print("Enter Second  word to Compare : ");
        String word2=myObj.nextLine();
        if (word1.equals(word2)) {
            System.out.println(word1+" is equal to "+ word2);
        }
        else{
            System.out.println("Not equal");
        }

    }
}
