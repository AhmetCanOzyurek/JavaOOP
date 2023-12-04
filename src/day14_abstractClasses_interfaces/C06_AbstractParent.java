package day14_abstractClasses_interfaces;

public abstract class C06_AbstractParent extends C05_AbstractGrandParent{
public abstract void method2();

public abstract void method3();


    public void method4() {
        System.out.println("GP'deki abstract method'u concrete'lestirdim");
    }

//    public final abstract void method5();
// Illegal combination of modifiers: 'abstract' and  'final'
    // final  ==> override edilemez demek ,
    // abstract ==> mutlaka override edilecek demek


    //private abstract void method6();
    // Illegal combination of modifiers: 'abstract' and 'private'

    // abstract ==> mutlaka override edilmeli
    //private method'lar class disindan kullanilamyacagı icin overreide edilemez
}
