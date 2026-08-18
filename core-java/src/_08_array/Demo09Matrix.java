package _08_array;

public class Demo09Matrix {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};
        int[] array4 = {10, 11, 12};

        int[][] arrayOfArrays1 = {array1, array2, array3, array4};
        int[][] arrayOfArrays2 = {array1, array2};

        int[][][] arrayOfArrayOfArrays = {arrayOfArrays1, arrayOfArrays2};
    }
}
