import java.util.Scanner;

public class Problem2 {
    // Q) Queue at the School
    // A school queue consists of n children, each either a boy ('B') or a girl
    // ('G'). The queue changes over k seconds as follows:
        // Every second, all boys who have a girl immediately to their right swap
        // positions with that girl simultaneously.
        // You need to find the queue arrangement after performing these swaps for k
        // seconds.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == 'B' && arr[j + 1] == 'G') {
                    char temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    j++;
                }

            }
        }
        System.out.println(String.valueOf(arr));
    }
}
