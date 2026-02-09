// Last updated: 09/02/2026, 12:34:40
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
17    public int countNodes(TreeNode root) {
18        return count(root);
19    }
20    public int count(TreeNode root) {
21        if (root == null) return 0;
22        return 1 + count(root.left) + count(root.right);
23    }
24}