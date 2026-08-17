package _08_array;

public class Demo8MaxElement {
    public static void main(String[] args) {
        int[] array = {60, 80, 82, 52, 62, 61, 75, 81};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            }
            if (array[i] > secondMax && array[i] < max) {
                secondMax = array[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("secondMax: " + secondMax);


    }
}
