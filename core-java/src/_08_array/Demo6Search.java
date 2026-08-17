package _08_array;

public class Demo6Search {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int key = 4;

        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "found" : "not found");
    }
}
