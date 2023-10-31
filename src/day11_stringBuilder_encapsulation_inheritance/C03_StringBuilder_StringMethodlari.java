package day11_stringBuilder_encapsulation_inheritance;

public class C03_StringBuilder_StringMethodlari {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java Candir");
//StringBuilder'da kullanilan
        //bize int, String veya char donduren method'lar kalici degisiklik yapmaz

        System.out.println(sb.substring(5));// Candir
        System.out.println(sb);

        //sb = sb.substring(5);

        sb.indexOf("Java");//0

        System.out.println(sb); // Java Candir

        // sb'de  Java geciyor mu ?
        //bazen StringBuilder bir variable'da string methodlari kullanmak isteyebiliriz
        // bu durumda once toString() ile sb'i String'e cevirebiliriz

        System.out.println(sb.toString().contains("Java")); //true

    }
}
