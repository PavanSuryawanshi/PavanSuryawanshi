class Animal{
    void makeSound(){
        System.out.println("MakeSound");
    }
}
 class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog making Sound....");

    }

 }
class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat making Sound....");
    }
}




public class InheritanceExample1 {
    public static void main(String[] args) {
       Animal a = new Dog();
       a.makeSound();
       Animal b = new Cat();
       b.makeSound();
    }
}
