package day11_stringBuilder_encapsulation_inheritance;

public class C05_AccessModifier {
    // br class uyesi olusturuldugunda Access Modifier olmak ZORUNDADIR
    String str; // Eger gorunur bir access modifier yoksa
                //Java default access modifier tanimlar
      private static String strPrivate = "Private String";
      private static void methodPrivate(){
          System.out.println("Private Method");
      }

     static String strDefault = "Default String"; //package private it's other name
     static void methodDefault(){
        System.out.println("Default Method");
    }

    protected static String strProtected = "Protected String";
    protected static void methodProtected(){
        System.out.println("Protected Method");
    }

    public static String strPubliic = "Public String";
    public static void methodPublic(){
        System.out.println("Public Method");
    }

    public static void main(String[] args) {
        System.out.println(strPrivate);
        strPrivate = "Main method'dan deger atadim";
        System.out.println(strDefault);
        System.out.println(strProtected);
        System.out.println(strProtected);

        methodDefault();
        methodPrivate();
        methodProtected();
        methodPublic();
    }
}
