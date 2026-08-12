package _07_object_class_methods;

public class Demo7DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        class Address implements Cloneable {
            String street;
            String city;
            String state;
            String country;
            String zip;

            public Address(String street, String city, String state, String country, String zip) {
                this.street = street;
                this.city = city;
                this.state = state;
                this.country = country;
                this.zip = zip;
            }

            public Address() {
            }

            @Override
            public String toString() {
                return "Address{" + "street='" + street + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", country='" + country + '\'' + ", zip='" + zip + '\'' + '}';
            }

            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }
        class Student implements Cloneable {
            int id;
            String name;
            Address address;

            public Student(int id, String name, Address address) {
                this.id = id;
                this.name = name;
                this.address = address;
            }

            public Student() {
            }

            @Override
            public Object clone() throws CloneNotSupportedException {
                Student studentClonedObject = (Student) super.clone();

                Address addressClonedObject = (Address) studentClonedObject.address.clone();

                studentClonedObject.address = addressClonedObject;

                return studentClonedObject;
            }

            @Override
            public String toString() {
                return "Student{" + "id=" + id + ", name='" + name + '\'' + ", address=" + address + '}';
            }
        }

        Address address = new Address("JM road", "Pune", "MH", "Ind", "411004");
        Student student = new Student(1, "Aditya", address);

        Student clonedObject = (Student) student.clone();
        System.out.println(clonedObject);

        System.out.println("hashcode of old address = " + student.address.hashCode());
        System.out.println("hashcode of new address = " + clonedObject.address.hashCode());
    }
}
