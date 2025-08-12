import java.util.Scanner;

public class Problem {
    // Q) Domino Piling
    // You are given an M×NM \times NM×N board and unlimited 2×12 \times 12×1
    // dominoes that can be rotated.
    // Each domino must cover exactly two squares, cannot overlap, and must be fully
    // inside the board.
    // Find the maximum number of dominoes that can be placed under these
    // conditions.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println((m * n) / 2);
    }
}
