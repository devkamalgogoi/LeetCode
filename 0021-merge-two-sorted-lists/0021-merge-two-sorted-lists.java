class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode temp = new ListNode(0);
        ListNode returnhead = temp;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1!=null)temp.next=l1;
        if(l2!=null)temp.next=l2;
        return returnhead.next;   
    }
}