import java.util.*;

public class Problem1 {
    // Q) Kefa and First Steps
    // Kefa records his earnings for n consecutive days. He is interested in finding
    // the longest stretch of days where his earnings do not decrease compared to
    // the previous day — this is called the longest non-decreasing subsegment. The
    // goal is to scan through his earnings list and find the maximum length of such
    // a continuous segment, even if there are decreases elsewhere.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        int max = 1, curr = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
                curr++;
            } else {
                curr = 1;
            }
            if (curr > max) {
                max = curr;
            }
        }

        System.out.println(max);
        sc.close();
    }
}
