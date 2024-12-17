import java.util.Scanner;
public class matrix_addition {
    public static void main(String[] args) {
        Scanner myObj=new Scanner((System.in));
        System.out.print("Enter the size of matrix : ");
        int size=myObj.nextInt();

        int [][] matrix1= new int [size] [size];
        int [][] matrix2= new int [size][size];
        int [][] result=new int[size][size];

        System.out.println("Matrix 1");
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++ ){
                System.out.print("Element ["+(i+1)+"]"+"["+(j+1)+"] : ");
                matrix1[i][j]=myObj.nextInt();

            }
        }
        System.out.println("Matrix 2");
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++ ){
                System.out.print("Element ["+(i+1)+"]"+"["+(j+1)+"] : ");
                matrix2[i][j]=myObj.nextInt();

            }
        }
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++ ){
                System.out.print("");
                result[i][j]= matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("result");
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++ ){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
