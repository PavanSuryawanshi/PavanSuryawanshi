
class ThrowKeyword {
    public static void CheckString(String str) {
        if(str == null){
            System.out.println("String is empty");
        }
        System.out.println(str);
    }
}

public class ThrowExample3 {
    public static void main(String[] args) {
        try{
            ThrowKeyword.CheckString(null);
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
