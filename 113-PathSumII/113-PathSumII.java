// Last updated: 8/21/2025, 6:44:44 PM
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans  = new ArrayList<>();
        Sum(root, targetSum,new ArrayList<>(), ans);
        return ans;
    }
    private void Sum(TreeNode root, int sum, List<Integer> path, List<List<Integer>> result){
        if(root == null) return;
        path.add(root.val);
        
        if(root.left == null && root.right == null && sum == root.val){result.add(new ArrayList<>(path));}
        Sum(root.left, sum-root.val, path, result);
        Sum(root.right, sum-root.val, path, result);
        path.remove(path.size() - 1);
    }
    
}