import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1 {
    //Q) Is Your Horseshoe on the Other Hoof?
    // You have four horseshoes, each painted a certain color. Your goal is to have
    // four horseshoes of distinct colors, making sure all colors are unique.
        // You are given the colors of your current four horseshoes.
        // Some colors may be repeated.
        // You need to calculate the minimum number of new horseshoes you must buy so
        // that all four horseshoes have different colors.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        Set<Integer> hs = new HashSet<>();
        for (int num : arr) {
            hs.add(num);
        }
        System.out.println(4 - hs.size());

    }
}
