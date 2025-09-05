import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        if (isAllUpper(word) || (isAllUpper(word.substring(1)) && Character.isLowerCase(word.charAt(0)))) {
            System.out.println(toggleCase(word));
        } else {
            System.out.println(word);
        }
    }

    static boolean isAllUpper(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) return false;
        }
        return true;
    }

    static String toggleCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else
                sb.append(Character.toUpperCase(c));
        }
        return sb.toString();
    }
}
