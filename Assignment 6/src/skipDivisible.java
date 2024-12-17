public class skipDivisible {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.print(i+",");
        }
    }
}
