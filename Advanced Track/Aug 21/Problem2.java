import java.util.*;

public class Problem2 {
    // Q) Magic Numbers
    // A number is called magic if it can be represented as a concatenation of 1,
    // 14, or 144 (used any number of times). The task is to determine whether a
    // given number qualifies as a magic number. It tests string parsing and greedy
    // checking.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int i = 0;
        boolean ok = true;

        while (i < s.length()) {
            if (i + 2 < s.length() && s.substring(i, i + 3).equals("144")) {
                i += 3;
            } else if (i + 1 < s.length() && s.substring(i, i + 2).equals("14")) {
                i += 2;
            } else if (s.charAt(i) == '1') {
                i += 1;
            } else {
                ok = false;
                break;
            }
        }

        System.out.println(ok ? "YES" : "NO");
    }
}
