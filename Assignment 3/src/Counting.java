import  java.util.Scanner;
public class Counting {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number=10,i=0;
        while (i <= number) {
            System.out.print(i+",");
            i++;
        }
        int m=number;
        System.out.println();
        while (m >=0) {
            System.out.print(m+ ",");
            m--;
        }
    }
}
