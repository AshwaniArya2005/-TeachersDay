import java.util.*;

public class Problem2 {

    // Q) Way Too Long Words
    // Given a list of words, any word longer than 10 characters should be
    // abbreviated by keeping its first and last letter, and replacing the middle
    // section with the count of its omitted characters. For example:
        // "localization" becomes "l10n"
        // "internationalization" becomes "i18n"
    // Words with 10 or fewer characters remain unchanged.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputcount = sc.nextInt();
        for (int i = 0; i < inputcount; i++) {
            String str = sc.next();
            if (str.length() > 10) {
                System.out.println("" + str.charAt(0) + (str.length() - 2) + "" + str.charAt(str.length() - 1));
            } else {
                System.out.println(str);
            }
        }

    }
}
