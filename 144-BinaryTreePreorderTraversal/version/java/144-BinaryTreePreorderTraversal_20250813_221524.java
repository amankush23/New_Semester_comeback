// Last updated: 8/13/2025, 10:15:24 PM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(res, root);
        return res;
    }
    public void dfs(List<Integer> res, TreeNode root){
        if(root != null){
            res.add(root.val);
            if(root.left != null){
                dfs(res, root.left);
            }
            if(root.right != null){
                dfs(res, root.right);
            }
        }
    }
}