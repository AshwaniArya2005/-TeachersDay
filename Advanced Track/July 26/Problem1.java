import java.util.*;
//Q) Group Anagrams
// Given an array of strings strs, group the anagrams together. You can return the answer in any order.
public class Problem1 {
    static List<List<String>> groupAnagrams(String[] strs){
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
    
        Map<String,List<String>> hm = new HashMap<>();
        for(String s:strs){
            char[]  arr= s.toCharArray();
            Arrays.sort(arr);
            String key =  String.valueOf(arr);

            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(s);
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String,List<String>> e:hm.entrySet()){
            result.add(e.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
