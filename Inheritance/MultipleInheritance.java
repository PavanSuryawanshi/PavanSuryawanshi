
interface printable{
    void print();
}

interface Scannable{
    void scan();
}
class multipleFunctionPrinter implements printable, Scannable{
    @Override
    public void print() {
        System.out.println("print is Start printing...");
    }
    @Override
    public void scan() {
        System.out.println("scan is Start Scanning...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        multipleFunctionPrinter printer = new multipleFunctionPrinter();
        printer.scan();
        printer.print();
    }
}

