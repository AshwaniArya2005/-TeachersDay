import java.util.*;

public class Problem {
    // Q) Soldier and Bananas
    // A soldier wants to buy a certain number of bananas from a shop, where the
    // cost of the first banana is k, the second costs 2k, the third costs 3k, and
    // so on. He already has n dollars, but the total cost of all bananas may exceed
    // this amount. The task is to calculate how much extra money he needs to borrow
    // from his friend to buy all the bananas. If he already has enough, the answer
    // should simply be 0.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int totalCost = k * w * (w + 1) / 2;
        int borrow = Math.max(0, totalCost - n);

        System.out.println(borrow);
    }
}
