public class NestedTryBlockExample2 {
    public static void main(String[] args) {
        try{
            String[] data = {"one", "two", "three", "four", "five"};
            for(String s : data){
                try{
                    System.out.println(s.length());
                    System.out.println(s);
                }catch(NullPointerException ne){
                    System.out.println("NullPointerException");
                }
            }
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
