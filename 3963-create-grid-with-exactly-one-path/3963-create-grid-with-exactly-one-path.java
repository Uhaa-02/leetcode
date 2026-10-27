class Solution {
    public String[] createGrid(int m, int n) {
        String a[] = new String[m];
        if(m==1){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++) sb.append('.');
            a[0]=sb.toString();
            return a;
        }
        if(n==1){
            for(int i=0;i<m;i++) a[i]=".";
            return a;
        }
        for(int i =0;i<m;i++){
        StringBuilder sb  = new StringBuilder();
         for(int j =0;j<n;j++){
             if(i==0) {
                 if(j<n-1){
                     sb.append('.');
                     
                 }
                 else{
                     sb.append('#');
                 }
             }
           else if(i == m-1){
               if(j >= n-2) sb.append('.');
               else sb.append('#');
           }
             else {
                 if(j==n-2){
                     sb.append('.');
                     
                 }else{
                    
                     sb.append('#');
                 }
             }
         }
            a[i] = sb.toString();
     }   
        return a;
    }
}