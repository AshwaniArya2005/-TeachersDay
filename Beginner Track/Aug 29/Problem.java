import java.util.*;

public class Problem {
    static ArrayList<Integer> lucky = new ArrayList<>();

    static void generate(long x) {
        if (x > 1000) return;
        if (x != 0) lucky.add((int)x);
        generate(x * 10 + 4);
        generate(x * 10 + 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        generate(0);
        for (int num : lucky) {
            if (n % num == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
