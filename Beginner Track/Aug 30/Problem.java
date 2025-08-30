import java.util.Scanner;

public class Problem {
    // HQ9+
    // Statement: A joke programming language has only four commands. Given a
    // program in this language, determine if it will produce any output. A
    // straightforward string-check problem.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();

        if (p.contains("H") || p.contains("Q") || p.contains("9")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
