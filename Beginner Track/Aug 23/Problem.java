import java.util.*;

public class Problem {
    // Bear and Big Brother
    // Limak and Bob weigh differently. Each year, Limak’s weight triples
    // while Bob’s doubles. Find the number of years it takes for Limak to become
    // strictly heavier. A simple yet fun loop-based problem.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int years = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            years++;
        }
        System.out.println(years);
    }
}
