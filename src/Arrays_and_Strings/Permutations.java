package Arrays_and_Strings;

public class Permutations {

    public static void main(String[] args) {
        boolean result = checkPermutationsN("cow", "woc");
        System.out.println(result);
    }

    /**
     * Permutation solution - N
     * @param firstWord, secondWord
     * @return boolean
     */
    public static boolean checkPermutationsN(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) return false;
        for (int i = 0; i < firstWord.length(); i++) {
            if (firstWord.charAt(i) != secondWord.charAt(firstWord.length() - 1 - i)) return false;
        }
        return true;
    }

}
