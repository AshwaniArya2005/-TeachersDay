import java.util.Scanner;

public class Problem2 {
    // Q) Young Physicist
    // A body at the origin (0, 0, 0) in space is acted upon by n forces, each
    // represented as a 3D vector with x, y, and z components. The body is in
    // equilibrium if the sum of all x-components, y-components, and z-components is
    // zero. You must determine if the body is in equilibrium based on the given
    // forces.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumX = 0, sumY = 0, sumZ = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            sumX += x;
            sumY += y;
            sumZ += z;
        }

        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
