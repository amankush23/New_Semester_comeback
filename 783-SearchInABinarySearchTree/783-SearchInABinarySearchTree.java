// Last updated: 21/01/2026, 11:59:54
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     P(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
    
        if (root == null || root.val == val) {
            return root;
        }

        
        if (val < root.val) {
            return searchBST(root.left, val);
        } 
        
        else {
            return searchBST(root.right, val);
        }
    }
}