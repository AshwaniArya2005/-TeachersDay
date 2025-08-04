import java.util.Scanner;

public class Problem {
    // Q) String Task
    // Given a string of Latin letters (both uppercase and lowercase):
    // Delete all the vowels (A, O, Y, E, U, I, and their lowercase equivalents).
    // For each remaining letter (i.e., consonant), prepend a dot ('.') before it.
    // Change all consonants to lowercase.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();

        for (char ch : str.toCharArray()) {
            if ("aoyeui".indexOf(ch) == -1) {
                System.out.print("." + ch);
            }
        }
    }
}
