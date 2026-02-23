import java.util.Scanner;

class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    // Constructor
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        setPrice(price);
    }

    // Getters
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPrice() { return price; }

    // Setters
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative. Setting to 0.");
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("--------------------");
    }
}

public class CarAttributesManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Car objects
        System.out.println("Enter details for the first car:");
        System.out.print("Make: ");
        String make1 = scanner.nextLine();
        System.out.print("Model: ");
        String model1 = scanner.nextLine();
        System.out.print("Year: ");
        int year1 = scanner.nextInt();
        System.out.print("Price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        Car car1 = new Car(make1, model1, year1, price1);

        // Modify attributes
        System.out.println("\nUpdating the first car's year and price...");
        System.out.print("New Year: ");
        int newYear = scanner.nextInt();
        System.out.print("New Price: ");
        double newPrice = scanner.nextDouble();
        car1.setYear(newYear);
        car1.setPrice(newPrice);

        // Display details of car1
        System.out.println("\nDetails of the first car:");
        car1.displayDetails();

        // Test negative price handling
        System.out.println("Testing negative price:");
        car1.setPrice(-5000);

//        // Create another car without modifications
//        System.out.println("\nEnter details for the second car:");
//        scanner.nextLine(); // Consume newline
//        System.out.print("Make: ");
//        String make2 = scanner.nextLine();
//        System.out.print("Model: ");
//        String model2 = scanner.nextLine();
//        System.out.print("Year: ");
//        int year2 = scanner.nextInt();
//        System.out.print("Price: ");
//        double price2 = scanner.nextDouble();
//
//        Car car2 = new Car(make2, model2, year2, price2);
//
//        // Display details of car2 without modifications
//        System.out.println("\nDetails of the second car:");
//        car2.displayDetails();

    }
}
