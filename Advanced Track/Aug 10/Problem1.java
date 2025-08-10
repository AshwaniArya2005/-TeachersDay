import java.util.Scanner;

public class Problem1 {

    // Q) Sereja and Dima
    // Two players alternately pick the larger value from either end of a row of
    // cards.
        // Sereja starts first.
        // Both play greedily.
    // Determine their final scores.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int l = 0, r = n - 1;
        int sereja = 0, dima = 0;
        boolean sTurn = true;

        while (l <= r) {
            int ch;
            if (cards[l] > cards[r]) {
                ch = cards[l];
                l++;
            } else {
                ch = cards[r];
                r--;
            }

            if (sTurn) {
                sereja += ch;
            } else {
                dima += ch;
            }
            sTurn = !sTurn;
        }

        System.out.println(sereja + " " + dima);
    }
}
