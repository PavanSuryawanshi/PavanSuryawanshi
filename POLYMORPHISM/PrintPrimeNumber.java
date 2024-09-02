import java.util.Scanner;

public class PrintPrimeNumber {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime number ");
            }else {
                System.out.println(i+ " is Not a prime number");
            }
        }
    }
}
