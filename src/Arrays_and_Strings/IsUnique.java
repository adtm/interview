package Arrays_and_Strings;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {
    public static void main(String[] args) {
        String word = "abcdef"; // return false
        Boolean answer = isUniqueBooleanArray(word);
        System.out.println(answer);
    }

    /**
     * Hash Map solution
     * @param word
     * @return
     */
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

    /**
     * CTCI Book solution
     * @param word
     * @return
     */
    private static boolean isUniqueBooleanArray(String word) {
        boolean[] values = new boolean[128];
        for(int i = 0; i < word.length(); i++) {
            int val = word.charAt(i);
            if (values[val] == true) return false;
            values[val] = true;
        }
        return true;
    }

}
