// Last updated: 09/02/2026, 12:14:29
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
17    public boolean isSymmetric(TreeNode root) {
18        if(root == null) return true;
19        return solve(root.left, root.right);
20    }
21    public boolean solve(TreeNode root1, TreeNode root2){
22        if(root1 == null && root2 == null) return true;
23        if(root1 == null || root2 == null) return false;
24        if(root1.val != root2.val){
25            return false;
26        }
27        boolean left = solve(root1.left, root2.right);
28        boolean right = solve(root1.right, root2.left);
29        return left && right;
30    }
31}