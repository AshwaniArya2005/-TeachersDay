import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;

        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '4' || str.charAt(i) == '7') {
                count++;
            }
        }
        boolean flag = true;
        String cstr = String.valueOf(count);
        for (int i = 0; i < cstr.length(); i++) {
            if (cstr.charAt(i) != '4' && cstr.charAt(i) != '7') {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
