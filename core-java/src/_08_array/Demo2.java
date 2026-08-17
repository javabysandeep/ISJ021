package _08_array;

public class Demo2 {
    public static void main(String[] args) {
        int[] array1 = new int[0];
        System.out.println("array1 length: " + array1.length);//0

        int[] array2 = new int[-5]; //NegativeArraySizeException
//        int[] array3 = new int[5.5];//CTE


    }
}
