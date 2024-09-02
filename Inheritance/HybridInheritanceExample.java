
interface drive{
    void drive();
}
interface musicplayer{
    void playmusic();
}
interface TurnOnAc{
    void TurnOnAc();
}

class car1 implements drive{
    public void drive(){
        System.out.println("car is Starting");
    }
}
class LuxuryCar extends car1 implements musicplayer,TurnOnAc{
    public void playmusic(){
        System.out.println("playing music in the Luxury Car");
    }

    @Override
    public void TurnOnAc() {
        System.out.println("Luxury Car is Turning On Ac");
    }
}

public class HybridInheritanceExample {
    public static void main(String[] args) {
        LuxuryCar luxuryCar = new LuxuryCar();
        luxuryCar.drive();
        luxuryCar.playmusic();
        luxuryCar.TurnOnAc();
    }

}
