package DAY12_Inheritance;

public class J_Child extends I_Parent{
    String strChild  ="Child";
    String str = "ChildSTR";
    J_Child(){
        // super() :  gorunur bir constructor call olmadigindan Javanin default olarak koydugu super(); calisir
        System.out.println("Child parametresiz constructor");
    }
    J_Child(int sayi){
        super("Java");
        System.out.println("Child int parametreli constructor");
    }
    J_Child(String str){
        super(7);
        System.out.println(str);
        System.out.println("Child String parametreli constructor");
    str = "Son";
    }
    J_Child(boolean bl){
        //super(true);
    //eger parent class2da olmayan bir
        // bir cons cagirirsa
        // CTE olusur

    }
    public static void main(String[] args) {
        J_Child child3 = new J_Child("Ali");
        System.out.println(child3.strChild);//Child
        System.out.println(child3.strParent);// Parent
        System.out.println(child3.strGParent);//Grand Parent
        System.out.println(child3.str);


     J_Child child2 = new J_Child(5);
        System.out.println(child2.strChild);//Child
        System.out.println(child2.strParent);// Parent
        System.out.println(child2.strGParent);//Grand Parent

        J_Child child1 = new J_Child();
       System.out.println(child1.strChild);//Child
        System.out.println(child1.strParent);// Parent
        System.out.println(child1.strGParent);//Grand Parent
        System.out.println(child1.str);//ChildSTR
    }
}
/*
Child class'da bir obje olusturuldugunda
parent class'lardaki tum ozelliklere  de sahip olur
ANCAK
java'ni bir obje'ye ilk deger atmaasi (initilization)
CONSTRUCTOR calismalidir
Java bunun icin ozel bir mekanizma olusturmalidir

extends kullanan bir class'daki her cons'un ilk  satirinda
mutlaka bir cons call olur
eger gorunur bir cons call yoksa
JAVA default olarak
super() koyar.
 */