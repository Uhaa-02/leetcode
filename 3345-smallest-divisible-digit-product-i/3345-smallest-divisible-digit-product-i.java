class Solution {
    public int smallestNumber(int n, int t) {
        int ans = 0;
        for(int i = n;i<=100;i++){
          if(helper(i) % t == 0) return i;
        }
        return -1;
    }
    private int helper(int n){
        int prod = 1;
        while(n > 0){
            prod *= (n % 10);
            n /= 10;
        }
        return prod;
    }
}