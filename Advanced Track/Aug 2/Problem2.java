import java.util.*;

public class Problem2 {
    // Q) TEAM
    // Statement - Three friends—Petya, Vasya, and Tonya—will solve a problem only
    // if at least two of them are sure about the solution.
    // Input: An integer n (1 ≤ n ≤ 1000), followed by n lines each with three 0/1
    // integers indicating whether Petya, Vasya, and Tonya are sure about each
    // problem.
    // Output: Print the number of problems they will solve.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();

            if (p == 1 && v == 1 || v == 1 && t == 1 || p == 1 && t == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
