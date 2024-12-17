import java.util.Scanner;
public class cast_largerDatatype_to_Lower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a large integer value (long): ");
        long largeValue = scanner.nextLong();
        byte byteValue = (byte) largeValue;
        System.out.println("The byte value is: " + byteValue);
    }
}
