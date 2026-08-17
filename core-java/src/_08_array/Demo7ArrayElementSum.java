package _08_array;

public class Demo7ArrayElementSum {
    public static void main(String[] args) {
        int[] array = {1, 20, 3, 4, 5};
        //int sum = array[0] + array[1] + array[2] + array[3] + array[4];
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }
        System.out.println("array element sum = " + sum);


    }
}
