package _08_array;

import java.util.Arrays;

public class Demo17RotateArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int k = 2;
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        left = k;
        right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(array));

    }

}
