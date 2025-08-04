import java.util.Scanner;

public class Problem2 {
    // Q) Word

    // Given a single word consisting of uppercase and lowercase Latin letters,
    // convert the entire word to either all-lowercase or all-uppercase letters, in
    // a way that requires changing as few letters as possible:
        // If the word contains more uppercase letters, convert the whole word to
        // uppercase.
        // Otherwise (if lowercase letters are equal to or more than uppercase), convert
        // the whole word to lowercase.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int Lcount = 0, Ucount = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                Ucount++;
            } else {
                Lcount++;
            }
        }

        if (Lcount > Ucount || Lcount == Ucount) {
            System.out.println(str.toLowerCase());
        } else {
            System.out.println(str.toUpperCase());
        }
    }
}
