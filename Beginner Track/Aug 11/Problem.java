import java.util.*;

public class Problem {
    //Q) Bit++
    // In the quirky Bit++ language, there’s only one variable x (initially 0).
        // ++X or X++ → increment x by 1
        // --X or X-- → decrement x by 1
    // Given n statements, execute them in order and output the final value of x.
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
