import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1 {
    // Q) Stones on the Table
    // You have a row of n stones, each colored Red (R), Green (G), or Blue (B). To
    // make the row beautiful, no two neighboring stones should have the same color.
    // Your task is to calculate the minimum number of stones you have to remove so
    // that any two adjacent stones have different colors.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Set<Character> hs = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!hs.contains(ch)) {
                hs.add(ch);
            }
        }
        if (hs.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}
