import java.util.*;

public class Problem {
    // Q) Anton and Danik
    // Anton and Danik play n games. Each game is won by either Anton or
    // Danik. Given the results, determine who wins more games, or if it’s a tie. A
    // straightforward simulation problem.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int aCount = 0, dCount = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A')
                aCount++;
            else
                dCount++;
        }

        if (aCount > dCount)
            System.out.println("Anton");
        else if (dCount > aCount)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
}
