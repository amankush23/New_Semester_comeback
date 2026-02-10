// Last updated: 10/02/2026, 10:40:07
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
17    public boolean isUnivalTree(TreeNode root) {
18        if(root == null) return true;
19        int val=root.val;
20        return isUnival(root, val);
21    }
22    public boolean isUnival(TreeNode root, int val){
23        if(root == null) return true;
24        if(root.val != val) return false;
25
26        return isUnival(root.left, val) && isUnival(root.right, val);
27    }
28}