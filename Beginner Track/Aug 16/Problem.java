import java.util.Scanner;

public class Problem {

    //Q) Elephant
    // An elephant lives at point 0 and wants to reach his friend’s house at point
    // x. He can move 1 to 5 steps at a time. The problem asks for the minimum
    // number of steps required, which is simply the ceiling of x/5.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int steps = (n + 4) / 5;
        System.out.println(steps);
    }
}
