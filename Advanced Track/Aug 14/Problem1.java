import java.util.*;

public class Problem1 {
    // Q) Even Odds
    // You have numbers from 1 to n, and you rearrange them so that all the odd
    // numbers appear first in ascending order, followed by all the even numbers in
    // ascending order. Given a position k, you need to find which number will be at
    // that position in this rearranged list.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long oddCount = (n + 1) / 2;

        if (k <= oddCount) {
            System.out.println(2 * k - 1);
        } else {
            System.out.println(2 * (k - oddCount));
        }
    }
}
