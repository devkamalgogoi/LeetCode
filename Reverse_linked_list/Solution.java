package Reverse_linked_list;

class Solution {
    public ListNode reverseList(ListNode head) {
            
        return reverseLink( null, head);
    }
    
    private ListNode reverseLink( ListNode prev, ListNode cur){
        
        if( cur == null ){
            // Base case aka stop condition
            return prev;
        }

        // General cases:

        // backup original next node
        ListNode nextNode = cur.next;

        // reverse current node
        cur.next = prev;

        // reverse next node recursively
        return reverseLink( cur, nextNode);        
        
    }

}