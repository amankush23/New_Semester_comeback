// Last updated: 10/02/2026, 10:51:50
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isBalanced(TreeNode root) {
18        if (root == null) return true;
19        if(Math.abs(height(root.left)-height(root.right))> 1) return false;
20        return isBalanced(root.left) && isBalanced(root.right);
21    }
22    public int height(TreeNode root){
23        if(root == null){
24            return 0;
25        }
26        return Math.max(height(root.left), height(root.right))+1;
27    }
28}