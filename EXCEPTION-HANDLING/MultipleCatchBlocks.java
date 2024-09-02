public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try{
            int[] numbers = {1, 2, 3, 4, 5};
            numbers[4] = 5;
        }catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("try to insert values within a index"+aie);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
