import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), x = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            if (sum % x != 0) {
                System.out.println(n);
                continue;
            }
            int left = -1, right = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] % x != 0) {
                    left = i;
                    break;
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] % x != 0) {
                    right = i;
                    break;
                }
            }
            if (left == -1) {
                System.out.println(-1);
            } else {
                int removeLeft = n - (left + 1);
                int removeRight = right;
                System.out.println(Math.max(removeLeft, removeRight));
            }
        }
    }
}
