import java.util.Scanner;

public class Problem {
    //Q) Football
    // Given a string of '0's and '1's (each character represents a player from one
    // of two teams), you are to decide whether the current football situation is
    // "dangerous."
    // A situation is called dangerous if there are at least 7 players from the same
    // team standing consecutively—that is, there is any substring of at least 7
    // consecutive '0's or at least 7 consecutive '1's.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            if (count >= 6) {
                break;
            } else if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                count = 0;
            }

        }
        if (count >= 6) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}