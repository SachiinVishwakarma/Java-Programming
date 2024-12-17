import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number= myObj.nextInt();
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(number +" is Prime number");
        }
        else{
            System.out.println(number +" is not Prime number");
        }
    }
}
