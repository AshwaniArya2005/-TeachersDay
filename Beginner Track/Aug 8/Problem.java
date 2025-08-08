import java.util.*;

public class Problem {
    // Q) Boy or Girl
    // Given a username consisting of lowercase English letters, determine the
    // user’s gender based on the number of distinct characters in the username:
        // If the number of distinct characters is odd, print "IGNORE HIM!" (male).
        // If the number of distinct characters is even, print "CHAT WITH HER!"
        // (female).
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