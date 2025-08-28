import java.util.*;

public class Problem1 {
    // Kefa and First Steps
    // Statement: Kefa records the number of flowers he sees daily. The task is to
    // find the length of the longest non-decreasing subsegment in the sequence. A
    // problem focusing on array traversal and subarray properties.
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