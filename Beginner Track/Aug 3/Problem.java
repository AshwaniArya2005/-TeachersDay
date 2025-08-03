import java.util.Scanner;

public class Problem {
    // Q) Next Round

    // You are given the scores of n contest participants, sorted in non-increasing
    // order (so participants are ordered from highest to lowest score). The k-th
    // place finisher's score (let's call this score threshold) determines the
    // minimum score required to advance, but only participants with a positive
    // score can advance. Your job is to determine how many participants will
    // advance to the next round.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int kthScore = scores[k - 1];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (scores[i] >= kthScore && scores[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
