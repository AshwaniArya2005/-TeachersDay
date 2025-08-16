import java.util.Scanner;

public class Problem {
    // Q) Queue at the School
    // Boys (B) and girls (G) stand in a queue in the canteen in the order they
    // arrive. Every second, if a boy is standing directly in front of a girl, they
    // swap positions. This process repeats simultaneously for all such pairs in the
    // queue for t seconds. The task is to determine the arrangement of the queue
    // after all these swaps have been performed for the given time.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();

        char[] arr = s.toCharArray();

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == 'B' && arr[j + 1] == 'G') {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    j++;
                }
            }
        }
        System.out.println(new String(arr));
    }
}
