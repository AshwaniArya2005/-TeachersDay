import java.util.ArrayList;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        //Q) Helpful Maths

        // You are given a string representing a sum of numbers using only 1, 2, and 3
        // (e.g., "3+2+1"), with numbers separated by plus signs. Your task is to
        // rearrange the summands so that the numbers appear in non-decreasing order
        // (smallest to largest), while keeping the numbers separated by plus signs.
        // This will help Xenia add them more easily.

        // Example:
        // Input: 3+2+1
        // Output: 1+2+3
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+') {
                continue;
            }
            arr.add(Character.getNumericValue(str.charAt(i)));
        }
        arr.sort((a, b) -> a - b);
        for (int i = 0; i < arr.size() - 1; i++) {
            System.out.print(arr.get(i) + "+");
        }
        System.out.println(arr.get(arr.size() - 1));
        sc.close();
    }
}
