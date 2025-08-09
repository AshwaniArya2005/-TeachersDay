import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem2 {
    // Q) I Wanna Be the Guy
    // There is a game with n levels. Little X can pass certain levels, and Little Y
    // can pass certain levels. Given the levels each can pass, determine if
    // together they can complete all n levels. If yes, print "I become the guy.",
    // else print "Oh, my keyboard!".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> hs = new HashSet<>();

        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            hs.add(sc.nextInt());
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            hs.add(sc.nextInt());
        }

        if (hs.size() == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

        sc.close();
    }
}
