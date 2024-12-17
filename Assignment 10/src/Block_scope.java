public class Block_scope {
    public static void calculate() {
        int x = 10;
        System.out.println("Value of x outside the loop: " + x);
        for (int i = 0; i < 1; i++) {
//            int x = 20;
            System.out.println("Value of x inside the loop: " + x);
        }
        System.out.println("Value of x after the loop: " + x);
    }
    public static void main(String[] args) {
        calculate();
    }
}
