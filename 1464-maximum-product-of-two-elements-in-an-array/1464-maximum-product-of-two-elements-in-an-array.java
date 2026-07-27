class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
         int max1 = 0, max2 = max1;
        // for(int i =1;i<n;i++){
        //     if(nums[i]>max1){
        //         max2 = max1;
        //         max1 = nums[i];
        //     }else if (nums[i] == max1) max2 = max1;
        // }
        Arrays.sort(nums);
        for(int i =0;i<n;i++){
            max1 = nums[n-1];
            max2 = nums[n-2];
        }
        return (max1 -1)* (max2-1);
    }
}