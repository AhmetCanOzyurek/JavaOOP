package day14_abstractClasses_interfaces;

public abstract class C03_KuralcıParent {

    /*
    Java'da kuralcı parent kullanimi(ABSTRACT) MECBUR DEGİLdir.

    EGER bir class kendisini PARENT edinecek child class'Larin
    parent class'daki BELİRLENEN method'lari
    MUTLAKA bulundurmasi ve OVERRİDE ederek kendisine uyarlamasini istiyorsak

    abstract yapılar kullaniriz.

    Bir parent'in child class'lari zorlayabilmesi icin
            - oncelikle bunu class olarak deklare etmesi lazim
              bunun icin method deklarasyonuna
              abstract keyword eklenir
            - abstract class2lar KISMİ ABSTRACTİON'a sahiptir
                *   child class'lari override etmeye zorlamak ISTEMEDİGİMİZ
                    method'lari bugune kadar olusturdugumuz sekilde olustururuz
                *  child class'larin OVERRIDE etmesini
                    MECBURİ yapacagimiz method'lari ise
                    abstract olarak olustururuz.


     */

    public void method1(){

    }

    public abstract void method2();
    // abstract method'lar sadece zorunluluk olusturmakicin kullnailir
    // body'leri olmaz

    public void method3(){

    }

    public abstract void method4();












}
