package DAY12_Inheritance;

public class H_GrandParent {
    String strGParent = "Grand Parent";
    String str = "GParentSTR";
    H_GrandParent(){
        System.out.println("Grandparent parametresiz constructor");
    }
    H_GrandParent(int sayi){
        System.out.println("Grandparent int parametreli constructor");
    }
    H_GrandParent(String str){
        this();
        strGParent = "Super GParent";
        System.out.println("Grandparent String parametreli constructor");
    }



}
