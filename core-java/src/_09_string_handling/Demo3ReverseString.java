package _09_string_handling;

public class Demo3ReverseString {
    public static void main(String[] args) {
        //array is fixed in size once it is created. increase or decrease the size of an array
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        //reverse this
        int left = 0, right = array.length - 1;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        for (char ch : array) {
            System.out.print(ch + " ");
        }
    }
}
