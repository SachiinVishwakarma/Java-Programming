import java.util.Scanner;
public class area_circle_rectangle {
    public static double calculateArea( double radius){
        double area= Math.PI*radius*radius;
        return area;
    }
    public static double calculateArea( double length,double width){
        double area= length*width;
        return area;
    }
    public static double calculateArea( double base,float height){
        double area= 0.5*base*height;
        return area;
    }
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Press 1: Area of Circle . ") ;
        System.out.println("Press 2: Area of Rectangle . ") ;
        System.out.println("Press 3: Area of Triangle . ") ;
        System.out.println("Press 4: Exit . ") ;
        System.out.print("Enter your Choice : ");
        int choice = myObj.nextInt();
        switch (choice) {
            case 1 :
                System.out.println("Enter radius of Circle : ");
                double radius =myObj.nextDouble();
                double area =calculateArea(radius);
                System.out.println("Area of Circle is = "+ area);
                break;
            case 2:
                System.out.print("Enter length of Rectangle : ");
                double length =myObj.nextDouble();
                System.out.print("Enter width of Rectangle : ");
                double width =myObj.nextDouble();
                double rect =calculateArea(length,width);
                System.out.println("Area of Circle is = "+ rect);
                break;
            case 3:
                System.out.println("Enter base of Triangle : ");
                double base =myObj.nextDouble();
                System.out.println("Enter heigth of Triangle : ");
                float height =myObj.nextFloat();
                double triangle =calculateArea(base,height);
                System.out.println("Area of Circle is = "+ triangle);
                break;
            case 4:
                System.out.println("Exiting......") ;
                System.exit(0);
            default:
                System.out.println("Error: Invalid choice. Please enter one of the following choice.");
                break;
        }
    }
}
