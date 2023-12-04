package day14_abstractClasses_interfaces;

public class C10_ChildOFI4 implements I04_InterfaceBodysiOlanMethod{
    @Override
    public void method1() {
        System.out.println("Child method1");
    }

    @Override
    public void method2() {
        System.out.println("Child method2");
    }

    public static void main(String[] args) {
        /*
        ınterface'de istisnai olarak olusturulabilen
        static olarak isaretli method'lar InterfaceAdi.staticMEthodAdi() seklinde calistirilabilirken
        default olarak isaretli method'lar obje olusturularak kullanilabilir.
         */
        I04_InterfaceBodysiOlanMethod.method4();//Interface static method4
C10_ChildOFI4 obj = new C10_ChildOFI4();
obj.method3();
    }
}
