class Solution {
    // Function to insert a node in a BST.
    
    void findOrInsert(Node curr,int key){
        if(curr.data==key){
            return ;
        }
        if(key<curr.data){
            if(curr.left==null){
                curr.left=new Node(key);
                return ;
            }
            findOrInsert(curr.left,key);
        }
        if(key>curr.data){
            if(curr.right==null){
                curr.right=new Node(key);
                return ;
            }
            findOrInsert(curr.right,key);
        }
    }
    
    Node insert(Node root, int Key) {
        findOrInsert(root,Key);
        
        
        return root;
    }
}