package Arrays_and_Strings;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {
    public static void main(String[] args) {
        String word = "aabcdef"; // return false
        Boolean answer = isUnique(word);
        System.out.println(answer);
    }
    
    private static boolean isUnique(String word) {
        Map<Character, Integer> letterCount = new HashMap<>();
        for (char letter: word.toCharArray()) {
            if (letterCount.get(letter) == null) {
                letterCount.put(letter, 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
