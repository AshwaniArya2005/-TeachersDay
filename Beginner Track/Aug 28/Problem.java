import java.util.*;

public class Problem {
    // Panoramix’s Prediction
    // Statement: Given two integers x and y, check whether y is the immediate next
    // prime after x. A problem testing prime number logic and iteration.

    static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int nextPrime = -1;
        for (int i = n + 1; i <= 50; i++) {
            if (isPrime(i)) {
                nextPrime = i;
                break;
            }
        }

        if (nextPrime == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
