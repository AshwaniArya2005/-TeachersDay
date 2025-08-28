import java.util.Scanner;

public class Problem2 {
    // Hit the Lottery
    // Statement: Given an amount n and banknotes of denominations {1, 5, 10, 20,
    // 100}, compute the minimum number of notes needed. A classic greedy problem
    // choosing the largest denominations first.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] denominations = { 100, 20, 10, 5, 1 };

        for (int i = 0; i < denominations.length; i++) {
            count += n / denominations[i];
            n %= denominations[i];
        }

        System.out.println(count);
        sc.close();
    }
}
