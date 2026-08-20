package _09_string_handling;

public class Demo5ReverseString {
    public static void main(String[] args) {

        //01. not a good solution
        String str = "i love java";
        //System.out.println(str.charAt(0));//i
        //str.reverse();//CTE as reverse method not there
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i); // number of objects created will be equal to string length
        }
        System.out.println(result);


        //02. little better
        char[] charArray = new char[str.length()];
        for (int i = str.length() - 1, j=0; i >= 0; i--, j++) {
            charArray[j] = str.charAt(i);
        }
        String result2 = new  String(charArray);
        System.out.println(result2);
    }
}
