package _08_array;

public class Demo5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //5,4,3,2,1
        for (int index = arr.length - 1; index >= 0; index--) {
            System.out.print(arr[index]+", ");
        }

    }
}
