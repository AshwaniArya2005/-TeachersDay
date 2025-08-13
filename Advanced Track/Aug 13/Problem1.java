import java.util.Scanner;

public class Problem1 {
    // Q) Park Lighting
    // The park is a grid with n rows and m columns, where each square cell is
    // bordered by streets. Lanterns can be placed in the middle of the streets, and
    // each one lights two adjacent squares (or only one if on the border). You need
    // to find the minimum number of lanterns required to light all the squares in
    // the park.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long tSqaure = n * m;
            long lant = (tSqaure + 1) / 2;
            System.out.println(lant);
        }
        sc.close();
    }
}
