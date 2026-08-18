package _08_array;

public class Demo12MatrixAddition {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        //enhanced for loop
        /*for (int temp : array) {
            System.out.println(temp);
        }*/

        int[][] matrix1 = {
                {10, 20, 30, 40},
                {10, 20, 30, 40},
                {10, 20, 30, 40}
        };
        int[][] matrix2 = {
                {10, 20, 30, 40},
                {10, 20, 30, 40},
                {10, 20, 30, 40}
        };
        /*
            (0,0), (0,1), (0,2), (0,3)
            (1,0), (1,1), (1,2), (1,3)
            (2,0), (2,1), (2,2), (2,3)

        * */
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                System.out.print(matrix1[row][col] + matrix2[row][col] + " ");
            }
            System.out.println();
        }
    }
}
