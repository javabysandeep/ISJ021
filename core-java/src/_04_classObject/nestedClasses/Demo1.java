package _04_classObject.nestedClasses;

import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        //object creation of StaticNestedClass
        Outer.StaticNested staticNested = new Outer.StaticNested();

        //object creation of InnerClass
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}

class Outer {
    static int variable = 100;

    static class StaticNested {
    }

    int variable2 = 200;

    class Inner {
    }

}