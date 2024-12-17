import java.util.Scanner;
public class transpose_matrix {
    public static void main(String[] args) {
        Scanner myObj=new Scanner((System.in));
        System.out.print("Enter the size of matrix : ");
        int size=myObj.nextInt();

        int [][] matrix= new int [size] [size];
        int [][] transpose=new int[size][size];

        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++ ){
                System.out.print("Element ["+(i+1)+"]"+"["+(j+1)+"] : ");
                matrix[i][j]=myObj.nextInt();
            }
        }
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++ ){
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println("Original Matrix :");
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++ ){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix :");
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++ ){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
