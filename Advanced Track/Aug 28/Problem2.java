import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    // BerSU Ball
    // Statement: Given the skills of boys and girls, pair them to form dance
    // partners such that their skill levels differ by at most 1. The task is to
    // maximize the number of pairs. A greedy two-pointer problem.
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