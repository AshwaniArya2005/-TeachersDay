import java.util.Scanner;

public class Problem2 {
    // Q) Cheap Travel
    // Ann travels by subway n times.
        // Single ticket: a rubles.
        // Special ticket (m rides): b rubles, can buy multiple times.
    // Find the minimum cost for all rides using single tickets, special tickets, or
    // a mix of both.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int costS = n * a;
        int costM = (n / m) * b + Math.min((n % m) * a, b);

        int minCost = Math.min(costS, costM);
        System.out.println(minCost);
    }
}
