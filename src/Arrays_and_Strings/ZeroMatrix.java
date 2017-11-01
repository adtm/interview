package Arrays_and_Strings;

public class ZeroMatrix {
    public static void main(String[] args) {
        nulifyMatrix();
    }

    public static int[][] nulifyMatrix() {

        int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};

        boolean hasZeroColumn = false;
        boolean hasZeroRow = false;


        // find if first row has zeros
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                hasZeroRow = true;
                break;
            }
        }

        // find if first column has zeros
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                hasZeroColumn = true;
                break;
            }
        }

        // nulify all zeros before
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // nulify based on first column values
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                nulifyRows(matrix, i);
            }
        }

        // nulify values based on first row values
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                nulifyColumns(matrix, i);
            }
        }



        if (hasZeroColumn) {
            nulifyColumns(matrix, 0);
        }

        if (hasZeroRow) {
            nulifyColumns(matrix, 0);
        }

        return matrix;
    }

    private static void nulifyColumns(int[][] matrix, int col) {
        for (int j = 0; j < matrix.length; j++) {
            matrix[j][col] = 0;
        }
    }

    private static void nulifyRows(int[][] matrix, int i) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[i][j] = 0;
        }
    }


}
