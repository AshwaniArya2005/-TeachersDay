import java.util.*;

public class Problem {
    // Q) Stones on the Table
    // You have a row of stones, each colored R, G, or B.
    // If two consecutive stones have the same color, you must remove one.
    // Find the minimum number of removals so that no two adjacent stones share the
    // same color.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int count = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}