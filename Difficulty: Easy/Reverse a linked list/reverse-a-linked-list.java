// function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    Node reverseList(Node head) {
        Node Current=head;
        Node Prev=null;
        Node Next;
        while(Current!=null){
            Next=Current.next;
            Current.next=Prev;
            Prev=Current;
            Current=Next;
            
        }
        
        return Prev;
        
    }
}