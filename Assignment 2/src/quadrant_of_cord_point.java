import java.util.Scanner;
public class quadrant_of_cord_point {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Coordinate of x axis");
        int x = myObj.nextInt();
        System.out.println("Enter Coordinate of y axis");
        int y = myObj.nextInt();
        if(x>0&&y>0){
            System.out.println("The coordinate point ("+ x + ","+ y +") lies in the First quadrant.");
        }
        else if(x<0&&y>0){
            System.out.println("The coordinate point ("+ x + ","+ y +") lies in the Second quadrant.");
        }
        else if (x<0&&y<0){
            System.out.println("The coordinate point ("+ x + ","+ y +") lies in the Third quadrant.");
        }
        else if(x>0&&y<0){
            System.out.println("The coordinate point ("+ x + ","+ y +") lies in the Forth quadrant.");
        }
        else if((x>0||x<0 )&& y == 0){
            System.out.println("The coordinate point ("+ x + ","+ y +") lies on the x-axis.");
        }
        else if(x==0 && (y>0||y<0)){
            System.out.println("The coordinate point ("+ x + ","+ y +") lies on the y-axis.");
        }
        else{
            System.out.println("The coordinate point ("+ x + ","+ y +") lies on the origin");
        }
    }
}