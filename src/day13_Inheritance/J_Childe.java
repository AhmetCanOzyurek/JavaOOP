package day13_Inheritance;

public class J_Childe extends I_Parent{
    public void method1(){
        //overriding (gecersiz kilan) method'un yanında yukari dogru ok
        // overridden(gecersiz kilinan) method'un yaninda asagi dogru ok olur
    }
    public void method2(){
        //bir method'un overridign yapmasi icin
        //SİGNATURE'i parent class'daki method ile
        //AYNİ OLMALİDİR

        //SİGNATURE : method ismi
        //              ve parametrelerin data turu
    }

@Override
    public void method3() {
    }


    public void method4() {
       // overriding method istenirse @Override
       // notasyonu kullanilabilir

        // notasyon kullanirsam parent class'daki method
        // silinir veya override  edilemeyecek sekilde degistirilirse
        // notasyon CTE  verir ve duzeltilmesi saglar
        //notasyon kullanmazsan sikinti yok
    }


    public static void method5(){
        //sattic method'lar override edilemez
    }
    private void method6(){
        //parent class'daki  private method'u goremeyecegi ciin
        // child class'daki method bagimsiz bir method olur
    }
    /*
    public void method7(){
    Java da final keyword'u DEGİSTİRİLEMEZ demektir
      parent class'da final olarak isaretlenen bir method
      degistirilemeyecegi icin override edilemez
    }

     */


    void method8() {
        // parent class'daki method8'in acces modifier'i
        // default access modifier'dir.
        //child class'daki method'un access modifier'İ
        //parent'inki ile ayni veya daha genis olabilir

        // bu method icin default , protected veya  public secilebilir
    }


    public void method9() {
      //acces modifier parent class'daki
      // method'un access modifier'i ile ayni veya
      // daha genis olmali
    }

    public void method10(){
        //void veya primitive data turu return eden method'larin
        // override etmek icin return type'lari ayni olmalidir
    }


    int method11() {
        return 0;
    }


    public String  method12(){

        //return type non-primitive ise
        // ya ayni olmali
        // veya child'in return type'i ile
        // parent'in return type'i arasinda
        // IS-A relationship olmali
        //
        //buna co_variant denir  .
        return null;
    }


































}

