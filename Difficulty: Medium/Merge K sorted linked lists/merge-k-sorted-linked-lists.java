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
    Node head=null;
    Node tail=null;
    void adder(int n){
        Node curr=new Node(n);
        if(head==null){
            head=curr;
            return;
        }if(tail==null){
            tail=curr;
            head.next=tail;
            return;
        }
        tail.next=curr;
        tail=curr;
        
    }
    Node mergeKLists(Node[] arr) {
    List<Integer> lst=new LinkedList<Integer>();
    for(Node temp:arr){
        Node curr=temp;
        while(curr!=null){
            lst.add(curr.data);
            curr=curr.next;
        }
    }
        Collections.sort(lst);
        for(int i:lst){
            adder(i);
        }
        
        
        return head;
    }
}