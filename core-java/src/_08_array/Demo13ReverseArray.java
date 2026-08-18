package _08_array;

public class Demo13ReverseArray {
    public static void main(String[] args) {
        int[] array = {10, 12, 9, 11, 7};

        //student do wrong
       /* for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }*/

        // solution 01 : using another array
        /*int[] reverseArray = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--, j++) {
            reverseArray[j] = array[i];
        }*/

        //solution 02 :
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println("\nReversed array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
