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
    public static void printArray(int[] arr){
        for (int num :arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] array={2,5,7,9,4};
        System.out.println("Array ");
        printArray(array);
        int value = 4;
        binarySearch(array, value);
    }
}
