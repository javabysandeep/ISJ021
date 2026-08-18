package _08_array;

public class Demo15MoveZeros {
    public static void main(String[] args) {
        //Move all 0's to the beginning of an array
        int[] array = {1, 2, 3, 4, 0, 6, 0, 7, 8, 0};
        int writeZerosEnd = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[writeZerosEnd] = array[i];
                writeZerosEnd--;
            }
        }
        while (writeZerosEnd >= 0) {
            array[writeZerosEnd] = 0;
            writeZerosEnd--;
        }
        for (int temp : array) {
            System.out.print(temp + " ");
        }
    }
}
