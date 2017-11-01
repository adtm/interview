package Arrays_and_Strings;

public class OneAway {
    public static void main(String[] args) {
        System.out.println(checkIfOneAway("pale", "bale"));
    }

    public static boolean checkIfOneAway(String word, String checkWord) {

        if (word.length() >= checkWord.length() + 2 ||
            word.length() + 2 <= checkWord.length()) {
            return false;
        }
        String longer = checkWord,
               shorter = word;
        if (word.length() > checkWord.length()) {
            longer = word;
            shorter = checkWord;
        }
        int differences = 0;
        for (int i = 0, j = 0; i < longer.length() && j < shorter.length() ; i++, j++) {
            if (longer.charAt(i) != shorter.charAt(j)) {
                differences++;
            }
            if (longer.length() != shorter.length()) {
                j++;
            }
        }
        return differences <= 1;
    }                   
}
