class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length() , j =0;
        int[] a = new int[26];
        char[] ch = s.toCharArray();
        for(int i =0;i<n >>1;i++){
            a[(ch[i] & 31) - 1 ]++;

        }
        for(int i =0;i<26;
        i++){
            while(a[i]-- > 0){
                ch[j] = (char) (97 + i);
                ch[n-1-j++] = (char) (97 + i);
            }
        }
        return new String(ch);
    }
}