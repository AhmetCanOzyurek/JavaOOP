package day14_abstractClasses_interfaces;

public class C011_ChildOfI4 implements I04_InterfaceBodysiOlanMethod{



    public void method1() {

    }

    public void method2() {

    }

    public void method3() {
    }

    public static void method4(){
        //parent class'daki method4 abstract olmadigindan implement edilemez
    // parent class'daki method4 static oldugu icin override edilemez
    System.out.println("child class static method4");
}

    public static void main(String[] args) {
        method4();//Interface static method4

        method4();//Interface default method3

    }

}


