import java.util.Scanner;
public class StringConcatenationLength {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter your First Word : ");
        String Word1=myObj.nextLine();
        System.out.println("Enter your Second Word : ");
        String Word2=myObj.nextLine();

        String concatenate = Word1+Word2;

        System.out.println("Concatenate word is : "+ concatenate);
        System.out.println("Length of Concatenate Word is : "+ concatenate.length());
    }
}
