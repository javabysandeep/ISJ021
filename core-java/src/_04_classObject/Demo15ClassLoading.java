package _04_classObject;

public class Demo15ClassLoading {
    public static void main(String[] args) throws ClassNotFoundException {
        // execute student class static block
        //01. create the object
        //Student s1 = new Student();

        //02. by using Class.forName(class-name);
        Class.forName("_04_classObject.Student");
    }
}
