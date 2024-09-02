import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowExample1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the Colour: ");
        String filename = br.readLine();
    }
}
