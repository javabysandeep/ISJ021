package _08_array;

public class Demo11Matrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };//3,3

        int[][] matrix2 = new int[3][3];

        int[][] matrix3 = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };

        for (int row = 0; row < matrix2.length; row++) {
            for (int col = 0; col < matrix2[row].length; col++) {
                System.out.print(matrix2[row][col] + " ");
            }
            System.out.println();
        }

    }
}
