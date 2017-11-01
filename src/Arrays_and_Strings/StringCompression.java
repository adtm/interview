package Arrays_and_Strings;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(stringCompression("aabcccccaa"));
    }

    public static String stringCompression(String word) {

        int next = 0, last = 1, count = 1;
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(next) == word.charAt(last)) {
                count++;
            } else {
                result.append(word.charAt(next)).append(count);
                count = 1;
            }
            next = last;
            last++;
        }
        result.append(word.charAt(next)).append(count);
        return word.length() <= result.length() ? word : String.valueOf(result);
    }

}
