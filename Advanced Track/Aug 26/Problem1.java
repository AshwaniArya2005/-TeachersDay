import java.util.*;

public class Problem1 {
    // Problem 1: Divisibility Problem
    // Statement: For two integers a and b, find the smallest non-negative integer x
    // such that (a + x) is divisible by b. A straightforward number theory problem
    // testing modular arithmetic understanding.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);

        double maxGap = 0;
        for (int i = 1; i < n; i++) {
            maxGap = Math.max(maxGap, a[i] - a[i - 1]);
        }

        double leftGap = a[0] - 0;
        double rightGap = l - a[n - 1];

        double result = Math.max(maxGap / 2.0, Math.max(leftGap, rightGap));
        System.out.printf("%.10f\n", result);
    }
}
