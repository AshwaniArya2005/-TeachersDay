import java.util.*;

public class Problem2 {
    // Q) Beautiful Matrix

    // Given a 5×5 matrix with only one ‘1’ and the rest all ‘0’. In each move, you
    // can swap two neighboring rows or two neighboring columns. You need to count
    // the minimum number of moves to bring the ‘1’ to the center cell (i.e., row 3,
    // column 3).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = -1, col = -1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int val = sc.nextInt();
                if (val == 1) {
                    row = i;
                    col = j;
                }
            }
        }

        int moves = Math.abs(row - 2) + Math.abs(col - 2);
        System.out.println(moves);
    }
}
