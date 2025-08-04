// Last updated: 8/4/2025, 11:12:42 PM
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while(a!=b){
            if(a == null){
                a = headB;

            }
            else{
                a = a.next;
            }
            if(b == null){
                b = headA;
            }
            else{
                b = b.next;
            }
        }
        return a;
    }
}