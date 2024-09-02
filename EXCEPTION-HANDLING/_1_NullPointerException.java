public class _1_NullPointerException extends Throwable {
    public static void main(String[] args) {
       try{
           String str = null;
           System.out.println(str.length());
           int num = Integer.parseInt(str);
       }catch (NullPointerException npe){
           System.out.println(npe.getMessage());
       }catch (NumberFormatException nfe){
           System.out.println(nfe.getMessage());
       }catch (Exception ee){
           System.out.println(ee.getMessage());
       }

    }
}
