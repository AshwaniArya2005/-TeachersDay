import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    // Bersu Ball
    // Statement: There are boys and girls with given dancing skills. Pair them such
    // that their skill difference ≤ 1 and maximize the number of pairs. Requires
    // greedy matching after sorting.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(b);
        int m = sc.nextInt();
        int[] g = new int[m];
        for (int i = 0; i < m; i++) {
            g[i] = sc.nextInt();
        }
        Arrays.sort(g);
        int i = 0, j = 0;
        int res = 0;
        while (i < n && j < m) {
            if (Math.abs(b[i] - g[j]) < 2) {
                j++;
                res++;
                i++;
            } else if (b[i] < g[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(res);
    }
}