import java.util.Scanner;
public class skip_negative_number {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.print("Enter the number: ");
            int number= myObj.nextInt();
            if(number==0){
                break;
            }
            if(number<0){
                continue;
            }
            sum+=number;
        }
        System.out.println(sum);
    }
}
