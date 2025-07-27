class Solution {
    public void setMatrixZeroes(int[][] mat) {
        Set<Integer> row=new LinkedHashSet<Integer>();
        Set<Integer> col=new LinkedHashSet<Integer>();
        
        int rLen=mat.length;
        int cLen=mat[0].length;
        
        for(int i=0;i<rLen;i++){
            for(int j=0;j<cLen;j++){
                if(mat[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        for(int i:row){
            for(int j=0;j<cLen;j++){
                mat[i][j]=0;
            }
        }
        for(int c:col){
            for(int r=0;r<mat.length;r++){
                mat[r][c]=0;
            }
        }
        
    }
}