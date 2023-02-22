/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode abc = new ListNode(0);
        ListNode def = abc;
        int  ghi = 0;
        while (l1 != null || l2!=null || ghi!=0)
        {
            int x=(l1!=null)? l1.val:0;
            int y=(l2!=null)? l2.val:0;
            int sum = ghi + x + y;
            ghi =sum/10;
            def.next= new ListNode(sum%10);
            def = def.next;
            if(l1 !=null)
            l1=l1.next;
            if(l2 !=null)
            l2=l2.next;
        }
        return abc.next;
    }
}