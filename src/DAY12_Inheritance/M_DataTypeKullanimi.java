package DAY12_Inheritance;

import java.util.List;
import java.util.ArrayList;


public class M_DataTypeKullanimi {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        ArrayList<String> isimler2 = new ArrayList<>();

        int sayi  =10;
        //int data turudur

        String str = "Java Candir";
        //String hem class'dir
        //          hem de o class'dan olusturulan data turudur.
        //Butun non-primitive data turleri bir class/şnterface'dir
        //butun class/interface'ler de primitive data turudur.


        F_Corolla corolla1 = new F_Corolla();
        E_Toyota corolla2 = new F_Corolla();
        D_araba corolla3 = new F_Corolla();

        // Java'da child class consturcor'i kullanilarak olusturulan bir objenin
        //data turu kendi class'i veya parent class'lari secilebilir

    }
}
