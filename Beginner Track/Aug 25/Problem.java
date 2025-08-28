import java.util.*;

public class Problem {
    // Nearly Lucky Number
    // Statement: A number is called nearly lucky if the count of digits 4 and 7 in
    // it is itself a lucky number. Given a number, determine whether it’s nearly
    // lucky or not. A neat number theory and digit-counting problem.
    static boolean isLucky(long x) {
        if (x == 0)
            return false;
        while (x > 0) {
            long d = x % 10;
            if (d != 4 && d != 7)
                return false;
            x /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int cnt = 0;
        for (char c : n.toCharArray()) {
            if (c == '4' || c == '7')
                cnt++;
        }
        System.out.println(isLucky(cnt) ? "YES" : "NO");
    }
}
