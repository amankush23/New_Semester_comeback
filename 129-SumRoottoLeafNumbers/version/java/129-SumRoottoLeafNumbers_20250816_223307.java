// Last updated: 8/16/2025, 10:33:07 PM
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
    public int sumNumbers(TreeNode root) {
        return sumNum(root,0);
    }
    public int sumNum(TreeNode root, int sum){
        if(root == null) return 0;
        
        sum = sum * 10 + root.val;
        
        if(root.left == null && root.right == null){
            return sum;
        } 
        return sumNum(root.left, sum) + sumNum(root.right, sum);
    }
}