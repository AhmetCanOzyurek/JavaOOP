package DAY12_Inheritance;

public class I_Parent extends H_GrandParent{
    String strParent = "Parent";
    String str = "ParentSTR";
   I_Parent(){
        System.out.println("Parent parametresiz constructor");
    }
    I_Parent(int sayi){
       super("Hava");
        System.out.println(strParent);
        this.strParent="En yeni Parent";
        System.out.println("parent int parametreli constructor");
    }
    I_Parent(String str){
        strParent = "Yeni Parent";
        System.out.println("Parent String parametreli constructor");

   }

   I_Parent(char chr){
       //super();
       //cons parametreli olsa da
       // java'nin default olarak koydugu
       // constructor call parametresizdir.
   }

}
