import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Division{
    public int division(int a, int b){
        return a/b;
    }
}


public class ExceptinHandlingExample {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the first number: ");
            int n1 = Integer.parseInt(br.readLine());
            System.out.println("Enter the second number: ");
            int n2 = Integer.parseInt(br.readLine());

            Division d = new Division();
            int ans = d.division(n1, n2);
            System.out.println(ans);
        } catch (IOException ie) {
            throw new RuntimeException(ie);
        }catch (NumberFormatException ne){
            System.out.println("Plese enter integer number");
        }catch (ArithmeticException ae){
            System.out.println("don't pass 0 as denominator..");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
