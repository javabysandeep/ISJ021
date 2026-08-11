package _07_object_class_methods;

public class Demo4ToStringMethod {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            @Override
            public String toString() {
                super.toString();
                return "Student{" +
                        "id=" + this.id +
                        ", name='" + this.name + '\'' +
                        '}';
            }
        }
        Student student = new Student(1, "abc");
        System.out.println(student.toString());
        System.out.println(student);

        System.out.println(
                student.getClass().getName() + "@" +
                        Integer.toHexString(student.hashCode())
        );
        /*
        Student{id=1, name='abc'}
        Student{id=1, name='abc'}
        _07_object_class_methods.Demo4ToStringMethod$1Student@a09ee92

        * */

    }
}
