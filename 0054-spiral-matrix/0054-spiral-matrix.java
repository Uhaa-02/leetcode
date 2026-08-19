class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> l = new ArrayList<>();
        if(a==null || a.length==0) return l;
        int startRow = 0, startCol = 0, endRow = a.length - 1, endCol = a[0].length - 1;
        while(startRow <= endRow && startCol <= endCol){
            //top (only column)
            for(int j = startCol; j<=endCol;j++){
                l.add(a[startRow][j]);
            }
            //right(only row)
            for(int i = startRow + 1;i<=endRow;i++){
                l.add(a[i][endCol]);
            }
            //bottom
            for(int j = endCol - 1; j >= startCol;j--){
              if(startRow == endRow) break;
                l.add(a[endRow][j]);
            }
            //left
            for(int i = endRow - 1; i>startRow;i--){
               if(startCol == endCol) break;
                l.add(a[i][startCol]);
            }
            startCol++; startRow++; endRow--; endCol--;
        }
        return l;
    }
}