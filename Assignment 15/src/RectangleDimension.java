 class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
    public double calculateParameter(){
        return 2*(length+width);
    }

    public void displayResult() {
        System.out.println("Rectangle Dimensions:");
        System.out.println("Length: " + length + " Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Parameter : "+ calculateParameter());
    }
}
public class RectangleDimension {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println("Default Parameters:");
        rect.displayResult();

        Rectangle rectParams = new Rectangle(5.0, 3.0);
        System.out.println("Parameterized Parameters:");
        rectParams.displayResult();
    }
}
