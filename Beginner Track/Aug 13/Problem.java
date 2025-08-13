import java.util.Scanner;

public class Problem {
    // Q) Translation
    // In Berlandish and Birlandish, words with the same meaning are spelled in
    // reverse order. You are given the Berlandish word s and Vasya’s translation t.
    // Your task is to check if t is exactly s reversed. If so, print "YES",
    // otherwise print "NO".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close();

        String reverse = new StringBuilder(s).reverse().toString();

        if (reverse.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
