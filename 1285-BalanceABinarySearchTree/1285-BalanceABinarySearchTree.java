// Last updated: 21/01/2026, 11:58:59
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
    List<TreeNode> sortedArr= new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return Create_Tree(0, sortedArr.size()-1);
        
    }
    void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        sortedArr.add(root);
        inorder(root.right);
    }
    TreeNode Create_Tree(int si, int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        TreeNode nn = sortedArr.get(mid);
        nn.left=Create_Tree(si, mid-1);
        nn.right= Create_Tree(mid+1, ei);
        return nn;

    }
}