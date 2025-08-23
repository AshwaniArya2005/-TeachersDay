import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumX = 0;
        int sumY = 0;
        boolean existsDiffParity = false;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            sumX += x;
            sumY += y;

            if ((x % 2) != (y % 2)) {
                existsDiffParity = true;
            }
        }

        if (sumX % 2 == 0 && sumY % 2 == 0) {
            System.out.println(0);
        } else if (sumX % 2 == 1 && sumY % 2 == 1 && existsDiffParity) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}
