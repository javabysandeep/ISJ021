package _05_oops.anonysmousClass;

public class Demo3 {
    public static void main(String[] args) {
       //01. anonymous class will always be a subclass of concrete, abstract, interface

        class ConcreteSuperClass{}
        abstract class AbstractSuperClass{}
        interface InterfaceSuperClass{}

        //left side = parent class reference
        //right side =
        // class definition of anonymous class which subclass of LHS Parent
        // + anonymous class object creation
        ConcreteSuperClass refA = new  ConcreteSuperClass(){};
        AbstractSuperClass refB = new AbstractSuperClass(){};
        InterfaceSuperClass refC = new InterfaceSuperClass(){};
    }
}
