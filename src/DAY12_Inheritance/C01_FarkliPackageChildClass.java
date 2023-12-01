package DAY12_Inheritance;

import day11_stringBuilder_encapsulation_inheritance.C05_AccessModifier;

public class C01_FarkliPackageChildClass extends C05_AccessModifier {
    // bir class extends keyword kullanarak baska class'i Parent edinebilir.
    public static void main(String[] args) {
        //System.out.println(C05_AccessModifier.strDefault);// Default String
        //System.out.println(C05_AccessModifier.strPrivate);
        System.out.println(C05_AccessModifier.strProtected);
        System.out.println(C05_AccessModifier.strPubliic);

        C05_AccessModifier.strPubliic = "Ayni package'tan deger atayabilirim";

        //C05_AccessModifier.methodDefault();//Default Method
        //C05_AccessModifier.methodPrivate();//'methodPrivate()' has private access in 'day11_stringBuilder_encapsulation_inheritance.C05_AccessModifier'
        C05_AccessModifier.methodProtected();
        C05_AccessModifier.methodPublic();

    }
}
