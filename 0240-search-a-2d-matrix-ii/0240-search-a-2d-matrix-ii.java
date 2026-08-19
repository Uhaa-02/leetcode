class Solution {
    public boolean searchMatrix(int[][] a, int key) {
       // boolean found = false;
        int r = 0, c = a[0].length-1;
        while(r< a.length && c >=0){
            if(a[r][c] == key) return true;
            else if(a[r][c] < key) r++;
            else c--;
        }
        return false;
    }
}