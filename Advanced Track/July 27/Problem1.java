import java.util.*;

public class Problem1 {

    // Q) Top K Frequent Elements
    // Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] lst = new List[nums.length + 1];
        Map<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (int key : hm.keySet()) {
            int freq = hm.get(key);
            if (lst[freq] == null) {
                lst[freq] = new ArrayList<>();
            }
            lst[freq].add(key);
        }

        int[] result = new int[k];
        int count = 0;

        for (int i = lst.length - 1; i >= 0 && count < k; i--) {
            if (lst[i] != null) {
                for (Integer integer : lst[i]) {
                    result[count++] = integer;

                }
            }
        }
        return result;
    }
}
