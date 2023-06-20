import java.util.Arrays;

public class Main {
    public static String reverseArray(String[] word) {
        String[] reverceWord = new String[word.length];
        int reverceLetter = 0;
        for (int letters = word.length - 1; letters >= 0; letters--) {
            reverceWord[reverceLetter] = word[letters];
            reverceLetter++;
        }
        return Arrays.toString(reverceWord);
    }

    public static void main(String[] args) {
        String[] word = {"т", "о", "п", "о", "р"};
        System.out.println(reverseArray(word));
    }
}