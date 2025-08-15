import java.util.*;

public class Problem2 {
    // Q) Valera and Plates
    // Valera has m clean bowls and k clean plates, and he has
    // a plan for n days where he eats one meal per day. Meals of type 1 must be
    // eaten from a bowl, while meals of type 2 can be eaten from either a bowl or a
    // plate. Each time Valera doesn’t have the required clean utensil, he must wash
    // one before eating. The problem is to calculate the minimum number of times he
    // will need to wash dishes if he uses his utensils in the most efficient way
    // possible.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int wash = 0;

        for (int i = 0; i < n; i++) {
            int dish = sc.nextInt();

            if (dish == 1) {
                if (m > 0) {
                    m--;
                } else {
                    wash++;
                }
            } else {
                if (k > 0) {
                    k--;
                } else if (m > 0) {
                    m--;
                } else {
                    wash++;
                }
            }
        }

        System.out.println(wash);
        sc.close();
    }
}
