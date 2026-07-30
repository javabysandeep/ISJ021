package _05_oops;

public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student();

        //student.age = -100;//private data
        //student.name="skgkdngjbrfnkjbfnrjg"; //private data

        student.setAge(23);
        student.setName("Smart");
        System.out.println("student age : " + student.getAge());
        System.out.println("student name :" + student.getName());

        Product product = new Product(1, "Laptop");
        System.out.println("product id = " + product.id());
        System.out.println("product title = " + product.title());
        //product.id = 101;//CTE : id is private

    }
}

// we can use lombok library to generate getters/setters/constructors/toString/hashCode/equals
// new concept in java 17 - record
class Student {
    private int age;
    private String name;

    //public setters
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    //public getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
//we use to create an immutable object where we have getters only
record Product(int id, String title) {
}