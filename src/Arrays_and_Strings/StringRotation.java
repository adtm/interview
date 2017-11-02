package Arrays_and_Strings;

public class StringRotation {
    public static void main(String[] args) {
        System.out.println(checkStringRotation("waterbottle", "erbottlewat"));
    }

    public static boolean checkStringRotation(String s1, String s2) {
        int index = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s1.charAt(0) == s2.charAt(i)) {
                index = i;
                break;
            }
        }
        return (s2.substring(index) + s2.substring(0, index)).equals(s1);
    }
}
