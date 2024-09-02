interface Engine {
    void start();
}

class GasEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Gas engine started");
    }
}

class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine started");
    }
}

class Car {
    private Engine engine;

    // Constructor injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}

public class LooseCouplingUsingInterface {
    public static void main(String[] args) {
        Engine gasEngine = new GasEngine();
        Engine electricEngine = new ElectricEngine();

        Car car1 = new Car(gasEngine);
        Car car2 = new Car(electricEngine);

        car1.startCar();
        car2.startCar();
    }
}
