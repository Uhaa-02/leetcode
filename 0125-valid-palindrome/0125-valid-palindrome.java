class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)) 
                sb.append(Character.toLowerCase(c));
        }
        return checkPalindrome(sb.toString());
    }
    public boolean checkPalindrome(String s){
        int n = s.length();
        int l = 0;
        int r = n-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}