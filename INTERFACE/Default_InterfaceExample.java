
interface Vehicle{
    void Start();

    default void Stop(){
        System.out.println("Vehical is  Stopped");
    }
}

class Car implements Vehicle{
    @Override
    public void Start() {
        System.out.println("Car Started");
    }

    @Override
    public void Stop() {
        System.out.println("Car is Stopped");
    }
}

class Bike implements Vehicle{
    @Override
    public void Start() {
        System.out.println("Bike Started");
    }

    @Override
    public void Stop() {
        System.out.println("Bike is Stopped");
    }
}
public class Default_InterfaceExample {
    public static void main(String[] args) {
        Vehicle innova = new Car();
        innova.Start();
        innova.Stop();

        Vehicle R15 = new Bike();
        R15.Start();
        R15.Stop();
    }
}
