
class Student{
    public void study(int rollNo, String name, int age,String courses){
        System.out.println(rollNo+" "+name+" "+age+" "+courses);
        for(int i = 0; i < courses.length(); i++){
            System.out.print(i);
        }
        System.out.println();
    }
}


public class VariableLenghtExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("rollNo. "+"\t"+"name of the student\t\t\t"+"age\t\t\t\t"+"course");
        s1.study(1, "             Pavan            ", 23, "   Java");
        s1.study(2, "           Shubhangi          ", 21, "   java,Python");
        s1.study(3, "           Nandini            ", 19, "   java,Python,web");
        s1.study(4, "            Swati             ", 23, "   java,Python,web");
        s1.study(5, "           Mohini             ", 21, "   java,Python,web");

    }
}
