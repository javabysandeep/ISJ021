package _05_oops.anonysmousClass;

public class Demo2 {
    public static void main(String[] args) {
       //01. anonymous class will always be a subclass of concrete, abstract, interface

        class ConcreteSuperClass{}
        abstract class AbstractSuperClass{}
        interface InterfaceSuperClass{}

        class A extends ConcreteSuperClass{}
        class B extends AbstractSuperClass{}
        class C implements InterfaceSuperClass{}

        ConcreteSuperClass refA = new A();
        AbstractSuperClass refB = new B();
        InterfaceSuperClass refC = new C();
    }
}
