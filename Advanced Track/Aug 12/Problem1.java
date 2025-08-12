import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        //Q) Night at the Museum
        // A circular wheel contains the lowercase English alphabet in order.
        // You start with the pointer at 'a' and can rotate 1 step clockwise or
        // counterclockwise per move.
        // To print a string, move to each letter in sequence and print it without
        // needing to return to 'a'.
        // Find the minimum total number of moves required to print the given string.

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int totalR = 0;
        char curr = 'a';

        for (char ch : s.toCharArray()) {
            int pos1 = curr - 'a';
            int pos2 = ch - 'a';
            int diff = Math.abs(pos1 - pos2);
            totalR += Math.min(diff, 26 - diff);
            curr = ch;
        }

        System.out.println(totalR);
    }
}
