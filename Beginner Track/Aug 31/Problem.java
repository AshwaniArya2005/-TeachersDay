import java.util.*;

public class Problem {
    // I Love %username%
    // Statement: Given the ratings of a coder over several contests, determine how
    // many times they break their own record for highest or lowest rating. A
    // problem testing comparisons and counters.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int res = 0;
        int best = scores[0], worst = scores[0];

        for (int i = 1; i < n; i++) {
            if (scores[i] > best) {
                res++;
                best = scores[i];
            } else if (scores[i] < worst) {
                res++;
                worst = scores[i];
            }
        }

        System.out.println(res);
    }
}
