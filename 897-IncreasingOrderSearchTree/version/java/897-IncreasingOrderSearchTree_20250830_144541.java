// Last updated: 8/30/2025, 2:45:41 PM
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
    TreeNode newRoot = new TreeNode(0);
    TreeNode current = newRoot;
    public TreeNode increasingBST(TreeNode root) {
        inOrder(root);
        return newRoot.right;
    }

    public void inOrder(TreeNode node){
        if(node == null) return;
        inOrder(node.left);

        TreeNode newNode = new TreeNode(node.val);
        current.right = newNode;
        current = current.right;

        inOrder(node.right);
    }
}