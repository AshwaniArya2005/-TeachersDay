import java.util.Scanner;

public class Problem {
    // Present
    // Statement: n friends participate in a gift exchange, where each friend gives
    // exactly one gift and receives exactly one gift. Given the gift-giving order,
    // determine for every friend who gave them a gift. A mapping/array problem
    // focusing on indexing.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n + 1];
        int[] result = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
            result[p[i]] = i;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}