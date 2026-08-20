package _09_string_handling;

public class Demo2ToUppercase {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        for (int index = 0; index < array.length; index++) {
            char ch = array[index];
            if (ch >= 'a' && ch <= 'z') {
                array[index] = (char) (ch - 32);
            }
        }
        for (char ch : array) {
            System.out.print(ch + " ");
        }
    }
}
