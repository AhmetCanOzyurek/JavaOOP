package DAY12_Inheritance;

public class L_ChildClass extends K_ClassUyeleriniKullanma {
    String str = "Hava";
    int sayi = 20;
boolean bl = true;
    public static void main(String[] args) {
        L_ChildClass obj =  new L_ChildClass();
        obj.method2();
    }

    public void method2() {
        String  str = "Civa";
        int a = 20;
        System.out.println(a);
        //System.out.println(this.a);//CTE
        //System.out.println(super.a);//CTE

        System.out.println(bl);//true
        System.out.println(this.bl);//true
        //System.out.println(super.bl);//CTE

        System.out.println(str);//Civa
        System.out.println(this.str);//Hava
        System.out.println(super.str);//Java


        System.out.println(sayi);//20
        System.out.println(this.sayi);//20
        System.out.println(super.str);//30


        System.out.println(chr);//k
        System.out.println(this.chr);//k
        System.out.println(super.chr);//k



    }


}
