public class FinalModifierWithVariable {
    public static void main(String[] args) {
        final int constant = 10 ;
        System.out.println("Constant output with final keyword : "+constant);

        // cannot assign a value to final variable constant
//        constant=20;

    }
}
