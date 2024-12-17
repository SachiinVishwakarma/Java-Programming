import java.util.Scanner;
public class count_from {
    public static void main(String[] args) {
        Scanner myObj=new Scanner((System.in));
        System.out.print("Enter any number : ");
        int number=myObj.nextInt();
        for (int i=1;i<=number;i++ ){
            if(i>=1&&i<=7){
                continue;
            }
            System.out.println(i);
        }
    }
}
