// Last updated: 21/01/2026, 11:59:28
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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(q.peek()!= null){
            TreeNode nn = q.remove();
            q.add(nn.left);
            q.add(nn.right);

        }
        while(!q.isEmpty() && q.peek() == null){
            q.remove();
            
        }
        return q.isEmpty();
    }
}