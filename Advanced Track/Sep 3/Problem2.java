import java.util.*;

public class Problem2 {
    // Divisibility Problem
    // Statement: For integers a and b, calculate the smallest number to add to a so
    // it becomes divisible by b. Requires mathematical observation and modulus
    // operations.
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