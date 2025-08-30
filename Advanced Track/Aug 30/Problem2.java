import java.util.*;

public class Problem2 {
    // Captain Flint and Crew Recruitment
    // Statement: Flint wants to recruit 4 crew members such that their strengths
    // add up to n. You need to output any valid combination or say it’s not
    // possible. A constructive number theory problem.
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