import java.util.Scanner;
public class find_longest_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine().toUpperCase();
        String[] words = sentence.split("\\s+");
        String longestWord = "";
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }
        System.out.println("The longest word is: " + longestWord);
    }
}