import java.util.*;

public class Problem1 {
    // Constructing the Array
    // Statement: Starting with an empty array of size n, elements are placed in
    // intervals by repeatedly choosing the middle position of the largest empty
    // segment. The task is to construct the final array. A constructive and
    // simulation-based problem.
    static class Segment {
        int l, r;

        Segment(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];

            PriorityQueue<Segment> pq = new PriorityQueue<>((s1, s2) -> {
                int len1 = s1.r - s1.l + 1;
                int len2 = s2.r - s2.l + 1;
                if (len1 == len2)
                    return s1.l - s2.l;
                return len2 - len1;
            });

            pq.add(new Segment(1, n));

            for (int i = 1; i <= n; i++) {
                Segment cur = pq.poll();
                int l = cur.l, r = cur.r;
                int mid;
                if ((r - l + 1) % 2 == 1) {
                    mid = (l + r) / 2;
                } else {
                    mid = (l + r - 1) / 2;
                }
                a[mid] = i;

                if (l <= mid - 1)
                    pq.add(new Segment(l, mid - 1));
                if (mid + 1 <= r)
                    pq.add(new Segment(mid + 1, r));
            }

            for (int i = 1; i <= n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
