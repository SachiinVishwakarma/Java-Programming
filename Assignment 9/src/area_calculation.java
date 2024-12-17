import java.util.Scanner;
public class area_calculation {
    public static Double calculateArea( double radius){
        double area= Math.PI*radius*radius;
        return area;
    }
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter radius of Circle : ");
        double radius =myObj.nextDouble();
        double area =calculateArea(radius);
        System.out.println("Area of Circle is = "+ area);
    }
}
