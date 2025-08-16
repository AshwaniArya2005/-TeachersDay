import java.util.*;

public class Problem1 {

    //Q) Kyoya and Photobooks
    // Kyoya has a string representing a photo booklet. By inserting one extra
    // letter (a–z) at any position, he wants to know how many distinct new strings
    // can be formed. The task is to calculate this number of unique “special
    // edition” photobooks.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Set<String> hs = new HashSet<>();
        int n = str.length();

        for (int i = 0; i <= n; i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                String newBook = str.substring(0, i) + c + str.substring(i);
                hs.add(newBook);
            }
        }

        System.out.println(hs.size());
    }
}
