import java.util.*;

public class Problem1 {
    // Q) Little Elephants and bits
    // Given a binary string, the Little Elephant wants to remove exactly one digit
    // to form the largest possible binary number. The challenge is to find the
    // optimal digit to remove. This problem highlights string manipulation with
    // greedy logic.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int index = s.indexOf('0');

        if (index == -1) {
            System.out.println(s.substring(0, s.length() - 1));
        } else {
            System.out.println(s.substring(0, index) + s.substring(index + 1));
        }
    }
}
