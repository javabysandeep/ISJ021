package _08_array;

public class Demo4 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd'};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);

        System.out.println("array iteration using loop");
        for (int index = 0; index <= array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
