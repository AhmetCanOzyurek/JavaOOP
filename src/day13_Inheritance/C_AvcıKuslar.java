package day13_Inheritance;

public class C_AvcıKuslar extends B_Kuslar{
    String hareket= "ucarlar";
    String beslenme= "et yerler";
    String pence= "pencelidir";
    String gaga= "sivri gagali";

    public static void main(String[] args) {
       /*
       EGer bir ozellik variable olarak olusturulmussa
       objenin ozelliklerini araken
       Aramaya data turunun oldugu class'dan baslarim
       ve buldugumuz ilk variable'in degerini kullaniriz



       Burada Java'nın realize ettigi fikir
       bir obje'nin data turu ne ise
       o data turune sahip tm objelerle
       ayni ozellikleri tasiyor OLMALİ

        */

        C_AvcıKuslar kartal1 = new C_AvcıKuslar();
        System.out.println(kartal1.omur);//A yasar ve olurler
        System.out.println(kartal1.solunum); // B akcigerle nefes alir
        System.out.println(kartal1.cogalma); // B yumurtayla cogalirlar
        System.out.println(kartal1.kanat);// B kanatlidirlar
        System.out.println(kartal1.beslenme); // C et yerler
        System.out.println(kartal1.gaga); // C sivri gagalidirlar
        System.out.println(kartal1.pence); // C pencelidir

        B_Kuslar kartal2 = new C_AvcıKuslar();
        System.out.println(kartal2.omur);//A yasar ve olurler
        System.out.println(kartal2.solunum); // B akcigerle nefes alir
        System.out.println(kartal2.cogalma); // B yumurtayla cogalirlar
        System.out.println(kartal2.kanat);// B kanatlidirlar
        System.out.println(kartal2.beslenme); // B et yerler
        System.out.println(kartal2.gaga); // B sivri gagalidirlar
        //System.out.println(kartal2.pence); // CTE



        A_Hayvanlar kartal3 = new C_AvcıKuslar();
        System.out.println(kartal3.omur);//A yasar ve olurler
        System.out.println(kartal3.solunum); // A akcigerle nefes alir
        System.out.println(kartal3.cogalma); // A yumurtayla cogalirlar
        //System.out.println(kartal3.kanat);// CTE
        System.out.println(kartal3.beslenme); // A et yerler
        //System.out.println(kartal3.gaga); // CTE
        //System.out.println(kartal3.pence); // CTE

    }
}
