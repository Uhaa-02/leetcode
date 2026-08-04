class Solution {
    public int subarraysWithKDistinct(int[] a, int k) {
        return helper(a,k) - helper(a,k-1);
    }
    public int helper(int[] a,int k){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int left =0;
        int count =0;
        for(int right =0;right<a.length;right++){
          mp.put(a[right],mp.getOrDefault(a[right],0)+1);
          while(mp.size()> k){
              mp.put(a[left],mp.get(a[left])-1);
              if(mp.get(a[left])==0) mp.remove(a[left]);
              left++;

          }
          count += right - left + 1;
        }
        return count;
    }
    }
