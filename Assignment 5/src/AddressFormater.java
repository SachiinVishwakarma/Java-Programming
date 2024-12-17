import java.util.Scanner;
public class AddressFormater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter street: ");
        String street = scanner.nextLine();
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.print("Enter zip code: ");
        String zipCode = scanner.nextLine();

        String formattedAddress = "Address:\n" + street + "\n" + city + ", " + zipCode;

        System.out.println("\nFormatted Address:");
        System.out.println(formattedAddress);
    }
}
