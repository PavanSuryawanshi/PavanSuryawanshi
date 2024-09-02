public class NestedTryBlock {
    public static void main(String[] args) {
        try{
            try{
                int[] numbers = {1,2,3,4,5,6,7,8,9,10};
                System.out.println(numbers[numbers.length-1]);

            }catch(ArrayIndexOutOfBoundsException aie){
                System.out.println("Inner catch : ArrayIndexOutOfBoundsException");
                aie.printStackTrace();
            }
            System.out.println(10/5);
        }catch (ArithmeticException ae){
            System.out.println("don't try pass 0 denomenator");
        }
    }
}
