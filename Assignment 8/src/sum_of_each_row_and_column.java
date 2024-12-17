import java.util.Scanner;

public class sum_of_each_row_and_column {
    public static void main(String[] args) {
        Scanner myObj=new Scanner((System.in));
        System.out.print("Enter the size of matrix : ");
        int size=myObj.nextInt();

        int [][] matrix= new int [size] [size];

        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++ ){
                System.out.print("Element ["+(i+1)+"]"+"["+(j+1)+"] : ");
                matrix[i][j]=myObj.nextInt();
            }
        }

        System.out.println("Original Matrix :");
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++ ){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for(int j=0;j<size;j++){
            int rowsum=0;
            for (int i=0;i<size;i++ ){
                rowsum+=matrix[i][j];
            }
            System.out.println("Sum of Row "+(j+1)+" : "+ rowsum);
        }
        for(int i=0;i<size;i++){
            int columnsum=0;
            for (int j=0;j<size;j++ ){
                columnsum+=matrix[i][j];
            }
            System.out.println("Sum of Column "+(i+1)+ "  : "+ columnsum);
        }
    }
}
