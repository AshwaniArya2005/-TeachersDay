import java.util.*;

public class Problem {
    // Q) Petya and Countryside
    // Petya wants to water his countryside garden. From each flower bed, water can
    // flow to the left and right as long as the heights don’t increase. The goal is
    // to determine the maximum number of consecutive beds that can be watered
    // starting from one position. This problem focuses on simulation and array
    // traversal.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int maxWatered = 0;

        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = i - 1; j >= 0; j--) {
                if (h[j] <= h[j + 1])
                    count++;
                else
                    break;
            }

            for (int j = i + 1; j < n; j++) {
                if (h[j] <= h[j - 1])
                    count++;
                else
                    break;
            }

            maxWatered = Math.max(maxWatered, count);
        }

        System.out.println(maxWatered);
    }
}
