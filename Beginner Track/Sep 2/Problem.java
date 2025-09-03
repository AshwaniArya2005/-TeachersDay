import java.util.Scanner;

public class Problem {
    // George and Accommodation
    // Statement: Given pairs of (current occupants, room capacity), count how many
    // rooms can accommodate at least two more people. A simple implementation
    // problem.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            if (p != q && q - p != 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}