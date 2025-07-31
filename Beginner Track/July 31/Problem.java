import java.util.*;

public class Problem {
    // Q) Watermelon
    // Pete and Billy want to split a watermelon weighing w kilos into two parts,
    // each with a positive even weight. Determine if this is possible by checking:
        // The watermelon weight w must be even and greater than 2.
        // If so, print "YES"; otherwise, print "NO".
    // This means only even weights above 2 can be split into two positive even
    // parts.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if (((w % 2) & 1) == 0) {
            if (w == 2) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        } else {
            System.out.println("NO");
        }
    }
}
