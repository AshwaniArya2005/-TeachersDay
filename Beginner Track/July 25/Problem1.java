import java.util.Scanner;

public class Problem1 {
    //Q) Find Numbers with Even Number of Digits
    //Given an array nums of integers, return how many of them contain an even number of digits.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {12,345,2,6,7896};
        
        System.err.println("Numbers with Even Number of Digits are: "+findNumbers(arr));
    }

    static int findNumbers(int[] arr){
        int count= 0;
        for(int num: arr){
            if((String.valueOf(num).length()&1)==0){
                count++;
            }
        }
        return count;
    }
}
