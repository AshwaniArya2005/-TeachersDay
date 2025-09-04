import java.util.Scanner;

public class Problem {
    // Calculating Function
    // Statement: Define f(n) = -1 + 2 - 3 + 4 - 5 … ± n. For a given n, compute
    // f(n) efficiently without iteration by observing the alternating pattern.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result;
        if (n % 2 == 0) {
            result = n / 2;
        } else {
            result = -(n + 1) / 2;
        }

        System.out.println(result);
    }
}
