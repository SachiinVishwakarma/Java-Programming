public class HearrtPattern {
    public static void main(String[] args) {
        int n = 6; // Number of rows for the heart pattern

        // Top part of the heart
        for (int i = n / 2; i <= n; i += 2) {
            // Print left spaces
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }
            // Print left side of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print space between the two sides
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print right side of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom part of the heart
        for (int i = n; i >= 1; i--) {
            // Print left spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print bottom part of the heart
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
