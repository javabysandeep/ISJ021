package _09_string_handling;

public class Demo7Palindrome {
    public static void main(String[] args) {
        String str = "abcbad";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(str.equals(sb.toString())
                ? "palindrome" : "not palindrome");
    }
}
