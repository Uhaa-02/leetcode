class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int windowSize = 0;
        int maxOnes = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]== 1) windowSize++;
            else windowSize =0;
            maxOnes = Math.max(maxOnes, windowSize);
        }
        return maxOnes;
    }
}