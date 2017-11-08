package Bit_Manipulation;

public class FlipBitToWin {
    public static void main(String[] args) {
        String binary = "111011110111010101111111111";

        int prev = 0, cur = 0, max = 0;
        for (int i = 0; i < binary.length(); i++) {
            String value = Character.toString(binary.charAt(i));
            if (Integer.parseInt(value) == 1) {
                cur++;
            } else if (Integer.parseInt(value) == 0) {
                if (prev + cur > max) {
                    max = prev + cur + 1;
                }
                prev = cur;
                cur = 0;
            }
        }
        if (prev + cur > max) {
            max = prev + cur + 1;
        }
        System.out.println(max);
    }
}
