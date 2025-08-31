import java.util.*;

public class Problem1 {
    // Registration System
    // Statement: A registration system must assign unique usernames. If a name is
    // taken, append the smallest number to make it unique. This problem requires
    // efficient use of hashing/maps to process queries.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> db = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();

            if (!db.containsKey(name)) {
                db.put(name, 0);
                System.out.println("OK");
            } else {
                int count = db.get(name) + 1;
                String result = name + count;
                while (db.containsKey(result)) {
                    count++;
                    result = name + count;
                }
                db.put(name, count);
                db.put(result, 0);
                System.out.println(result);
            }
        }
    }
}
