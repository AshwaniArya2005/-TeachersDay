import java.util.*;

public class Problem2 {
    // Xenia and Divisors
    // Xenia has a sequence of positive integers (each ≤ 7) and wants to divide them
    // into groups of three. For each group (a,b,c), the numbers must be strictly
    // increasing and also satisfy the condition that a divides b and b divides c.
    // The only possible valid groups are (1,2,4), (1,2,6), and (1,3,6). The
    // challenge is to arrange the numbers into these exact triplets using every
    // element; if such a partition is not possible, the output should be -1.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[8];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[x]++;
        }

        List<String> result = new ArrayList<>();

        while (arr[1] > 0 && arr[2] > 0 && arr[4] > 0) {
            result.add("1 2 4");
            arr[1]--;
            arr[2]--;
            arr[4]--;
        }

        while (arr[1] > 0 && arr[2] > 0 && arr[6] > 0) {
            result.add("1 2 6");
            arr[1]--;
            arr[2]--;
            arr[6]--;
        }

        while (arr[1] > 0 && arr[3] > 0 && arr[6] > 0) {
            result.add("1 3 6");
            arr[1]--;
            arr[3]--;
            arr[6]--;
        }

        for (int i = 1; i <= 7; i++) {
            if (arr[i] > 0) {
                System.out.println(-1);
                return;
            }
        }

        for (String group : result) {
            System.out.println(group);
        }

    }
}
