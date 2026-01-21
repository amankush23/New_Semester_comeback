// Last updated: 21/01/2026, 11:59:52
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
    public static void inorder(ArrayList<Integer>l,TreeNode root){
        if(root==null){
            return;
        }
        inorder(l,root.left);
        l.add(root.val);
        inorder(l,root.right);
    }
    public int minDiffInBST(TreeNode root) {
        if(root==null||(root.right==null&&root.left==null)){
            return 0;
        }
        ArrayList<Integer>l=new ArrayList<>();
        inorder(l,root);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<l.size();i++){
            int diff=l.get(i)-l.get(i-1);
            if(diff<min){
                min=diff;
            }
        }
        return min;
    }
}