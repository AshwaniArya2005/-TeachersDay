import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        //Q) Soft Drinking
        // There are nnn friends sharing drinks, lime slices, and salt for making
        // toasts.
        // You have kkk bottles (each lll ml), ccc limes (each cut into ddd slices), and
        // ppp grams of salt.
        // Each toast for one friend requires nlnlnl ml drink, 1 slice of lime, and
        // npnpnp grams salt.
        // Find the maximum number of toasts each friend can make if they all drink the
        // same amount.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), l = sc.nextInt();
        int c = sc.nextInt(), d = sc.nextInt(), p = sc.nextInt();
        int nl = sc.nextInt(), np = sc.nextInt();
        sc.close();

        int totalDT = (k * l) / nl;
        int totalLT = c * d;
        int totalST = p / np;

        int maxToasts = Math.min(totalDT, Math.min(totalLT, totalST));
        System.out.println(maxToasts / n);
    }
}
