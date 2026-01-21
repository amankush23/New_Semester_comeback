// Last updated: 21/01/2026, 11:56:55
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
    public ListNode removeNodes(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nn = curr.next;
            curr.next = prev;
            prev= curr;
            curr = nn;
        }
        ListNode newHead = new ListNode(prev.val);
        int maxVal = newHead.val;
        curr = prev.next;
        while(curr!= null){

            if(curr.val>=maxVal){
                ListNode node = new ListNode(curr.val);
                node.next = newHead;
                newHead = node;
                maxVal = node.val;
            }
                curr = curr.next;
        }
            return newHead;
        }
}