import java.util.*;

public class Problem2 {
    // Q) Bit++
    // You start with a variable x = 0 and are given n operations, each of which is
    // either an increment (++X or X++) or a decrement (--X or X--). Each increment
    // increases x by 1, and each decrement decreases x by 1. Your task is to
    // calculate the final value of x after performing all the given operations.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = 0;
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            if (op.contains("++"))
                x++;
            else
                x--;
        }
        System.out.println(x);
    }
}