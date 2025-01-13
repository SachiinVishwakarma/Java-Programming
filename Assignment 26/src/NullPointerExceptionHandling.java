public class NullPointerExceptionHandling {
    public static void main(String[] args) {
        String first = null;
        try{
            System.out.println("String Length : "+ first.length());
        }catch (NullPointerException e){
            System.out.println("Error : To access a null object .");
        }
    }
}
