import java.util.*;

public class Problem1 {
    // Puzzle Pieces
    // Statement: Given an n×m board, determine if it’s possible to place puzzle
    // pieces such that every piece covers exactly two adjacent cells. A
    // constructive problem involving logical observations about dimensions.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
            int[] arr = { x, y, z };
            Arrays.sort(arr);
            if (arr[1] != arr[2]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(arr[0] + " " + arr[0] + " " + arr[2]);
            }
        }
    }
}
