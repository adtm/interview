package Bit_Manipulation;

public class DecimalToBinary {
    public static void main(String[] args) {
        double d = 0.72;

        String dec = Double.toString(d);
        int octa = Integer.parseInt(dec.substring( dec.indexOf(".") + 1));
        StringBuilder binary = new StringBuilder();
        while ( octa > 0 ) {
            if (octa % 2 == 0) binary.append(0);
            else if (octa % 2 != 0) binary.append(1);
            octa /= 2;
        }
        System.out.println(binary.reverse());
    }
}
