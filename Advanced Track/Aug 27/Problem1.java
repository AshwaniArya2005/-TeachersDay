import java.util.*;

public class Problem1 {
    // Spy Detected!
    // Statement: In an array where all numbers are the same except one, find the
    // position of the unique element. A direct searching problem with linear scan
    // logic.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int common;
            if (a[0] == a[1])
                common = a[0];
            else if (a[0] == a[2])
                common = a[0];
            else
                common = a[1];

            for (int i = 0; i < n; i++) {
                if (a[i] != common) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
        sc.close();
    }
}
