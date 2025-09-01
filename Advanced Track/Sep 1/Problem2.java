import java.util.*;

public class Problem2 {
    // Vanya and Lanterns
    // Statement: On a street of length l with n lanterns placed at different
    // positions, determine the minimum radius of light required to illuminate the
    // entire street. A greedy problem involving sorting and maximum gaps.
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
