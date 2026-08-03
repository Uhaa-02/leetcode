import java.util.HashMap;
import java.util.Map;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long windowSum = 0;
        long maxSum = 0;
        
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            // 1. Add current element to window
            windowSum += nums[i];
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);

            // 2. Remove left element if window size exceeds k
            if (i >= k) {
                int leftVal = nums[i - k];
                windowSum -= leftVal;
                freqMap.put(leftVal, freqMap.get(leftVal) - 1);
                if (freqMap.get(leftVal) == 0) {
                    freqMap.remove(leftVal);
                }
            }

            // 3. If window size is k and all k elements are distinct
            if (i >= k - 1 && freqMap.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}