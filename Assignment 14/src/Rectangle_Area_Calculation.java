//class creation
class Rectangle{
    //variable
    private  double  length;
    private double width;


    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to display the rectangle details
    public void displayDetails() {
        System.out.println("Length: " + length + " units");
        System.out.println("Width: " + width + " units");
        System.out.println("Area: " + calculateArea() + " square units");
        System.out.println("Perimeter: " + calculatePerimeter() + " units");
        System.out.println();
    }


}

public class Rectangle_Area_Calculation {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10.0, 5.0);
        Rectangle rectangle2 = new Rectangle(7.0, 3.0);
        Rectangle rectangle3 = new Rectangle(15.0, 8.0);


        System.out.println("Rectangle 1:");
        rectangle1.displayDetails();

        System.out.println("Rectangle 2:");
        rectangle2.displayDetails();

        System.out.println("Rectangle 3:");
        rectangle3.displayDetails();
    }
}
