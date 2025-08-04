import java.util.Scanner;

public class Problem1 {
    //Q) George and Accomodation
    
    // George and Alex want to move into a dormitory room together. The dormitory
    // has n rooms. For each room, you are given the number of people already living
    // in the room (pᵢ) and the room’s capacity (qᵢ).
    // Your task is to count how many rooms have enough free space for both George
    // and Alex to join—that is, rooms where at least two spots are available.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            if (p != q && q - p != 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
