import java.util.Scanner;
public class cat_person_on_height {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number to check");
        int height = myObj.nextInt();
        if(height<150){
            System.out.println("The person is Dwarf.");
        }
        else if(height>150 && height<165){
            System.out.println("The person is Average.");
        }
        else{
            System.out.println("The person is Tall.");
        }
    }
}