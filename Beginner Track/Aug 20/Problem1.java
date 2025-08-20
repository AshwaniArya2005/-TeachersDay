import java.util.Scanner;

public class Problem1 {
    //Q) Drinks
    // You are given several drinks, and each drink contains a certain percentage of
    // orange juice. Vasya wants to mix equal amounts of all these drinks to make
    // one cocktail. You need to calculate what percentage of the final cocktail
    // will be orange juice.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double result = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            result += p;
        }
        result /= n;
        System.out.println(result);
    }
}
