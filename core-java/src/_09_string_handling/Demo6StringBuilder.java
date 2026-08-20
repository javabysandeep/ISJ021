package _09_string_handling;

public class Demo6StringBuilder {
    public static void main(String[] args) {
        //StringBuilder s1 = "abc";//CTE
        StringBuilder s1 = new StringBuilder("Hello");
        s1.append(" World");
        System.out.println(s1);//Hello World

        s1.insert(0,"user ");
        System.out.println(s1);

        s1.delete(0,3);
        System.out.println(s1);

        StringBuilder s2 = new StringBuilder("Hello World");
        s2.reverse();
        System.out.println(s2);

        StringBuffer s3 =  new StringBuffer("Hello World");
        s3.reverse();
        System.out.println(s3);
    }
}
