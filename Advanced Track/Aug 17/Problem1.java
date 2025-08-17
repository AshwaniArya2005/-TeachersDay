import java.util.*;

public class Problem1 {
    // Q) Jzzhu and Children
    // In Jzzhu’s school, there are n children each needing at least a certain
    // number of candies. The children line up, and in each turn the first child in
    // the queue receives m candies. If their requirement is still not satisfied,
    // they move to the end of the line; otherwise, they leave the queue and go
    // home. This process repeats until all children leave, and the problem is to
    // determine which child will be the very last one to go home.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lastChild = 0;
        int maxRounds = 0;

        for (int i = 0; i < n; i++) {
            int rounds = (arr[i] + m - 1) / m;
            if (rounds >= maxRounds) {
                maxRounds = rounds;
                lastChild = i + 1;
            }
        }

        System.out.println(lastChild);

        sc.close();
    }
}
