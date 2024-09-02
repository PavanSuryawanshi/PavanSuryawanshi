abstract class Vehicle{
    abstract void start();
}

class car extends Vehicle{
    @Override
    void start(){
        System.out.println("car is starting....");
    }
    void drive(){
        System.out.println("car is driving....");
    }
}


public class inheritanceExample {
    public static void main(String[] args) {
        car car = new car();
        car.start();
        car.drive();
    }
}
