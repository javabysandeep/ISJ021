package _04_classObject.nestedClasses;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("********* mysql dev credentials ***********");
        System.out.println("username = " + Constants.Mysql.Dev.USERNAME);
        System.out.println("password = " + Constants.Mysql.Dev.PASSWORD);

        System.out.println("********* mysql prod credentials ***********");
        System.out.println("username = " + Constants.Mysql.Prod.USERNAME);
        System.out.println("password = " + Constants.Mysql.Prod.PASSWORD);

        System.out.println("********* oracle dev credentials ***********");
        System.out.println("username = " + Constants.Oracle.Dev.USERNAME);
        System.out.println("password = " + Constants.Oracle.Dev.PASSWORD);

        System.out.println("********* oracle prod credentials ***********");
        System.out.println("username = " + Constants.Oracle.Prod.USERNAME);
        System.out.println("password = " + Constants.Oracle.Prod.PASSWORD);
    }
}
