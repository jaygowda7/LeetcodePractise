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
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int car=0;
        while(l1!=null || l2!=null || car!=0){
            int x= l1!=null?l1.val:0;
            int y= l2!=null?l2.val:0;

            int sum = x+y+car;
            int digit=sum%10;
            car=sum/10;

            current.next=new ListNode(digit);
            current=current.next;

            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        return dummy.next;
    }
}