public class Problem1 {
    // Maximum Subarray
    // Statement: Given an integer array nums, find the subarray with the largest sum, and return its sum.
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
