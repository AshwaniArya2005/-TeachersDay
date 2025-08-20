import java.util.*;

public class Problem2 {
    // Q) Pashmak and Flowers
    // Out of n flowers, each with a beauty value, Pashmak wants to choose a pair
    // such that their beauty difference is the maximum possible. The task is to
    // compute this difference and also count how many such pairs exist, blending
    // sorting with combinatorics.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long minBeauty = Arrays.stream(arr).min().getAsLong();
        long maxBeauty = Arrays.stream(arr).max().getAsLong();

        long diff = maxBeauty - minBeauty;

        long minCount = 0, maxCount = 0;
        for (long f : arr) {
            if (f == minBeauty)
                minCount++;
            if (f == maxBeauty)
                maxCount++;
        }

        long ways;
        if (diff == 0) {
            ways = (long) n * (n - 1) / 2;
        } else {
            ways = minCount * maxCount;
        }

        System.out.println(diff + " " + ways);
    }
}
