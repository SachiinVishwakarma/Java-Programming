public class ArrayIndexOutofBoundsException {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        try{
            int value = num[4];
            System.out.println("Value at index 4 is = "+value);
        }catch(ArrayIndexOutOfBoundsException x){
            System.out.println("Error : Not exist !");
        }
    }
}
