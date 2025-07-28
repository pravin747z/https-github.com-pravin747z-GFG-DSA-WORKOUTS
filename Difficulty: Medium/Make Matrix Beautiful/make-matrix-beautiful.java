class Solution {
    public static int balanceSums(int[][] mat) {
        int[] row=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[0].length;j++){
                sum+=mat[i][j];
            }
            row[i]=sum;
        }
        int[] col=new int[mat.length];
        for(int i=0;i<mat[0].length;i++){
            int sum=0;
            for(int j=0;j<mat.length;j++){
                sum+=mat[j][i];
            }
            col[i]=sum;}
            
        int cMax=col[0];
        for(int i:col){
            if(i>cMax)
                cMax=i;
        }
        int max=row[0];
        for(int i:row){
            if(i>max){
                max=i;
            }
        }
        int step=0;
        max=Math.max(max,cMax);
        for(int i:row){
            step+=(max-i);
        }
        
        return step;
    }
}