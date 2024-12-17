import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class check_frequency {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a word to check:");
        String input = myObj.nextLine();
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        int num= input.length();
        for (int i = 0; i < num; i++) {
            char ch = input.charAt(i);
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                frequencyMap.put(ch, 1);
            }
        }
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
