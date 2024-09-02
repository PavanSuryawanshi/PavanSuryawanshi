 class ThrowExample {
    public static void validateAge(int age) {
        if(age < 18){
            throw new IllegalArgumentException("Age must be greater than 18");
        }
        System.out.println("you are eligible to vote");
    }
}
public class ThrowExample2{
    public static void main(String[] args) {
        try{
            ThrowExample.validateAge(15);
        }catch (IllegalArgumentException ie){
            System.out.println("caught an exception : "+ie.getMessage());
        }
    }
}