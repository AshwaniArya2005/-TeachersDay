import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        // Q) Word Capitalization
        // Capitalization is writing a word with its first letter as a capital letter.
        // Your task is to capitalize the given word.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        if (Character.isUpperCase(arr[0])) {
            System.out.println(str);
        } else {
            arr[0] = Character.toUpperCase(arr[0]);
            System.out.println(String.valueOf(arr));
        }
    }
}
