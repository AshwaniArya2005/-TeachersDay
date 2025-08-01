import java.util.*;
public class Problem {

    //Q)Roman to Integer
    //Given a roman numeral, convert it to an integer.

    public int romanToInt(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int result = 0;
        for(int i = 0; i<s.length();i++){
            int curr = hm.get(s.charAt(i));
            int next = 0;
            if(i<s.length()-1){
                next = hm.get(s.charAt(i+1));
            }
            if(curr < next){
                result -= curr;
            }else{
                result += curr;
            }
        }
        return result;
    }
}
