import java.util.*;

public class Problem1 {
    //Q) Arrival of General
    // n soldiers stand in random order. The general considers the lineup correct
    // if:
        // First soldier = tallest
        // Last soldier = shortest
    // Only adjacent swaps are allowed (1 per second).
    // Find the minimum seconds needed to achieve this order.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++)
            h[i] = sc.nextInt();

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (h[i] > h[maxIndex])
                maxIndex = i;
        }

        int minIndex = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (h[i] < h[minIndex])
                minIndex = i;
        }

        int swaps = maxIndex + (n - 1 - minIndex);
        if (maxIndex > minIndex)
            swaps--;
        System.out.println(swaps);
    }
}
