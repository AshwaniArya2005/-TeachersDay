import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        //Q) Present
        // You are given a list where each element tells who received a gift from whom.
        // Specifically, the i-th number in the list is the friend who received a gift
        // from friend i.
        // Each friend gave exactly one gift and received exactly one gift. Your task is
        // to determine, for each friend, who gave them the gift.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        String[] words = str.replaceAll("WUB", " ").trim().split("\\s+");

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            if (i != words.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
