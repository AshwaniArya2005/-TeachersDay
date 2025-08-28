import java.util.Scanner;

public class Problem {

    // Problem: Magnets
    // Statement: A series of magnets are placed in a row, each represented by
    // either "01" or "10". The task is to determine how many groups of magnets are
    // formed, where a group is a sequence of identical magnets placed
    // consecutively.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        int p = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int curr = sc.nextInt();
            if (curr != p) {
                c++;
                p = curr;
            }
        }
        System.out.println(c);
    }
}