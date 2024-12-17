public class find_divisible_number {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("The first number divisible by both 3 and 7 is: " + i);
                break;
            }
        }
    }
}
