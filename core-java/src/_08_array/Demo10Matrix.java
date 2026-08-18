package _08_array;

public class Demo10Matrix {
    public static void main(String[] args) {
        int[] array1 = {1};
        int[] array2 = {4, 5};
        int[] array3 = {7, 8, 9};
        int[] array4 = {10, 11, 12, 13};

        int[][] arrayOfArrays = {array1, array2, array3, array4};
        System.out.println("size of an array of array = " + arrayOfArrays.length);

        for (int i = 0; i < arrayOfArrays.length; i++) {

            //internal for loop is to print the content internal array
            for (int j = 0; j < arrayOfArrays[i].length; j++) {
                System.out.print(arrayOfArrays[i][j] + " ");
            }

            System.out.println();
        }

    }
}
