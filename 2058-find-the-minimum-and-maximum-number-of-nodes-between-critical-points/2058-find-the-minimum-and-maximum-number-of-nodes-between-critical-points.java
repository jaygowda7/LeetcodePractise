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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int min=100000,i=1;
        int fi=0,la=0;
        ListNode pre=head,cur=head.next,nxt=head.next.next;
        while(nxt!=null){
            if(isCrit(pre,cur,nxt)){
                if(fi==0) fi=i;
                else min=Math.min(min,i-la);
                la=i;
            }
            pre=cur;cur=cur.next;
            nxt=nxt.next;i++;
        }
        if(fi==la) return new int[]{-1,-1};
        return new int[]{min,la-fi};
        
    }
    boolean isCrit(ListNode a,ListNode b,ListNode c){
        return (b.val>a.val&&b.val>c.val) || (b.val<a.val&&b.val<c.val);
    }
}