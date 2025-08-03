import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+') {
                continue;
            }
            arr.add(Character.getNumericValue(str.charAt(i)));
        }
        arr.sort((a,b)->a-b);
        for(int i = 0; i<arr.size()-1;i++){
            System.out.print(arr.get(i)+"+");
        }
        System.out.println(arr.get(arr.size()-1));
        sc.close();
    }
}
