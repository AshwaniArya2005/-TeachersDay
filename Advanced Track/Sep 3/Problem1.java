import java.util.Scanner;

public class Problem1 {
    // Cheap Travel
    // Statement: Vasya can buy tickets either one by one or in bundles. Find the
    // minimum cost to make n rides, choosing optimally between single and special
    // tickets. Involves greedy strategy and modular arithmetic.
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