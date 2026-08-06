class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        int cur = 0, ans=0;
        for(int n : nums){
            cur += n;
            int diff = cur - k;
            if(mp.containsKey(diff))
                ans += mp.get(diff);
            mp.put(cur,mp.getOrDefault(cur,0)+1);

        }
    return ans;
    }
}