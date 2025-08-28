// Last updated: 8/28/2025, 11:13:47 PM
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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
            return sortedToBst(head);
    }
    public TreeNode sortedToBst(ListNode head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return new TreeNode(head.val);
        }
        ListNode slow=head;
        ListNode fast= head;
        ListNode mid= slow;

        while(fast!=null && fast.next!=null){
            mid =slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode nn = new TreeNode(slow.val);
        mid.next = null;
        nn.left = sortedToBst(head);
        nn.right = sortedToBst(slow.next);
        return nn;

        
    }
    

}