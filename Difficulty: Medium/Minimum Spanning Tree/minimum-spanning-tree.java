import java.util.*;


class Edge implements Comparable<Edge>{
    int u,v,w;
    
    Edge(int u,int v, int w){
        this.u=u;
        this.v=v;
        this.w=w;
    }
    
    public int compareTo(Edge others){
        return this.w-others.w;
    }
} 

class Operation{
    public int findParent(int[]parent,int x){
        if(parent[x]==x){
            return x;
        }else{
            return findParent(parent,parent[x]);
        }
    }
    
    
    public void union(int[] parent,int x , int y){
        int rootA=findParent(parent,x);
        int rootB=findParent(parent,y);
        parent[rootA]=rootB;
    }
}

class Solution {
    
    
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        Operation op=new Operation();
        List<Edge> edges=new ArrayList<Edge>();
        
        for(int i=0;i<V;i++){
            for(int[] arr:adj.get(i)){
                edges.add(new Edge(i,arr[0],arr[1]));
            
            }
        }
        Collections.sort(edges);
        
        int[] parent=new int[V];
        for(int i=0;i<V;i++)parent[i]=i;
        int MSP=0;
        
        for(Edge e:edges){
            if(op.findParent(parent,e.u)!=op.findParent(parent,e.v)){
                op.union(parent,e.u,e.v);
                MSP+=e.w;
            }
        }
        
            
        
        return MSP;
    }
}