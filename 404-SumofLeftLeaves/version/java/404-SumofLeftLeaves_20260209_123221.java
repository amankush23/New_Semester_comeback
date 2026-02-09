// Last updated: 09/02/2026, 12:32:21
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
17    public int sumOfLeftLeaves(TreeNode root) {
18        return find(root, false);
19    }
20    public int find(TreeNode root, boolean isLeft){
21        if(root == null) return 0;
22        if(root.left == null && root.right == null && isLeft == true){
23            return root.val;
24        }
25        int left = find(root.left, true);
26        int right = find(root.right, false);
27        return left+right;
28    }
29}