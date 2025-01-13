public class HandlingArthimeticException {
    public static void main(String[] args) {
        int Numerator = 10;
        int denominator = 0;
        try{
            int result = Numerator / denominator;
            System.out.println("The result is : "+ result);
        }catch (ArithmeticException x){
            System.out.println(" Error : Division not allowed by Zero ");
        }
    }
}
