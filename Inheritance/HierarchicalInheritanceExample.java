class Employee{
    void work(){
        System.out.println("Employee works");
    }
}
class Engineer extends Employee{
    void develop(){
        System.out.println("Engineer is developing software...");
    }
}
class manager extends Employee{
    void ManagingTeam(){
        System.out.println("Manager is managing the team...");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.work();

        System.out.println("Calling engineer class method...");
        Engineer en = new Engineer();
        en.develop();
        en.work();


    }
}
