class Solution {
    
    public int findParent(int[] par,int a){
        if(par[a]==a){
            return a;
        }
        return findParent(par,par[a]);}
        
        public void newPar(int[] par,int a,int b){
            int rootA=findParent(par,a);
            int rootB=findParent(par,b);
            par[rootB]=rootA;
        }
    
    public boolean isCycle(int V, int[][] edges) {
        int[] parent=new int[V];
        for(int i=1;i<V;i++){
            parent[i]=i;
        }
   

        for(int i=0;i<edges.length;i++){
             int a=edges[i][0];
             int b=edges[i][1];
             if(findParent(parent,a)!=findParent(parent,b)){
                 newPar(parent,a,b);
             }else{
                 
                 return true;
             }
            
         }
        
        
        return false;
        
        
    }
}