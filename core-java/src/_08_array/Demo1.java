package _08_array;

public class Demo1 {
    public static void main(String[] args) {
        int v1 = 1;
        int v2 = 2;
        int v3 = 3;
        //......
        int[] array1 = {1, 2, 3};
        System.out.println(array1);//not 1,2,3 => hashCode [I@27716f4
        System.out.println("array 1 elements");
        System.out.println(array1[0]); //1
        System.out.println(array1[1]); //2
        System.out.println(array1[2]); //3




        int[] array2 = new int[3];
        System.out.println(array2);//hashCode
        System.out.println("array 2 elements");
        System.out.println(array2[0]); //0
        System.out.println(array2[1]); //0
        System.out.println(array2[2]); //0
    }
}
