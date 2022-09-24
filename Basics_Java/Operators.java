import java.io.*;

public class Operators{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // Sum of N natural numbers
        int sum = (N * (N + 1)) / 2;
        System.out.printf("Sum of %d natural numbers is %d.\n", N, sum);
    }
}
