import java.util.*;

public class Problem {
    public static void main(String[] args) {
        // Q) Twins
        // You are given n coins, each with a certain value. You want to choose some
        // coins so that the total value you take is strictly greater than the total
        // value left for your twin. However, you want to take as few coins as possible
        // to avoid suspicion. The goal is to determine the minimum number of coins
        // needed to achieve this.
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int total = 0;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        Arrays.sort(arr);

        for (int i = n - 1; i >= 0; i--) {
            sum += arr[i];
            count++;
            if (sum > total - sum)
                break;
        }

        System.out.println(count);
    }
}
