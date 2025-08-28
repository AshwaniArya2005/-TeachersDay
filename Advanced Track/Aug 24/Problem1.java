
// Problem 1: Hit the Lottery
//  Statement: You have to pay an amount n using banknotes of denominations {1, 5, 10, 20, 100}. Find the minimum number of notes required. A simple greedy problem that emphasizes working with the largest possible notes first.
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int[] denominations = { 100, 20, 10, 5, 1 };

        for (int i = 0; i < denominations.length; i++) {
            count += n / denominations[i];
            n %= denominations[i];
        }

        System.out.println(count);
        scanner.close();
    }
}