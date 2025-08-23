import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n <= 30) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                if (n == 36 || n == 40 || n == 44) {
                    System.out.println("6 10 15 " + (n - 31));
                } else {
                    System.out.println("6 10 14 " + (n - 30));
                }
            }
        }
    }
}
