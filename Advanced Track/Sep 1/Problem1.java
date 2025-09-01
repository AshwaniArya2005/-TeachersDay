import java.io.*;
import java.util.*;

public class Problem1 {
    // T-Primes
    // Statement: A number is called T-prime if it has exactly three distinct
    // divisors. For multiple queries, check whether each number is a T-prime. This
    // requires efficient use of prime checking and square numbers.
    static final int MAX = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        HashSet<Long> primeSquares = new HashSet<>();
        for (int i = 2; i <= MAX; i++) {
            if (isPrime[i]) {
                primeSquares.add(1L * i * i);
            }
        }

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            long x = Long.parseLong(st.nextToken());
            if (primeSquares.contains(x)) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb.toString());
    }
}
