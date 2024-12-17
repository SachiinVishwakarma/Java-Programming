import java.util.Scanner;
public class check_cube {
    public static void main(String[] args) {
        Scanner myObj=new Scanner((System.in));
        System.out.print("Enter any number : ");
        int number=myObj.nextInt();
        for(int i=1;i*i*i<=number;i++){
            if(i*i*i==number){
                System.out.println("it is a perfect cube");
            }
            else{
                System.out.println("it is not perfect cube");
            }
        }
    }
}
