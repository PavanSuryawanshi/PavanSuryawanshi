
interface Animal{
    void Sound();
    void sleep();

}
class Dog implements Animal{
    @Override
    public void Sound() {
        System.out.println("Dog is makind Sound Like : Bhovu...");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is Sleeping...");
    }
}
class cat implements Animal{
    @Override
    public void Sound() {
        System.out.println("cat is making Sound Like : Mew mew...");
    }

    @Override
    public void sleep() {
        System.out.println("cat is Sleeping...");
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        Animal Jholu = new Dog();
        Jholu.Sound();
        Jholu.sleep();

        Animal Manikarnika = new cat();
        Manikarnika.Sound();
        Manikarnika.sleep();
    }
}
