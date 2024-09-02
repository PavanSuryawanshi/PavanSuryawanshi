import java.util.Scanner;

class Calculator {
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

//    public static void add(double[] nums) {
//        int sum = 0;
//        for (double num : nums) {
//            sum += nums;
//        }
//    }

    public void subtract (int a, int b) {
        int sub = a - b;
        System.out.println(sub);
    }
    public void multiply (int a, int b) {
        int mul = a * b;
        System.out.println(mul);
    }
    public void divide (int a, int b) {
        int div = a / b;
        System.out.println(div);
    }

    public void subtract(double[] nums) {
        int subtract = 0;
        for (double num : nums) {
            subtract += num;
        }
    }
}

public class VariableLenghthExa {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
//        cal.add(10, 20);
//        cal.subtract(10, 20);
//        cal.multiply(10, 20);
//        cal.divide(10, 20);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to add?: ");   
        int n = Integer.parseInt(sc.nextLine());
        double[] nums = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter"+i+"value");
            nums[i] = Integer.parseInt(sc.nextLine());
            System.out.println();
        }
            cal.subtract(nums);
    }
}
