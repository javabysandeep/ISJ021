package _05_oops.inheritance;

public class Demo3Case3 {
    public static void main(String[] args) {
        //03. Parent parent = new Child();
        //  Child is a type of Parent
        // only present in parent = Parent
        // only present in child = CTE
        //  present in both parent and child = variables = parent, methods = child

        class Parent {
            int a = 1;
            int b = 2;

            void m1() {
                System.out.println("Parent::m1");
            }

            void m3() {
                System.out.println("Parent::m3");
            }
        }
        class Child extends Parent {
            int b = 20;

            void m2() {
                System.out.println("Child::m2");
            }

            void m3() {
                System.out.println("Child::m3");
            }
        }
        Parent parent = new Child();

        System.out.println(parent.a);
        parent.m1();
        //parent.m2();//CTE : as method is only present in Child class

        System.out.println("variable = "+parent.b); //2- b from parent
        parent.m3();//m3 from child
    }
}
