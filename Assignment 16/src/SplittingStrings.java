import java.util.*;

public class SplittingStrings {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter input for split : ");
        String input= myObj.nextLine();
        String[] result = input.split(",");

        for (int i = 0; i < result.length; i++) {
            result[i] = "\"" + result[i] + "\"";
        }

        System.out.println(Arrays.toString(result));
    }
}
