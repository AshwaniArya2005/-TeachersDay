// Problem 2: Registration System
//  Statement: A new registration system requires unique usernames. For each new registration, if the username already exists, append the smallest number to make it unique. The task is to efficiently handle a large number of registrations using hashing/maps.

import java.util.HashMap;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, Integer> database = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            if (!database.containsKey(name)) {
                System.out.println("OK");
                database.put(name, 0);
            } else {
                int count = database.get(name) + 1;
                String newName = name + count;
                while (database.containsKey(newName)) {
                    count++;
                    newName = name + count;
                }
                System.out.println(newName);
                database.put(name, count);
                database.put(newName, 0);
            }
        }
        scanner.close();
    }
}