package day11_stringBuilder_encapsulation_inheritance;

public class C10_ChildClass extends C09_ParentClass {
    int sayi = 25;

    String adres = "Hollanda";
    /*
    insanlar aleminden farkli olarak
     Java'da child class'lar Parent belirler

    bir Class istedigi herhangi bir class'a
    extends keyword ile CHİLD olabilir


    Bir class baska bir Class'i parent edinirse
    parent class'daki tum ozelliklere
    (variable, method.....) otomatik olarak sahip olur

    parent class'daki ozelliklerden
    1- istedigini direk kullanir,
    2- istedigini kendisine uyarlar,
    3- isterse de parent class'da olmayan yeni ozellikler edinebilir
     */
    public static void main(String[] args) {
        C10_ChildClass obj = new C10_ChildClass();
        obj.methodChild();

    }
    public void methodChild(){
        System.out.println(sayi);//25 kendi evimde varsa babmınkine gitmeme gerek yok
        System.out.println(renk);//mavi
        renk = "kirmizi";
        System.out.println(renk);// kirmizi
        System.out.println(no);
    }
}
