class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int maxSize = 0;
        int flip = k;
        for(int right = 0;right<n;right++){
            //here right acts the window's right boundary and left acts the window's left boundary
            if(nums[right]== 1 ) {
                //no need to do anything.. since the for loop automatically increases the right boundary
            }
            else if(nums[right]== 0){
                flip--;
            }
            //if the flips becomes -1, we trigger this loop
            while(flip <0)
            {
                //if the left most boundary nmber is zero then we re-claim a flip and increase the left boundary..it means we are removing the left boundary element
                if(nums[left]==0){
                    flip++;
                }
                left++;
            }

             maxSize = Math.max(maxSize, right - left + 1);
        }
        
        
        return maxSize;
    }
}