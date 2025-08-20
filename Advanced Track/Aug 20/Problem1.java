import java.util.*;

public class Problem1 {
    // Q) Lucky Sum of Digits
    // Given an integer, the challenge is to determine the smallest number of lucky
    // numbers (made only of digits 4 and 7) whose digit sum equals that number. It
    // combines the concept of digit analysis with greedy problem-solving.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count4 = -1, count7 = -1;

        for (int b = n / 7; b >= 0; b--) {
            int remainder = n - 7 * b;
            if (remainder % 4 == 0) {
                count7 = b;
                count4 = remainder / 4;
                break;
            }
        }

        if (count4 == -1) {
            System.out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < count4; i++)
                sb.append('4');
            for (int i = 0; i < count7; i++)
                sb.append('7');
            System.out.println(sb.toString());
        }
    }
}
