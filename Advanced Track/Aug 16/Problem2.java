import java.util.*;

public class Problem2 {
    //Q) GukiZ and Contest
    // Each student has a rating, and their rank is based on these ratings. Higher
    // ratings get better (smaller) ranks, and equal ratings share the same rank.
    // The problem asks to output each student’s expected rank in the same order as
    // the input.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ratings = new int[n];

        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
        }
        sc.close();

        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            int pos = 1;
            for (int j = 0; j < n; j++) {
                if (ratings[j] > ratings[i]) {
                    pos++;
                }
            }
            rank[i] = pos;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rank[i] + " ");
        }
    }
}
