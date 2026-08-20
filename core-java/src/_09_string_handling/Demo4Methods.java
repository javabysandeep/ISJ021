package _09_string_handling;

public class Demo4Methods {
    public static void main(String[] args) {
        String s1 = "abc";
        s1.concat("def"); //---> abcdef
        System.out.println(s1); //abc

        s1 = s1.concat("def");
        System.out.println(s1);//abcdef

        s1 = s1.toUpperCase();
        System.out.println(s1);

        s1 = s1.toLowerCase();
        System.out.println(s1);

        String s2 = "good morning";
        s2.replace("morning", "afternoon");
        System.out.println(s2);//good morning

        s2 = s2.replace("morning", "afternoon");
        System.out.println(s2);//good afternoon

        String s3 = "                   hello          ";
        s3.trim(); //hello
        System.out.println(s3);
        s3 = s3.trim(); //hello
        System.out.println(s3); //hello

        System.out.println("length of the String : " + s3.length());

        System.out.println(s3.startsWith("h")); //true
        System.out.println(s3.endsWith("o"));//true

        String listOfStudents = "diksha,aditya,saloni,pushkar,mayuresh,ayan,shravani,snehal";
        String[] names = listOfStudents.split(",");
        for (String name : names) {
            System.out.println(name);
        }

        char[] charArray = listOfStudents.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }

        //convert a char array into string
        String s5 = new String(charArray);
        System.out.println("\n"+s5);
    }
}
