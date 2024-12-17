import java.util.Scanner;
public class Largest_in_array {
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int size=myobj.nextInt();
        System.out.print("enter Element of array :");
        int [] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=myobj.nextInt();
        }
        int largest=array[0];
        for(int i=0;i<size;i++){
            if(array[i]>largest){
                largest=array[i];
            }
        }
        System.out.print("Largest in Array is = "+ largest);
    }
}
