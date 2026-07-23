package _04_classObject;

public class Student {
    static String collegeName = "IT Shaala"; // static :: common to all students
    String name; // instance :: unique per student

    void calculateFees(int hours) {
        //hours, fees :: local variable
        int fees = hours * 100;
        System.out.println(this.name + " | " + Student.collegeName + " Fees :" + fees);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.name = "Samrat";
        s2.name = "Aditya";
        s3.name = "Rahhul";

        s1.calculateFees(10);
        s2.calculateFees(20);
        s3.calculateFees(30);
    }
}
