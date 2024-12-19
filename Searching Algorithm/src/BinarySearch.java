import java.util.Scanner;
public class BinarySearch {
    public static void binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Element not found in the array.");
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = myObj.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " sorted elements (or unsorted, we'll sort them): ");
        for (int i = 0; i < size; i++) {
            array[i] = myObj.nextInt();
        }
        System.out.print("Enter the element to search for: ");
        int value = myObj.nextInt();
        binarySearch(array, value);
    }
}
