import java.util.*;

public class Problem2 {
    // Vanya and Lanterns
    // Statement: On a straight street of length l with n lanterns at various
    // positions, determine the minimum radius of light required to illuminate the
    // entire street. A greedy problem involving sorting and finding maximum gaps.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long rem = a % b;
            System.out.println(rem == 0 ? 0 : b - rem);
        }
    }
}
