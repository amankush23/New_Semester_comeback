// Last updated: 8/30/2025, 2:33:12 PM
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