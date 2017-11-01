package Arrays_and_Strings;

import java.util.HashMap;

public class PalindromePermutations {
    public static void main(String[] args) {
        checkIfCanBePalindrome("Tacto Coa");
    }

    public static boolean checkIfCanBePalindrome(String word) {

        int uniqueLetters = 0, foundPairs = 0;

        HashMap hashMap = new HashMap<String, Integer>();
        for (int i = 0; i < word.length(); i++) {
            char letter = Character.toLowerCase(word.charAt(i));
            if (letter != ' ') {
                if (hashMap.containsKey(letter)) {
                    foundPairs++;
                    hashMap.remove(letter);
                } else {
                    uniqueLetters++;
                    hashMap.put(letter, i);
                }
            }

        }
        if (uniqueLetters == foundPairs) return true;
        return false;

    }


}
