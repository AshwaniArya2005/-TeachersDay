import java.util.*;

public class Problem {
    // Ultra-Fast Mathematician

    // Statement: Given two binary strings of equal length, output a new string
    // where each digit is the XOR of the corresponding digits from the input. A
    // simple bitwise/string manipulation exercise.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            result.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
        }

        System.out.println(result);
    }
}
