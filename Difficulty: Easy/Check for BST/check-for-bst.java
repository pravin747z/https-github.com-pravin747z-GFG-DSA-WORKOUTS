class Solution {
    
    List<Integer> lst=new LinkedList<Integer>();
    int step=0;
    
    public void inOrder(Node curr){
        if(curr==null){
            return ;
        }
        inOrder(curr.left);
        lst.add(curr.data);
        inOrder(curr.right);
        }
    
    
    boolean isBST(Node root) {
    
        inOrder(root);
        
        for(int i=1;i<lst.size();i++){
            if(lst.get(i)<=lst.get(i-1)){
                return false;
            }
        }
        
        return true;
    }
}