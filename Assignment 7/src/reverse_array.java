import java.util.Scanner;
public class reverse_array {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = myobj.nextInt();

        System.out.println("Enter elements of the array:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = myobj.nextInt();
        }

        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
