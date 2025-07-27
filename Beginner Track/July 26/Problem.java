import java.util.ArrayList;
import java.util.List;

//Q) Fizz Buzz
//Given an integer n, return a string array answer (1-indexed) where:
// answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
// answer[i] == "Fizz" if i is divisible by 3.
// answer[i] == "Buzz" if i is divisible by 5.
// answer[i] == i (as a string) if none of the above conditions are true.

public class Problem {
    static List<String> fizzbuzz(int n){
        List<String> lst = new ArrayList<>();
        for(int i =1; i<=n;i++){
            if(i%3==0 && i%5==0){
                lst.add("FizzBuzz");
            }else if(i%3==0){
                lst.add("Fizz");
            }else if(i%5==0){
                lst.add("Buzz");
            }else{
                lst.add(Integer.toString(i));
            }
        }
        return lst;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fizzbuzz(n));
    }
    
}