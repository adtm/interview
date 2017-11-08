package Bit_Manipulation;

public class Insertion {
    public static void main(String[] args) {
        int N = 1024;
        int M = 19;
        int i = 2;
        int j = 6;

        int allOnes = ~0;
        int left = allOnes << (j + 1);
        int right = (1 << i) - 1;
        int mask = left | right;

        int clear = N & mask;
        int number = M << i;

        System.out.println(clear | number);

    }



}
