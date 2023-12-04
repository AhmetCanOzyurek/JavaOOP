package day14_abstractClasses_interfaces;

public class C07_ChildOfAbstractParentAndGParent extends C06_AbstractParent {
/*
Abstract class'in abstract child class'lari olabilir

bir abstract child, parent'i olan abstract class'daki
abstract method'lari kendisine uyarlamak ZORUNDA DEGİLDİR
        - isterse kendisine uyarlayip concretelestirir
        - isterse hicbir islem yapmayabilir



        Abstract bir zincirden (parent - grandparent - ...) sonra gelen
        ILK CONCRETE class parent abstract class'lardaki
        concrete'lestirilmeyen TUM abstract method'lari
        kendisine implement etmek ZORUNDADIR.
 */
    public void method1() {
        System.out.println("c07 method1");
    }

    public void method2() {
        System.out.println("c07 method2");
    }

    public void method3() {
        System.out.println("c07 method3");

    }

    public static void main(String[] args) {
        C07_ChildOfAbstractParentAndGParent obj = new C07_ChildOfAbstractParentAndGParent();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();


    }













}
