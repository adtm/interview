package Arrays_and_Strings;

public class URLify {

    public static void main(String[] args) {
        String word = "Mr John Smith";
        char[] letters = new char[word.length() + 2 * 2];
        for (int i = 0; i < word.length(); i++)
            letters[i] = word.charAt(i);

        changeSpaces(letters, word.length());

    }

    public static void changeSpaces(char[] word, int length) {
        int countSpaces = 0, index;
        for (Character ch: word)
            if (ch.equals(' ')) countSpaces++;
        index = length + countSpaces * 2;
        for (int i = length - 1; i >= 0; i--) {
            if (word[i] == ' ') {

                word[index - 1] = '0';
                word[index - 2] = '2';
                word[index - 3] = '%';
                index = index - 3;

            } else {
               word[index - 1] = word[i];
               index--;
            }
        }
        System.out.println(word);
    }
}
