class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int[] a = new int[2]; 
        int n = numbers.length;
        int end = n -  1;
        int start = 0;
        while(start < end){
            int sum = numbers[start] + numbers[end];
            if(sum == target) return new int[]{start + 1, end + 1};
            else if(sum<target) start++;
            else if(sum > target) end--;
        }
        return new int[]{-1,-1};
    }
}