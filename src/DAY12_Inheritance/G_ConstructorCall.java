package DAY12_Inheritance;

public class G_ConstructorCall {
    int i = 20;
    String str = "Java";
    G_ConstructorCall(){
        System.out.println("parametresiz cons");

    }
    G_ConstructorCall(String str){
        this(3);
        str = "Tava";
        System.out.println("String parametreli cons");
    }
G_ConstructorCall(int i){
        this.i = i;
    System.out.println("int parametreli cons");
}
    public static void main(String[] args) {
        G_ConstructorCall obj1 = new G_ConstructorCall("abc");
    }
}
