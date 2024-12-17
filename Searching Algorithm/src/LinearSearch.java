import java.util.Scanner;
public class LinearSearch {
    public static void linearSearch(int [] array, int value){
        for(int i=0;i<array.length;i++){
            if(array[i]==value){
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found in this array.");
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int size=myObj.nextInt();
        int[] array = new int[size];
        System.out.println("Enter "+ size + " elements : ");
        for(int i=0;i<size;i++){
            array[i]=myObj.nextInt();
        }
        System.out.println("Enter element to search from array : ");
        int value= myObj.nextInt();
        linearSearch(array,value);
    }
}
