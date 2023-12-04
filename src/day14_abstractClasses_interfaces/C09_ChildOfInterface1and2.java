package day14_abstractClasses_interfaces;

public class C09_ChildOfInterface1and2 extends C01_KlasikParent implements I02_Interface1, I03_Interface2{

    public void method1() {

    }


    public int method2() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(SAYI);//20
        System.out.println(S);//30

        //System.out.println(ISIM);
        // IsıM variable'i iki farkli interface'de oldugundan, JAVA hangisini kullanacagini bilmiyor
        //bu durumda hangisini kullanmasini istedigimizi belirtmemiz lazim
        System.out.println(I02_Interface1.ISIM);//ALI
        System.out.println(I03_Interface2.ISIM);//VELI
    }
}
