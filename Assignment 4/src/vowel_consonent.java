import java.util.Scanner;
public class vowel_consonent {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a word to check:");
        String word = myObj.nextLine();
        int vowel=0;
        int consonant=0;
        int number= word.length();
        for (int i = 0; i < number; i++) {
            char sent = word.charAt(i);
            if (Character.isLetter(sent)) {
                if (sent== 'a' || sent == 'e' || sent == 'i' || sent== 'o' || sent== 'u') {
                    vowel=vowel+1;
                } else {
                    consonant=consonant+1;
                }
            }
        }
        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + consonant);
    }
}