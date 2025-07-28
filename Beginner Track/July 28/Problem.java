import java.util.*;
public class Problem {
    // Q) Two Sum
    // Given an array of integers nums and an integer target, return indices of the
    // two numbers such that they add up to target.

    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < length; i++) {
            int comp = target - nums[i];
            if (hm.containsKey(comp)) {
                return new int[] { hm.get(comp), i };
            }
            hm.put(nums[i], i);
        }
        return new int[] {};
    }
}
