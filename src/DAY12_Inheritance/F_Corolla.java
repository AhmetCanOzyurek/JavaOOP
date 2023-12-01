package DAY12_Inheritance;

public class F_Corolla extends E_Toyota{
    String model = "Corolla";
    String renk = "Belirlenen 5 renk kullanilir";
    String guvenlik = "Abs ve 8 airbag";
    String uretimYeri = "Turkiye";

    public static void main(String[] args) {


        /*
        Bir class extends keyword kullanarak baska bir class'i parent edinirse
                1- parent class'daki TUM OZELLİKLERİ sahiplenir
                2- Eger isterse parent class'da obulunan ozellikleri kendisine uyarlayabilir
                3- Veya parent class'da olmayan spesifik ozellikleri varsa
                    bunları kendi class'ina ekleyebilir
         */
        F_Corolla corolla = new F_Corolla();
        System.out.println(corolla.marka);//T Toyota
        System.out.println(corolla.model); //C Corolla
        System.out.println(corolla.renk);//T 5 renk
        System.out.println(corolla.yil);// A 190
        System.out.println(corolla.uretimYeri);//C Turkiye
        System.out.println(corolla.aku);// T inci aku
        System.out.println(corolla.motor);//T toyota motor
        System.out.println(corolla.guvenlik);//C airbag
    }
}
