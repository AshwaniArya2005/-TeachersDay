import java.util.Scanner;

public class Problem1 {
    //Q) Xenia and Ringroad
    // Xenia lives on a circular road with n houses numbered 1 to n clockwise. She
    // starts at house 1 and must complete m tasks, each at a specific house given
    // in order. Moving to an adjacent house takes 1 unit of time, and she can only
    // move clockwise. Find the minimum time needed to complete all tasks in
    // sequence.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextInt();

        long time = 0;
        long curr = 1;

        for (int i = 0; i < m; i++) {
            long j = sc.nextLong();
            if (j >= curr) {
                time += j - curr;
            } else {
                time += (n - curr) + j;
            }
            curr = j;
        }

        System.out.println(time);
    }
}
