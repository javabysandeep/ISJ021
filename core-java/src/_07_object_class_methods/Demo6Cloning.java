package _07_object_class_methods;

public class Demo6Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        class Student implements Cloneable {
            int id;
            String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public Student() {
            }

            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }
        Student s1 = new Student(1, "Ayan");

        // this is not cloning. we are not creating new object here. ---
        // this is reference copy. s1 and s2 both refers to the same object
        Student s2 = s1;
        Student s3 = (Student) s1.clone();

        System.out.println(s1.hashCode()); //149928006
        System.out.println(s3.hashCode());//713338599


    }
}
