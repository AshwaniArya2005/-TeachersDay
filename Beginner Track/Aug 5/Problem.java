import java.util.*;

public class Problem {
    // Q) PETYA AND STRINGS
    // Statement - Little Petya got two same-length strings of uppercase and
    // lowercase letters. He wants to compare them lexicographically, ignoring case.
    // Input: Two lines, each with a string (1 to 100 chars, same length).
    // Output: Print "-1" if the first string is less, "1" if greater, and "0" if
    // equal, case-insensitive
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        int result = s1.compareTo(s2);
        if (result < 0)
            System.out.println(-1);
        else if (result > 0)
            System.out.println(1);
        else
            System.out.println(0);

    }
}
