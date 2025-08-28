import java.util.*;

public class Problem2 {
    // Gravity Flip
    // Statement: Given columns of cubes, after applying gravity all cubes fall to
    // the bottom. The task is to output the new arrangement by sorting the heights
    // of the columns. A simple yet effective sorting-based problem.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        for (int x : a)
            System.out.print(x + " ");
    }
}
