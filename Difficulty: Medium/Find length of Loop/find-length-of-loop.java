/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        HashSet<Node> nodes=new HashSet<>();
        Node curr=head;
        boolean circle=false;
        Node start=null;
        while(curr!=null){
            if(nodes.contains(curr)){
                circle=true;
                start=curr;
                break;
                
            }else{
                nodes.add(curr);
            }
            curr=curr.next;
        }
        if(!circle){
            return 0;
        }
        
        Node temp=start;
        int len=0;
        while(temp.next!=start){
            temp=temp.next;
            len++;
        }
        
        
        return len+1;
    }
}