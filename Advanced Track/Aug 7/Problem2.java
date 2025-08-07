import java.util.Scanner;

public class Problem2 {
    //Q) Dubstep
    // In this problem, you’re given a remix of a song where the word "WUB" has been
    // inserted multiple times:
        // Zero or more times before the first word.
        // At least once between each pair of original words.
        // Zero or more times after the last word.
    // Your task is to reconstruct and print the original song by removing all the
    // "WUB"s and placing a single space between the original words.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n + 1];
        int[] result = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
            result[p[i]] = i;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
