abstract class Appliance {
    abstract void turnOn();
}
class WashingMachine extends Appliance {
    @Override
    void turnOn(){
        System.out.println("Washing mashine is turn on...");
    }
    void wash(){
        System.out.println("Washing mashine is washing...");
    }
}
class Smartwsh extends WashingMachine {
    void wash(){
        System.out.println("Smartwsh is washing...");
    }
    void connecttoWifi(){
        System.out.println("Smartwsh is connected to wifi...");
    }
}

public class MultiLevelInheritanceExample {
    public static void main(String[] args) {
        System.out.println("Washing machine is Executes....");
//        System.out.println("================================");

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.turnOn();
        washingMachine.wash();

        System.out.println("===============================");

        System.out.println("Smartwash is Executes....");
        Smartwsh smartwsh2 = new Smartwsh();
        smartwsh2.turnOn();
        smartwsh2.wash();
        smartwsh2.connecttoWifi();
    }
}
